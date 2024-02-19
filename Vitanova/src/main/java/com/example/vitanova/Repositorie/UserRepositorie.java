package com.example.vitanova.Repositorie;

import com.example.vitanova.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositorie extends JpaRepository<User,Long> {
}
