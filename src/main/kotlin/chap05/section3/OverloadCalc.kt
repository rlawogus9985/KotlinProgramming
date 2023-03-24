package chap05.section3

fun main() {
    val calc = Calc()
    println(calc.add(2,3))
    println(calc.add(2.3,3.4))
    println(calc.add(2,3, 5))
    println(calc.add(2.3,3.3, 4.1))
}
class Calc{
    // 다양한 매개변수로 오버로딩된 메서드
    fun add(x: Int, y: Int): Int = x + y
    fun add(x: Double, y: Double): Double = x + y
    fun add(x: Int, y: Int, z: Int): Int = x + y + z
    fun add(x: Double, y: Double, z: Double): Double = x + y + z
}