package one.valuelogic.trackingvalue.model

interface BillingCycleRepository {
    fun current(): BillingCycle
}
