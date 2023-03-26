package chap04.section1

fun main() {
    cases("Hello") // 2
    cases(1) // 1
    cases(System.currentTimeMillis()) // 3
//    cases(MyClass()) // 4
}

fun cases(obj: Any){
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}