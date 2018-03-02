package com.example.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.todolist.domain.Task;
import com.example.todolist.repository.TaskRepository;

@RestController
@RequestMapping("/api/v1/todos")
public class TaskController {

	@Autowired
	TaskRepository taskRepository;

	@GetMapping
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	@GetMapping("/{id}")
	public Task getTask(@PathVariable Long id) {
		return taskRepository.getOne(id);
	}

	@PostMapping
	public void addTask(@RequestBody Task task) {
		taskRepository.save(task);
	}

	@PutMapping("/{id}")
	public void updateTask(@PathVariable long id, @RequestBody Task task) {
		Task task1 = taskRepository.getOne(id);
		task1.setSubject(task.getSubject());
		task1.setContent(task.getContent());
		task1.setStatus(task.getStatus());
		taskRepository.save(task1);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		taskRepository.deleteById(id);
	}

}