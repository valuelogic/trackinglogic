package one.valuelogic.trackingvalue.model

interface ClientRepository {
    fun findById(id: String): Client
}