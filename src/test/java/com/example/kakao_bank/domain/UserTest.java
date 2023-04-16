package com.example.kakao_bank.domain;

import com.example.kakao_bank.repository.KakaojpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.data.ldap.DataLdapTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserTest {

    @Autowired
    private KakaojpaRepository kakaojpaRepository;

    @Test
    public void 유저테스트(){



        String name = "jueun";
        String email = "email";

        User user = User.builder()
                .name(name)
                .email(email)
                .build();

        kakaojpaRepository.save(user);
        User confirmUser = kakaojpaRepository.findByEmail(email);
    }
}
