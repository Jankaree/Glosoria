package com.example.glosoria.Repository;

import com.example.glosoria.Enteties.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

