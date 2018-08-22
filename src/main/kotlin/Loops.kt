fun main(args: Array<String>) {
    forLoop()
    forLoopWithRange()
    forLoopWithIndex()
    forEachLoop()
    repeatLoop()
    whileLoop()
}

fun forLoop() {
    var days = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    for (day in days) {
        println(day)
    }
}

fun forLoopWithRange() {
    for (i in 1..5) {
        println(i)
    }
}

fun forLoopWithIndex() {
    var days = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    for ((index, day) in days.withIndex()) {
        println("$index : $day")
    }
}

fun forEachLoop() {
    var days = listOf("Sunday", 12, "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    days.withIndex().forEach {
        println("${it.index} : ${it.value}")
    }
}

fun repeatLoop() {
    repeat(4) {
        println("$it : Hello World!")
    }
}

fun whileLoop() {
    // while loop
    var i = 1
    while (i < 4) {
        println(i)
        i = i + 1
    }
    // do while loop
    i = 1
    do {
        println(i)
        i = i + 1
    } while (i < 0)

    // while with break
    i = 1
    while (true) {
        if (i >= 4)
            break
        println(i)
        i++
    }
}