package chap03.section5

fun main() {
    shortFuncb(3) { println("First call: $it")}
}

inline fun shortFuncb(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a) // 인라인 처리되지 않고 분기되어 처리됨.
    println("After calling out()")
}

