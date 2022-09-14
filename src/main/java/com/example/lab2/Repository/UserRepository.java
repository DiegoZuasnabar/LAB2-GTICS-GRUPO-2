package com.example.lab2.Repository;

import com.example.lab2.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "Select * from user where email = ?1",
            nativeQuery = true)
    List<User> buscarporUsername(String username);
}
