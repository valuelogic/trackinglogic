package one.valuelogic.trackingvalue.infrastructure

import one.valuelogic.trackingvalue.model.Task
import one.valuelogic.trackingvalue.model.TaskRepository

class ContractorTasksInMemory : TaskRepository {

    var tasks = mutableListOf<Task>()

    override fun add(task: Task) {
        tasks.add(task)
    }

    fun allTasks(): List<Task> {
        return tasks.toList()
    }
}