package com.todo.todoapi.controllers

import com.todo.todoapi.dataAccess.ToDoListRepository
import com.todo.todoapi.domain.ToDoList
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/ToDoList")
class ToDoListController(
    private val repository: ToDoListRepository,
    @Suppress("SpringJavaInjectionPointsAutowiringInspection") private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) {

    @GetMapping
    suspend fun getList(): List<ToDoList> = withContext(dispatcher) { repository.findAll().toList() }

}
