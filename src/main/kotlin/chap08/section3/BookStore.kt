package chap08.section3

import java.util.*

fun main() {
    //books
    val booksName = arrayOf("java", "c", "c++", "kotlin", "c#", "html")
    val price = 200.00f
    val studentDiscount = .25f
    val teacherDiscount = .15f

    // Scanner 객체에 System.in이라는 inputStream을 넣어서 scanner에 저장
    // `in`으로 감싼 이유는 in이 예약어 이기 때문
    val scanner = Scanner(System.`in`)

    println("** 서점에 오신 걸 환영합니다. **")
    do {
        println(Arrays.toString(booksName))
        println("어떤 책을 원하시나요?")
        print("답변 : ")
        // \n을 포함하는 한 줄을 읽고 \n을 버리고 남은 문자열 반환 및 할당
        val book = scanner.nextLine()

        if (booksName.contains(book.lowercase())){
            println("선택하신 책은 $book 입니다. 가격은 \$200")
            println("당신의 직업은 무엇인가요?(student, teacher, ect)")
            print("답변: ")
            val occupation = scanner.nextLine()

            when (occupation.lowercase()){
                "student" -> calculatePrice(price, studentDiscount)
                "teacher" -> calculatePrice(price, teacherDiscount)
                else -> println("할인이 적용되지 않습니다. \$200원입니다.")
            }
        } else if (book == "exit" || book =="q") {
            break
        } else {
            println("죄송합니다. $book 의 재고가 없습니다.")
        }
    } while (true)
}

private fun calculatePrice(orig: Float, x: Float): Unit {
    val result = orig - (orig * x)
    println("최종 가격은 \$$result 입니다.")
}