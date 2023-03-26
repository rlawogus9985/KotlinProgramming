package chap03.section5

fun main() {
    shortFuncc(3) {
        println("First call: $it")
        // return 사용 불가
    }
}

inline fun shortFuncc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc{ out(a) }
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}