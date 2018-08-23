package com.example.bean

import java.util.*

data class User(val firstName: String, val lastName: String, val dob: Date, val email: String, val file: String){
    var fullName = String()
    init {
        fullName = "${this.firstName} ${this.lastName}"
    }
    fun x(){
        print("x")
    }
}

fun main(a: Array<String>){
    val user = User("Manish", "Singh", Date(), "email", "file")
    print(user.x())
}