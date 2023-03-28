package chap08.section2.sortwith

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snowball", 870.00),
        Product("Smart", 999.00),
        Product("Drone",240.00),
        Product("Mouse", 633.55),
        Product("Keyboard",125.99),
        Product("Mouse",520.12)
    )

    products.sortWith( // Comparator를 이용해 두 객체를 비교하여 p1이 크면 1, 같으면 0, 작으면 -1
        Comparator<Product> { p1, p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )
    //compareBy를 사용해 2개의 정보 정렬
    products.sortWith(compareBy({it.name},{it.price}))
    products.forEach { println(it) }
}