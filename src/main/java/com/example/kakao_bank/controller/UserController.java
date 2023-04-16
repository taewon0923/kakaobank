package com.example.kakao_bank.controller;

import com.example.kakao_bank.domain.User;
import com.example.kakao_bank.domain.UserDto;
import com.example.kakao_bank.repository.KakaojpaRepository;
import com.example.kakao_bank.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    private UserService userService;
    private KakaojpaRepository kakaojpaRepository;


    public UserController(UserService userService, UserDto userDto) {
        this.userService = userService;

    }

    @ResponseBody
    @PostMapping("/create")
     public String create(@RequestBody UserDto userDto){
         User user=User.builder()
              .name(userDto.getName())
              .email(userDto.getEmail())
              .build();
        kakaojpaRepository.save(user);
            return "redirect:/";
        }
    }



