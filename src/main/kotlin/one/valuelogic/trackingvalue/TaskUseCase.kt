package one.valuelogic.trackingvalue

import one.valuelogic.trackingvalue.model.Client
import one.valuelogic.trackingvalue.model.Contractor
import one.valuelogic.trackingvalue.model.Project
import one.valuelogic.trackingvalue.model.Task

class TaskUseCase(val taskRepository: TaskRepository,
                  val contractorRepository: ContractorRepository,
                  val clientRepository: ClientRepository,
                  val projectRepository: ProjectRepository) {

    interface TaskRepository {
        fun add(task: Task)


    }

    interface ContractorRepository {
        fun findById(id: String): Contractor
    }

    interface ClientRepository {
        fun findById(id: String): Client
    }

    interface ProjectRepository {
        fun findById(id: String): Project
    }

    interface CBCRepository {
        fun current(): CBCRepository
    }

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