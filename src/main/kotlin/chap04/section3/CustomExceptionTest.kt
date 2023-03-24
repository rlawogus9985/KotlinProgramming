package chap04.section3

import org.omg.CORBA.DynAnyPackage.Invalid

class InvalidNameException(message: String) : Exception(message) // 사용자 예외 클래스

fun main() {
    var name = "Kildong123" // 숫자가 포함된 이름

    try {
        validateName(name)
    } catch (e: InvalidNameException) {
        println(e.message)
    } catch (e: Exception) {
        println(e.message)
    }
}

fun validateName(name: String){
    if (name.matches(Regex(".*\\d+.*"))) { // 이름에 숫자가 포함되있으면
        throw InvalidNameException("Your name : $name : contains numerals.")
    }
}