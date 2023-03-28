package chap09.section5

fun main() {
    val list1 = listOf(1,2,3,4,5)
    val listSeq = list1.asSequence()
        .map{print("map($it) "); it * it}
        .filter{println("filter($it) "); it % 2 == 0}
        .toList()
    println(listSeq)
}