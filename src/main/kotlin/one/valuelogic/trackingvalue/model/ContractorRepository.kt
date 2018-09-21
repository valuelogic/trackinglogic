package one.valuelogic.trackingvalue.model

interface ContractorRepository {
    fun findById(id: String): Contractor
}