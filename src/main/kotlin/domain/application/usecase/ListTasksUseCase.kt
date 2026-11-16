package domain.application.usecase

import domain.model.Task
import domain.repository.TaskRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ListTasksUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(): List<Task> {
        return withContext(Dispatchers.IO) {
            taskRepository.findAll()
        }
    }
}