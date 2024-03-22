package com.rehan.demo;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserRepository extends JpaRepository<users,Integer> {
    @Query("SELECT u FROM users u WHERE u.username = :username")
    users findByUsername(@Param("username") String username);


    @Transactional
    @Modifying
    @Query("INSERT INTO users(username, password_hash) VALUES (:username, :password)")
    void addUser(@Param("username") String username, @Param("password") String password);
}
