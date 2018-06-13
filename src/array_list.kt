fun main(a: Array<String>) {
    print("Enter your input: ")
    var x = readLine()
    x = x.toString()
    val array = arrayListOf<String>()
    var y = x.split(" ".toRegex())
    for (i in y) {
        array.add(i.toUpperCase())
        println(i + " added into the array")
    }
    print("Final array contains: " +array)
}