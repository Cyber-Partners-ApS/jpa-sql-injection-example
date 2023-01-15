package dk.cyberpartners.examples.controller

import dk.cyberpartners.examples.repository.CustomUserRepository
import dk.cyberpartners.examples.repository.UserRepository
import dk.cyberpartners.examples.repository.entity.UserEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class APIController(
    private val userRepository: UserRepository
) {

    @GetMapping("/user/all")
    fun findAllUsers() : List<UserEntity> {
        return userRepository.findAll()
    }

    @GetMapping("/user/{id}")
    fun findUsers(@PathVariable id: String) : List<String> {
        return userRepository.getUserNames(id)
    }

    @GetMapping("/user/safe/{id}")
    fun findUsersSafe(@PathVariable id: String) : List<String> {
        return userRepository.getUserNamesSafe(id)
    }
}