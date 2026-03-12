package common.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    @Select("""
        SELECT COUNT(*)
        FROM login
        WHERE username = #{username}
          AND password = #{password}
    """)
    int existsByUsernameAndPassword(@Param("username") String username,
                                    @Param("password") String password);
}