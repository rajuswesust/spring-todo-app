package com.raju.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

//Database (MySQL)
//Static List of todos => Database(H2, MySQL)

//JPA
//Bean -> Database Table

@Entity(name="TodoABC")
public class Todo {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String userName;
	
	@Size(min=10, message="Enter Atleast 10 Characters")
	private String description;

	private LocalDate targetDate;
	private boolean done;

	public Todo() {
		
	}
	public Todo(int id, String userName, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + userName + ", description=" + description + ", tsrgetDate="
				+ targetDate + ", done=" + done + "]";
	}

}
