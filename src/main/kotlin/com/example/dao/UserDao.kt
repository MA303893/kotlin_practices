package com.example.dao

import org.jdbi.v3.core.Jdbi
import com.example.ConnectionBuilder
import org.jdbi.v3.core.statement.Query
import java.sql.ResultSet

class UserDao() {
    companion object {
        val jdbi: Jdbi = ConnectionBuilder.getJdbiConnection()
        fun getAllUserEmails() {
            val emails = jdbi.withHandle<List<Map<String, Any>>, Exception> { handle ->
                handle.createQuery("select email from users").mapToMap().list()
            }
            emails.forEach {
                println(it.values)
            }
        }
    }
}

fun main(args: Array<String>) {
    UserDao.getAllUserEmails()
}