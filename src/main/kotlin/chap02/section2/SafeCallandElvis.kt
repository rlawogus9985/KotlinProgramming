package chap02.section2

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length : ${str1?.length ?: -1}")
    // str1: null length : -1
}