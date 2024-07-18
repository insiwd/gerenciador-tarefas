package com.ruan.taskmanager.gerenciador_tarefas.service;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long id) {
        super("task not found with id: " + id);
    }

}
