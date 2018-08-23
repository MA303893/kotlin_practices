package com.example.dao

import org.jdbi.v3.core.Jdbi
import com.example.ConnectionBuilder

class UserDao() {
    companion object {
        val jdbi: Jdbi = ConnectionBuilder.getJdbiConnection()
        fun getAllUserEmails(): List<String> {
            val emails = jdbi.withHandle<List<String>, Exception> { handle ->
                handle.createQuery("select email from users").mapToMap().map {
                    it.get("email") as String
                }
            }
            return emails
        }
    }
}

fun main(args: Array<String>) {
    UserDao.getAllUserEmails().forEach {
        println(it)
    }
}