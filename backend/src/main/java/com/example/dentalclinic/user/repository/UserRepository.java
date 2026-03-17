package com.example.dentalclinic.user.repository;

import com.example.dentalclinic.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
