package com.taskmanager;

public class Task {
	private String description;
	private boolean completed;
	
	public Task(String description) {
		this.description=description;
		this.completed=false;
	}

	public String getDescription() {
		return description;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void markAsCompleted() {
		completed=true;
	}
	@Override
	public String toString() {
		return "[" + (completed ? "completed" : " ") + "]" + description;
	}
}
