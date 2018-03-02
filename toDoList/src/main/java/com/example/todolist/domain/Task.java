package com.example.todolist.domain;


import javax.persistence.*;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String subject;
	private String content;
	private String status;

	public Long getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String getStatus() {
		return status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
