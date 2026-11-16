package domain.model

import java.util.UUID

data class Task(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val description: String?,
    val completed: Boolean = false
) {
    init {
        require(name.isNotBlank()) { "Task name cannot be blank" }
    }

    fun update(name: String?, description: String?, completed: Boolean?): Task {
        return this.copy(
            name = name ?: this.name,
            description = description ?: this.description,
            completed = completed ?: this.completed
        ).also {
            require(it.name.isNotBlank()) { "Task name cannot be blank" }
        }
    }
}