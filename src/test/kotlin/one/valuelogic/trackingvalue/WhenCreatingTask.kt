package one.valuelogic.trackingvalue

import io.mockk.every
import io.mockk.mockk
import one.valuelogic.trackingvalue.infrastructure.ContractorTasksInMemory
import one.valuelogic.trackingvalue.model.*
import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test

internal class WhenCreatingTask {

    @Test
    fun shouldTaskBeAddedToContractorTask() {
        val taskRepository = ContractorTasksInMemory()
        val contractorRepository = mockk<ContractorRepository>()
        val clientRepository = mockk<ClientRepository>()
        val projectRepository = mockk<ProjectRepository>()

        val contractor = Contractor("adamd")
        val client = Client(ClientId("retarus"), "retarus")
        val project = Project("PROJECT_ID","tax", ClientId("123123"))

        every {
            contractorRepository.findById("adamd")
        } returns contractor
        every {
            clientRepository.findById("retarus")
        } returns client
        every {
            projectRepository.findById("tax")
        } returns project

        val useCase = TaskUseCase(taskRepository, contractorRepository, clientRepository, projectRepository)

        useCase.createTask("adamd", "retarus", "tax", "frontend")

        val allTasks = taskRepository.allTasks()

        assertIterableEquals(listOf(Task("frontend", contractor, client, project)), allTasks)
    }

}