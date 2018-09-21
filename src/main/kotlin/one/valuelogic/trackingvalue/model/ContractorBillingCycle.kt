package one.valuelogic.trackingvalue.model

import java.time.YearMonth

data class ContractorBillingCycle(val contractorId: String, val month: YearMonth) {

    fun confirm(): Unit {

    }
}