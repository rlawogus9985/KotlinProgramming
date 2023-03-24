package chap05.section3.openclass

// 1. 상속 가능한 클래스를 선언하기 위해 open 사용
open class Bird(var name: String, var color: String){
    // 메서드
    fun fly() = println("Fly wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

// 2. 주 생성자를 사용하는 상속
class Lark(name: String, color:String) : Bird(name,color){
    fun singHitone() = println("Happy song!") // 새로 추가한 매서드
}

// 3. 부 생성자를 사용하는 상속
class Parrot : Bird {
    val language: String
    constructor(name: String, color: String, language: String) : super(name, color){
            this.language = language
        }
    fun speak() = println("Speak $language")
}

fun main() {
    val coco = Bird("mybird","blue")
    val lark = Lark("mylark", "brown")
    // 프로퍼티 추가
    val parrot = Parrot("myparrot","multiple","korean")

    lark.singHitone()
    parrot.speak()
}