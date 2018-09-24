package one.valuelogic.trackingvalue.model

import java.lang.RuntimeException
import java.time.Duration
import java.time.YearMonth

class BillingCycle(val contractorId: String, val month: YearMonth) {

    var days: MutableMap<Int, List<Worklog>> = mutableMapOf()

    fun addTask(dayOfMonth: Int, task: Task, duration: Duration) {
        if (!isPresent(dayOfMonth, task)) {
            throw RuntimeException("a")
        }

        var list = days[dayOfMonth]
        if (list == null) {
            list = emptyList()
        }
        list += Worklog(task, duration)
        days[dayOfMonth] = list
    }

    fun renameTask(oldTask: Task, newTask: Task) {
        if (!isPresent(oldTask)) {
            throw RuntimeException("a")
        }

        days.forEach {
            _, worklogs -> worklogs.map {
                it ->
                    if (it.task != oldTask) {
                        it
                    } else {
                        Worklog(newTask, it.duration)
                    }
            }
        }
    }

    fun changeDuration(dayOfMonth: Int, task: Task, duration: Duration) {
        if (!isPresent(dayOfMonth, task)) {
            throw RuntimeException("a")
        }

        days.computeIfPresent(dayOfMonth) {
            _, worklogs ->
            worklogs.map {
                worklog -> if (worklog.task == task) {
                    Worklog(worklog.task, duration)
                } else {
                    worklog
                }}
        }
    }

    fun removeTask(dayOfMonth: Int, task: Task) {
        if (!isPresent(dayOfMonth, task)) {
            throw RuntimeException("a")
        }

        days.computeIfPresent(dayOfMonth) {
            _, worklogs ->
                worklogs.filter { it ->
                    it.task != task
                }
            }
    }

    private fun isPresent(dayOfMonth: Int, task: Task): Boolean {
        return days[dayOfMonth] != null
                && days[dayOfMonth]!!.any {
                    it -> it.task == task
                }
    }

    private fun isPresent(task: Task): Boolean {
        return !days.filterValues {
            worklogs -> worklogs.any {
                it -> it.task == task
            }
        }.isEmpty()
    }

    fun confirm(): Unit {

    }




}

data class Worklog(val task: Task, val duration: Duration)
