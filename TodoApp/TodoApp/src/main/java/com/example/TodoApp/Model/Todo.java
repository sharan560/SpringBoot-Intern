package com.example.TodoApp.Model;

public class Todo {

    private int taskid;
    private String task;
    private String TaskStatus;

    public Todo(int taskid,String task, String taskStatus) {
        this.taskid = taskid;
        this.task = task;
        this.TaskStatus = taskStatus;


    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        TaskStatus = taskStatus;
    }

}
