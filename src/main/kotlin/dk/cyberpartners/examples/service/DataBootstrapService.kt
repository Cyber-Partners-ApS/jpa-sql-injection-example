package dk.cyberpartners.examples.service

import dk.cyberpartners.examples.repository.UserRepository
import dk.cyberpartners.examples.repository.entity.UserEntity
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class DataBootstrapService(
    private val userRepository: UserRepository
) {

    @PostConstruct
    fun createMockData() {
        userRepository.save(UserEntity(
            name = "John Doe"
        ))

        userRepository.save(UserEntity(
            name = "Jimmy Doe"
        ))

        userRepository.save(UserEntity(
            name = "Jane Doe"
        ))
    }
}