class Person(name: String) {
    var name = ""

    init {
        this.name = name
    }

    constructor() : this("") {

    }

    fun getPersonDetails(): String {
        return this.name
    }
}

fun main(args: Array<String>) {
    val person = Person("Manish Singh")
    println(person)
}
