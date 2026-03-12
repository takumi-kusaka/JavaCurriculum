package common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import common.entity.Task;


@Mapper
public interface TaskMapper {

	@Select("""
	        SELECT
	            id,
	            username,
	            title,
	            content,
	            name,
	            
	           start_date AS startDate,
        end_date AS endDate,
        created_at AS createdAt,
        updated_at AS updatedAt
	            
	            
	        FROM tasks
	        WHERE username = #{username}
	        ORDER BY id
	        """)
	    List<Task> findByUsername(@Param("username") String username);
	
	

	@Insert("""
			INSERT INTO tasks
			(username, title, content, start_date, end_date)
			VALUES
			(#{username}, #{title}, #{content}, #{startDate}, #{endDate})
			""")
	void insertTask(Task task);

	
	@Select("SELECT id, title, content, username, start_date, end_date FROM tasks WHERE id = #{id}")
	Task findById(int id);
	
	
	@Update("""
			UPDATE tasks
    SET
        title = #{title},
        content = #{content},
        username = #{username},
        start_date = #{startDate},
        end_date = #{endDate}
    WHERE id = #{id}
			""")
	void update(Task task);
}

