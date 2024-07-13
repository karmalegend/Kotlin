package com.todo.todoapi.dataAccess

import com.todo.todoapi.domain.ToDoList
import org.springframework.data.jpa.repository.JpaRepository

interface ToDoListRepository: JpaRepository<ToDoList,Long>{
}
