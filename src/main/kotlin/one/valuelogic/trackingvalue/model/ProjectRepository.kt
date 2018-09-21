package one.valuelogic.trackingvalue.model

interface ProjectRepository {
    fun findById(id: String): Project
    fun add(project: Project): Unit
}