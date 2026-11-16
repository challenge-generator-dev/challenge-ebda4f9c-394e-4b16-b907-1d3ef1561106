package domain.infrastructure.controller

import domain.application.usecase.CreateTaskUseCase
import domain.application.usecase.ListTasksUseCase
import domain.application.usecase.UpdateTaskUseCase
import domain.model.Task
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.util.*
import kotlinx.coroutines.runBlocking

@KtorExperimentalAPI
class TaskController(
    private val createTaskUseCase: CreateTaskUseCase,
    private val listTasksUseCase: ListTasksUseCase,
    private val updateTaskUseCase: UpdateTaskUseCase
) {
    suspend fun createTask(call: ApplicationCall) {
        TODO("reto: implementa") // TODO(reto)
    }

    suspend fun listTasks(call: ApplicationCall) {
        TODO("reto: implementa") // TODO(reto)
    }

    suspend fun updateTask(call: ApplicationCall) {
        TODO("reto: implementa") // TODO(reto)
    }
}