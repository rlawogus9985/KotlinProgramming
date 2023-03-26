package chap03.section3.funcargs

fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun funcFunc(): Int {
    return sum(2,2)
}
