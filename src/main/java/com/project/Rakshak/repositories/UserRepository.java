package com.project.Rakshak.repositories;

import com.project.Rakshak.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "SELECT * FROM users WHERE users.username=:username",nativeQuery = true)
    Optional<User> findByUsername(String username);
}
