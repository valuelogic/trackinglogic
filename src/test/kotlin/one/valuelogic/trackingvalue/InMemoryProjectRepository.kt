package one.valuelogic.trackingvalue

import one.valuelogic.trackingvalue.model.Project
import one.valuelogic.trackingvalue.model.ProjectRepository
import org.amshove.kluent.`should be equal to`

class InMemoryProjectRepository : ProjectRepository {
    private var all: List<Project>  = listOf()

    override fun findById(id: String): Project {
        return all.filter { project -> project.projectId == id }.single()
    }

    override fun add(project: Project) {
        all += project
    }

    fun hasSize(expected: Int): InMemoryProjectRepository {
        all.size `should be equal to` expected
        return this
    }

    fun first(): ProjectAssertion {
        return ProjectAssertion(all.get(0))
    }

}