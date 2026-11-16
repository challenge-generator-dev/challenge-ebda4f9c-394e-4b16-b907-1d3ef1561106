package domain.infrastructure.plugins

import domain.application.usecase.CreateTaskUseCase
import domain.application.usecase.ListTasksUseCase
import domain.application.usecase.UpdateTaskUseCase
import domain.infrastructure.controller.TaskController
import domain.infrastructure.repository.InMemoryTaskRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.util.*
import kotlinx.coroutines.runBlocking

@KtorExperimentalAPI
fun Application.configureRouting() {
    val taskRepository = InMemoryTaskRepository()
    val createTaskUseCase = CreateTaskUseCase(taskRepository)
    val listTasksUseCase = ListTasksUseCase(taskRepository)
    val updateTaskUseCase = UpdateTaskUseCase(taskRepository)
    
    val taskController = TaskController(
        createTaskUseCase = createTaskUseCase,
        listTasksUseCase = listTasksUseCase,
        updateTaskUseCase = updateTaskUseCase
    )

    routing {
        route("/api/tasks") {
            post {
                runBlocking {
                    taskController.createTask(call)
                }
            }
            
            get {
                runBlocking {
                    taskController.listTasks(call)
                }
            }
            
            put("/{id}") {
                runBlocking {
                    taskController.updateTask(call)
                }
            }
        }
        
        get("/health") {
            call.respond(mapOf("status" to "OK"))
        }
    }
}