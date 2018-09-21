package one.valuelogic.trackingvalue.model

data class Task(val taskId: TaskId,
                val name: String,
                val contractor: Contractor,
                val client: Client,
                val project: Project) {

//    var days = mutableListOf<WorkDay>()

//    fun addWorklog(date: LocalDate, duration: Duration) {
//        addWorklog(WorkDay(date, duration))
//    }
//
//    fun addWorklog(worklog: WorkDay) {
//        days.add(worklog)
//    }
//
//    fun removeWorklog(date: LocalDate) {
//        // TODO
//    }
//
//    fun changeDuration(date: LocalDate, duration: Duration) {
//        // TODO:
//    }

//    fun days(): List<WorkDay> {
//        return mutableListOf()
//    }
}

