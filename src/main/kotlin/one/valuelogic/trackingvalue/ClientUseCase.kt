package one.valuelogic.trackingvalue

import one.valuelogic.trackingvalue.model.Client
import one.valuelogic.trackingvalue.model.ClientRepository

class ClientUseCase(val clientRepository: ClientRepository) {

    fun createClient(clientName: String) {
        val clientId = clientRepository.nextId()
        val client = Client(clientId, clientName)
        clientRepository.add(client)
    }
}