package common.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import common.entity.Login;

@Mapper
public interface RegisterMapper {
	
	@Insert("""
			INSERT INTO login (username, password)
			VAlUES (#{username}, #{password})
			""")
	void insertUser(Login login);
}
