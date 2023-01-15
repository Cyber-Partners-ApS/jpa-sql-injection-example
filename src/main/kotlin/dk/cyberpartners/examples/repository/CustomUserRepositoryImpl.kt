package dk.cyberpartners.examples.repository

import dk.cyberpartners.examples.repository.entity.UserEntity
import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext


class CustomUserRepositoryImpl: CustomUserRepository {

    @PersistenceContext
    @Autowired
    private lateinit var entityManager: EntityManager


    override fun getUserNames(id: String): List<String> {
        val query = entityManager
            .createNativeQuery("SELECT * FROM users u WHERE u.id = '$id'", UserEntity::class.java)

        return query.resultList
            .map { x ->
                val userEntity = x as UserEntity
                userEntity.name as String
            }.toList()
    }

    override fun getUserNamesSafe(id: String): List<String> {
        val query = entityManager
            .createNamedQuery("getUsersNativeQuery")
        query.setParameter(1, id)

        return query.resultList
            .map { x ->
                val userEntity = x as UserEntity
                userEntity.name as String
            }.toList()
    }
}
