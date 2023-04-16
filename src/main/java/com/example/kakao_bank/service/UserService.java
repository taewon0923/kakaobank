package com.example.kakao_bank.service;

import com.example.kakao_bank.domain.User;
import com.example.kakao_bank.repository.KakaojpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public class UserService {
    @Service
    @Transactional
    public class AuthorService {
        private final KakaojpaRepository kakaojpaRepository;
        @Autowired
        public AuthorService(KakaojpaRepository kakaojpaRepository){
            this.kakaojpaRepository=kakaojpaRepository;
        }
        public List<User> findAll(){
            return kakaojpaRepository.findAll();
        }
        public void save(User user) {
            kakaojpaRepository.save(user);
        }
        public User findById(Long id){
            return kakaojpaRepository.findById(id).orElse(null);
        }
        public User findByEmail(String email){
            return kakaojpaRepository.findByEmail(email);}
    }
}
