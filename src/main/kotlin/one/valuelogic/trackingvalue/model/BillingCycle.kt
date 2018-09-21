package one.valuelogic.trackingvalue.model

import java.time.YearMonth

data class BillingCycle(val contractorId: String, val month: YearMonth) {

    fun confirm(): Unit {

    }
}