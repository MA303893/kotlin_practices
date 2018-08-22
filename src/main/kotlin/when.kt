fun main(args: Array<String>) {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
    cases(1.34)
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        is MyClass -> println("MyClass")
        is String -> println("String")
        else -> println("Unknown")
    }
}

class MyClass() {
}