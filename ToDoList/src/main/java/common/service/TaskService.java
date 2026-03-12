package common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import common.entity.Task;
import common.mapper.TaskMapper;

@Service
public class TaskService {

    private final TaskMapper taskMapper;

    public TaskService(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    public List<Task> getTasksByUsername(String username) {
        return taskMapper.findByUsername(username);
    }
    
    public void insertTask(Task task) {
    	taskMapper.insertTask(task);
    }
    
    public Task findById(int id) {
    	return taskMapper.findById(id);
    }
    
    public void update(Task task) {
    	taskMapper.update(task);
    }
    
    
}
