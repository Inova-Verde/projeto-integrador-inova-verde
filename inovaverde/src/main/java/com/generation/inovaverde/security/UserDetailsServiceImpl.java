package com.generation.inovaverde.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.generation.inovaverde.model.Usuario;
import com.generation.inovaverde.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{


	private UsuarioRepository usuarioRepository;
	
	@Transactional
    public void addClient(Usuario usuario){
        usuarioRepository.saveAndFlush(usuario);
    }
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioRepository.findUsuarioByUsuario(userName);
		
		if(usuario.isPresent())
			return new UserDetailsImpl(usuario.get());
		else
			throw new ResponseStatusException(HttpStatus.FORBIDDEN);
	}
}