package one.valuelogic.trackingvalue

import one.valuelogic.trackingvalue.model.ClientId
import one.valuelogic.trackingvalue.model.Project
import org.amshove.kluent.`should be equal to`
import org.amshove.kluent.`should be`

class ProjectAssertion(val toBeAssert: Project){

    fun hasName(expectProjectName: String): ProjectAssertion {
        toBeAssert.name `should be equal to` expectProjectName
        return this
    }

    fun belongTo(clientId: ClientId): ProjectAssertion {
        toBeAssert.clientId.`should be`(clientId)
        return this
    }

}