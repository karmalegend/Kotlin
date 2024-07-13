package com.todo.todoapi.domain

import jakarta.persistence.*

@Entity
data class ToDoListUser( // hibernate can't handle it if we just call it user which feels odd.
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,
    
    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    var toDoList: MutableList<ToDoList>? = mutableListOf()
) {
}
