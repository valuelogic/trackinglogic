package one.valuelogic.trackingvalue.model

import java.time.Duration
import java.time.LocalDate

data class Worklog(val date: LocalDate, val duration: Duration, val taskId: String, val cbcId: String) {

}