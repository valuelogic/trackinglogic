package one.valuelogic.trackingvalue

import one.valuelogic.trackingvalue.model.ClientId
import one.valuelogic.trackingvalue.model.ClientRepository
import one.valuelogic.trackingvalue.model.Project
import one.valuelogic.trackingvalue.model.ProjectRepository

class ProjectUseCase(val projectRepository: ProjectRepository, val clientRepository: ClientRepository) {

    fun addNewProject(name: String, clientId: ClientId){
        val project = Project("TEST_PROJECT", name, clientId)
        projectRepository.add(project)
    }
}