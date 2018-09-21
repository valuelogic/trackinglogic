package one.valuelogic.trackingvalue.infrastructure

import one.valuelogic.trackingvalue.model.Task
import one.valuelogic.trackingvalue.model.TaskId
import one.valuelogic.trackingvalue.model.TaskRepository

class ContractorTasksInMemory : TaskRepository {

    var tasks = mutableListOf<Task>()
    var nextId = 1

    override fun add(task: Task) {
        tasks.add(task)
    }

    override fun nextId(): TaskId {
        return TaskId(nextId++)
    }

    fun allTasks(): List<Task> {
        return tasks.toList()
    }
}