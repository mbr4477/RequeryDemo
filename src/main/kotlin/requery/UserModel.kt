package requery
import io.requery.*

@Entity
interface UserModel : Persistable {
    @get:Key @get:Generated
    val id : Int

    var name : String

    @get:OneToMany(mappedBy = "owner")
    val projects: MutableSet<ProjectModel>

}
