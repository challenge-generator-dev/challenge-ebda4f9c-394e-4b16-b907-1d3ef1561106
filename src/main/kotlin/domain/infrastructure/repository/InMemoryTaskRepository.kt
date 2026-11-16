package domain.infrastructure.repository

import domain.model.Task
import domain.repository.TaskRepository
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class InMemoryTaskRepository : TaskRepository {
    private val tasks = mutableListOf<Task>()
    private val mutex = Mutex()

    override suspend fun save(task: Task): Task {
        mutex.withLock {
            tasks.add(task)
            return task
        }
    }

    override suspend fun findById(id: String): Task? {
        mutex.withLock {
            return tasks.find { it.id == id }
        }
    }

    override suspend fun findAll(): List<Task> {
        mutex.withLock {
            return tasks.toList()
        }
    }

    override suspend fun findByName(name: String): Task? {
        mutex.withLock {
            return tasks.find { it.name == name }
        }
    }

    override suspend fun update(task: Task): Task {
        mutex.withLock {
            val index = tasks.indexOfFirst { it.id == task.id }
            if (index != -1) {
                tasks[index] = task
            }
            return task
        }
    }
}