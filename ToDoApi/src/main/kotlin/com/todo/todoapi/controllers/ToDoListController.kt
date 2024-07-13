package com.todo.todoapi.controllers

import com.todo.todoapi.dataAccess.ToDoListRepository
import com.todo.todoapi.domain.ToDoList
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/ToDoList")
class ToDoListController(@Autowired private val repository: ToDoListRepository) {
    
    @GetMapping fun getList(): List<ToDoList> = repository.findAll().toList()
    
}
