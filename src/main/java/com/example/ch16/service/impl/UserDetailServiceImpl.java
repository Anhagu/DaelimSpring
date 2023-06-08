package com.example.ch16.service.impl;

import com.example.ch16.repository.UserRepository;
import com.example.ch16.service.UserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service // 클래스를 서비스 빈으로 등록해줌
@RequiredArgsConstructor // 필수 매개변수를 생성자에다 만들어준다
public class UserDetailServiceImpl implements UserDetailService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { // 메소드
        return userRepository.getByUid(username); //
    }
}
