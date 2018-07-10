package app

import io.requery.Persistable
import io.requery.cache.EntityCacheBuilder
import io.requery.reactivex.KotlinReactiveEntityStore
import io.requery.reactivex.ReactiveSupport
import io.requery.sql.*
import org.sqlite.SQLiteConfig
import org.sqlite.SQLiteDataSource
import requery.*
import java.sql.DriverManager
import javax.sql.DataSource

fun main(args: Array<String>) {
    // register sqlite class
    Class.forName("org.sqlite.JDBC")
    // create a connection to the sqlite database
    val dataSource = SQLiteDataSource()
    dataSource.url = "jdbc:sqlite:Users.db"

    // create the table if it doesn't already exist. Model gives the default entity model?
    // creates one table per entity
    SchemaModifier(dataSource, Models.DEFAULT).createTables(TableCreationMode.DROP_CREATE)

    // setup the configuration with the data source and model
    val config = KotlinConfiguration(dataSource = dataSource, model = Models.DEFAULT)

    // create the data store
    val data = KotlinEntityDataStore<Persistable>(config)

    // use the database

    val numberOfPeople = data.count(UserModelEntity::class).get().value()
    println("Currently $numberOfPeople in the database")

    if (numberOfPeople < 1) {
        // no one in the database yet
        val newUser = UserModelEntity()
        newUser.name = "Edvin"

        val newProject1 = ProjectModelEntity()
        newProject1.name = "Edvin's Project 1"

        val projects = listOf(
                "Edvin's Project 1",
                "Edvin's Second Project"
        ).map {
            val project = ProjectModelEntity()
            project.name = it
            project
        }
        newUser.projects.addAll(projects)

        println("Inserting a new user named '${newUser.name}' with ${projects.size} projects")
        data.insert(newUser)
    }

    // get people
    println("Current User Database Content")
    data.select(UserModelEntity::class).get().each {
        println("USER ${it.id} '${it.name}'")
        for (project in it.projects) {
            println("    PROJECT '${project.name}'")
        }
    }

}