package one.valuelogic.trackingvalue.model

import java.time.Duration
import java.time.LocalDate
import java.time.YearMonth

data class Task(val name: String, val contractor: Contractor, val client: Client, val project: Project) {

//    var worklogs = mutableListOf<Worklog>()

//    fun addWorklog(date: LocalDate, duration: Duration) {
//        addWorklog(Worklog(date, duration))
//    }
//
//    fun addWorklog(worklog: Worklog) {
//        worklogs.add(worklog)
//    }
//
//    fun removeWorklog(date: LocalDate) {
//        // TODO
//    }
//
//    fun changeDuration(date: LocalDate, duration: Duration) {
//        // TODO:
//    }

//    fun worklogs(): List<Worklog> {
//        return mutableListOf()
//    }
}

data class Worklog(val date: LocalDate, val duration: Duration, val taskId: String, val cbcId: String) {

}

data class Project(val name: String) {

}

data class Client(val name: String) {

}

data class Contractor(val name: String) {

}

data class ContractorBillingCycle(val contractorId: String, val month: YearMonth) {

    fun confirm(): Unit {

    }
}
