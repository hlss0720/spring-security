package com.hlss.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hlss.security.dao.SystemUserRepository;
import com.hlss.security.domain.SystemUser;

@Service
public class SystemUserService implements UserDetailsService {

	@Autowired
	SystemUserRepository systemUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SystemUser systemUser = systemUserRepository.findByUsername(username);
		if (null == systemUser) {
			throw new UsernameNotFoundException("用户名不存在");
		}
		return systemUser;
	}

}
