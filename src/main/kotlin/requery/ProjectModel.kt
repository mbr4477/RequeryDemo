package requery

import io.requery.*

@Entity
interface ProjectModel : Persistable {
    @get:Key @get:Generated
    val id: Int

    var name: String

    @get:ManyToOne
    val owner: UserModel
}