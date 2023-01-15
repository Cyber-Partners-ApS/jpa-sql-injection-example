package dk.cyberpartners.examples.repository

interface CustomUserRepository {
    fun getUserNames(id: String): List<String>
    fun getUserNamesSafe(id: String): List<String>
}