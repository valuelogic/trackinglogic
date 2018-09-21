package one.valuelogic.trackingvalue

import one.valuelogic.trackingvalue.model.ClientId
import org.junit.jupiter.api.Test


internal class WhenAddingNewProject {

    @Test
    fun shouldAddNewProjectToListingOfProjects() {
        //given
        val projectAssertions = InMemoryProjectRepository()
        val projectUseCase = ProjectUseCase(projectAssertions, InMemoryClientRepository())

        //when
        projectUseCase.addNewProject(PROJECT_NAME, CLIENT_ID);

        //then
        projectAssertions
            .hasSize(1)
            .first()
                .hasName(PROJECT_NAME)
                .belongTo(CLIENT_ID)
    }

    companion object WhenAddingNewProject {
        val PROJECT_NAME = "SOME_AWESOME_PROJECT"
        val CLIENT_ID = ClientId("1231231")
    }
}


