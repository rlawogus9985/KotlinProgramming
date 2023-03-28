package chap07.section2

interface Switcher { // 1. 인터페이스 선언
    fun on(): String
}

class Smartphone(val model: String) {
    fun powerOn(): String{
        class Led(val color: String) { // 지역 클래스
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher { // 2. 익명 객체를 사용해 Switcher의 on()을 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        } // 익명(object) 객체의 블록의 끝
        return powerSwitch.on() //  익명 개체의 매서드 사용
    }
}