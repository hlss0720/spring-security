package com.hlss.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hlss.security.domain.SystemUser;

public interface SystemUserRepository extends JpaRepository<SystemUser, Long> {
	SystemUser findByUsername(String username);
}
