package one.valuelogic.trackingvalue.model

interface ProjectRepository {
    fun findById(id: String): Project
}