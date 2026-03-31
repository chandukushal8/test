package com.chandu.userform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chandu.userform.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}
