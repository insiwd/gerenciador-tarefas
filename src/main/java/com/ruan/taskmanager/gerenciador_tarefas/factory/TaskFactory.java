package com.ruan.taskmanager.gerenciador_tarefas.factory;

import com.ruan.taskmanager.gerenciador_tarefas.entities.Task;

public class TaskFactory {
    public static Task createTask(String description, boolean completed) {
        Task task = new Task();
        task.setDescricao(description);
        task.setCompleta(completed);
        return task;
    }
}
