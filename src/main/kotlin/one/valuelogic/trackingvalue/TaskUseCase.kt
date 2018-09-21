package one.valuelogic.trackingvalue

import one.valuelogic.trackingvalue.model.*
import java.time.Duration
import java.time.LocalDate

class TaskUseCase(val taskRepository: TaskRepository,
                  val contractorRepository: ContractorRepository,
                  val clientRepository: ClientRepository,
                  val projectRepository: ProjectRepository) {


    fun createTask(contractorId: String,
                   clientName: String,
                   projectName: String,
                   description: String) {

        val contractor = contractorRepository.findById(contractorId)
        val client = clientRepository.findById(clientName)
        val project = projectRepository.findById(projectName)
        val task = Task(description, contractor, client, project)

        taskRepository.add(task)
    }
}