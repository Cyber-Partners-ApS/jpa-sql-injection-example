package dk.cyberpartners.examples.repository.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users")
@NamedNativeQuery(name = "getUsersNativeQuery", query = "SELECT * FROM users u WHERE u.id = ?", resultClass = UserEntity::class)
class UserEntity(

    @Id
    var id: String = UUID.randomUUID().toString(),
    var name: String? = null
)