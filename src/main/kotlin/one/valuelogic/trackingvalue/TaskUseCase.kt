package one.valuelogic.trackingvalue

import one.valuelogic.trackingvalue.model.*

class TaskUseCase(private val taskRepository: TaskRepository,
                  private val contractorRepository: ContractorRepository,
                  private val clientRepository: ClientRepository,
                  private val projectRepository: ProjectRepository) {


    fun createTask(contractorId: String,
                   clientName: String,
                   projectName: String,
                   description: String) {

        val taskId = taskRepository.nextId()

        val contractor = contractorRepository.findById(contractorId)
        val client = clientRepository.findById(clientName)
        val project = projectRepository.findById(projectName)
        val task = Task(taskId, description, contractor, client, project)

        taskRepository.add(task)
    }
}