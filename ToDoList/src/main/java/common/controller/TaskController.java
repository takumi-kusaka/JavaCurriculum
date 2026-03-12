package common.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import common.entity.Task;
import common.service.TaskService;
import jakarta.servlet.http.HttpSession;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/list")
    public String list(Model model, HttpSession session) {

        String username = (String) session.getAttribute("loginUsername");

        List<Task> tasks = taskService.getTasksByUsername(username);

        model.addAttribute("tasks", tasks);

        return "list";
    }
    
    @GetMapping("/new")
    public String newTask() {
    	return "form-new";
    }
    
    @PostMapping("/tasks")
    public String inserttasks(
    		@RequestParam String title,
    		@RequestParam String content,
    		@RequestParam String username,
    		@RequestParam String startDate,
    		@RequestParam String endDate) {
    	Task task = new Task();
    	task.setTitle(title);
    	task.setContent(content);
    	task.setUsername(username);
    	task.setStartDate(LocalDate.parse(startDate));
    	task.setEndDate(LocalDate.parse(endDate));
    	
    	taskService.insertTask(task);
    	
    	return "redirect:/list";
    	
    }
    
    @GetMapping("/edit")
    public String edit(@RequestParam("id") int id, Model model) {
    	Task task = taskService.findById(id);
    	model.addAttribute("task", task);
    	return "form-edit";
    }
    @PostMapping("/update")
    public String update(Task task) {
    	taskService.update(task);
    	return "redirect:/list";
    }
    
    
}