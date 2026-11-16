package domain.application.usecase

import domain.model.Task
import domain.repository.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CreateTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(name: String, description: String?): Task {
        return withContext(Dispatchers.IO) {
            val existingTask = taskRepository.findByName(name)
            require(existingTask == null) { "A task with name '$name' already exists" }

            val task = Task(name = name, description = description)
            taskRepository.save(task)
        }
    }
}