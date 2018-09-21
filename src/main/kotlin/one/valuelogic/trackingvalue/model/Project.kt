package one.valuelogic.trackingvalue.model

typealias ProjectId = String

data class Project(val projectId: ProjectId, val name: String, val clientId: ClientId) {

}