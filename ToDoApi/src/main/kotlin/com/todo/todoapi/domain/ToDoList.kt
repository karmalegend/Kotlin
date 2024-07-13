package com.todo.todoapi.domain

import jakarta.persistence.*

@Entity
data class ToDoList(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,
    
    // seems like kotlin doesn't have a way to negate magic strings here?
    @OneToMany(mappedBy = "toDoList", cascade = [CascadeType.ALL], orphanRemoval = true)
    var items: MutableList<ToDoItem>? = mutableListOf()
)
