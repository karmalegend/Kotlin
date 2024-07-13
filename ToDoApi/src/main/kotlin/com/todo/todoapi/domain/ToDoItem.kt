package com.todo.todoapi.domain

import jakarta.persistence.*

@Entity
data class ToDoItem(

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    val description: String,
    // Other fields...
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "list_id")
    val toDoList: ToDoList
)
{
    var itemState: ToDoItemState? = null
        get() = if (field == null) ToDoItemState.New else field
        private set
}

