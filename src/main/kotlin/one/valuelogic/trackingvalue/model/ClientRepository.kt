package one.valuelogic.trackingvalue.model

interface ClientRepository {

    fun findById(id: String): Client

    fun add(client: Client)

    fun nextId(): ClientId
}