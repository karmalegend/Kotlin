package com.example.demo

import org.springframework.jdbc.core.query
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*
import java.util.*

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

//@RestController
//class MessageController {
//    //    @GetMapping("/")
////    fun index(@RequestParam("name") name: String) = "Hello, $name!"
//    @GetMapping("/")
//    fun index() = listOf(
//        Message("1", "Hello!"),
//        Message("2", "Bonjour!"),
//        Message("3", "Privet!"),
//    )
//}


@RestController
class MessageController(val service: MessageService) {
    @GetMapping("/")
    fun index(): List<Message> = service.findMessages()

    @PostMapping("/")
    fun post(@RequestBody message: Message) {
        service.save(message)
    }
    
    @GetMapping("/{id}")
    fun getMessageByID(@PathVariable id: String): Message? = service.findMessageById(id)
    
}

@Table("MESSAGES")
data class Message(@Id var id: String?, val text: String)

interface MessageRepository : CrudRepository<Message, String> // string is ID type should just be a uuid but whatever tutorial life.


@Service
class MessageService(val db: MessageRepository) {
    
    fun findMessages(): List<Message> = db.findAll().toList()

    fun save(message: Message) = db.save(message)

    fun findMessageById(id: String): Message? = db.findByIdOrNull(id)

//    fun <T : Any> Optional<out T>.toList(): List<T> = this is some syntax.....
//        if (isPresent) listOf(get()) else emptyList()
    
}


