package common.service;

import org.springframework.stereotype.Service;

import common.mapper.LoginMapper;

@Service
public class LoginService {

    private final LoginMapper loginMapper;

    public LoginService(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public boolean loginCheck(String username, String password) {
        return loginMapper.existsByUsernameAndPassword(username, password) > 0;
    }
    
}
