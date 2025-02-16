package com.oauth2.oauth2_spring_security.service;

import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.oauth2.oauth2_spring_security.entity.User;

@Service
public class UserService {

    public User createUser(OAuth2User oAuth2User){
        User user=new User();
        user.setName(oAuth2User.getAttribute("name"));
        user.setEmail(oAuth2User.getAttribute("email"));

        return user;
    }

}
