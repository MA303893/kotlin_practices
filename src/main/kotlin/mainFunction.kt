data class User(val name: String, val age: Int)

fun printUser(user: User){
    print(user)
}

fun main(args: Array<String>){
    val user = User("Manish", 27)
    printUser(user)
}