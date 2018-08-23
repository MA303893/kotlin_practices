package com.example

import org.jdbi.v3.core.Handle
import org.jdbi.v3.core.Jdbi
import org.jdbi.v3.core.statement.Query
import org.jdbi.v3.core.statement.Update
import org.postgresql.ds.PGSimpleDataSource
import java.text.SimpleDateFormat
fun main(args: Array<String>) {
    val dataSource = PGSimpleDataSource()
    dataSource.setURL("jdbc:postgresql://localhost/")
    dataSource.user = "kotlin_dbuser"
    dataSource.password = "kotlin_dbpwd"
    dataSource.databaseName = "kotlin_jpa"

    val jdbi = Jdbi.create(dataSource)
    val handle: Handle = jdbi.open()
    val query: Query = handle.createQuery("select * from users")
    val results: List<Map<String, Any>> = query.mapToMap().list()
    results.forEach {
        it.entries.forEach {
            println("${it.key} : ${it.value}")
        }
    }
    try {
        val insert: Update = handle.createUpdate("insert into users (firstname, lastname, dob, email, file) values (?, ?, ?, ?, ?)")
        insert.bind(0, "Manish")
        insert.bind(1, "Singh")
        insert.bind(2, SimpleDateFormat("dd-MM-yyyy").parse("14-02-2018"))
        insert.bind(3, "as@sd4.com")
        insert.bind(4, "df.jpx")
        val i: Int = insert.execute()
        println(i)
    } catch (e: Exception) {
        e.printStackTrace()
    }
    handle.close()
}