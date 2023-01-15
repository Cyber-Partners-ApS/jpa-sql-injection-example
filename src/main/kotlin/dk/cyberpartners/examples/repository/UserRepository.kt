package dk.cyberpartners.examples.repository

import dk.cyberpartners.examples.repository.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, String>, CustomUserRepository