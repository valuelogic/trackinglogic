package one.valuelogic.trackingvalue.model

interface TaskRepository {
    fun add(task: Task)

    fun nextId(): TaskId
}