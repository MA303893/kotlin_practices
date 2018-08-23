package com.example

import org.jdbi.v3.core.Handle
import org.jdbi.v3.core.Jdbi

fun main(args: Array<String>){
    println("Hello")
    val jdbi = Jdbi.create("jdbc:postgresql://localhost/kotlin_jpa","kotlin_dbuser","kotlin_dbpwd")
    val handle : Handle = jdbi.open()

}