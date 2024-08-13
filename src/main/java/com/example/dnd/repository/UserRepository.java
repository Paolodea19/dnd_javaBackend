package com.example.dnd.repository;

import com.example.dnd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
