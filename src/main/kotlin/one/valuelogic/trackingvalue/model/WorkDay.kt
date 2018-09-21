package one.valuelogic.trackingvalue.model

data class WorkDay(val dayOfMonth: Int, val billingCycleId: String) {

    fun recordTask(taskDuration: TaskDuration) {
    }

    fun removeTask(taskId: String) {
    }

    fun changeDuration(taskId: String, taskDuration: TaskDuration) {
    }
}
