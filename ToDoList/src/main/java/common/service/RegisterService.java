package common.service;

import org.springframework.stereotype.Service;

import common.entity.Login;
import common.mapper.RegisterMapper;

@Service
public class RegisterService {
	
	private final RegisterMapper registerMapper;
	
	public RegisterService(RegisterMapper registerMapper) {
		this.registerMapper = registerMapper;
	}
	
	public void register(Login login) {
		registerMapper.insertUser(login);
	}
}
