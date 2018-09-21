package one.valuelogic.trackingvalue

import one.valuelogic.trackingvalue.model.Client
import one.valuelogic.trackingvalue.model.ClientId
import one.valuelogic.trackingvalue.model.ClientRepository

class InMemoryClientRepository : ClientRepository {
    override fun nextId(): ClientId {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun add(client: Client) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val all: List<Client>  = listOf()

    override fun findById(id: String): Client {
        return all.filter { client -> client.clientId == ClientId(id) }.single()
    }

}