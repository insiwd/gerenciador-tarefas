package com.ruan.taskmanager.gerenciador_tarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruan.taskmanager.gerenciador_tarefas.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
