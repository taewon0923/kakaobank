package com.example.kakao_bank.repository;

import com.example.kakao_bank.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface KakaojpaRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
