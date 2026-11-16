package domain.application.usecase

import domain.model.Task
import domain.repository.TaskRepository

class UpdateTaskUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(id: String, name: String?, description: String?, completed: Boolean?): Task {
        // TODO(reto): Implementar la lógica para actualizar una tarea.
        // 1. Verificar que la tarea existe usando taskRepository.findById(id)
        // 2. Si no existe, lanzar una excepción con mensaje "Task not found"
        // 3. Usar el método update de la entidad Task para crear una nueva versión actualizada
        // 4. Persistir la tarea actualizada usando taskRepository.update(task)
        // 5. Retornar la tarea actualizada
        throw NotImplementedError("UpdateTaskUseCase not implemented")
    }
}