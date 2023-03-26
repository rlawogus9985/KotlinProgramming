package chap03.section3

fun main() {
    // 매개변수 없는 람다식
    noParam({"Hello World!"})
    noParam {"Hello World!"} // 위와 동일, 소괄호 생략

    // 매개변수가 1개인 람다식
    oneParam({a->"Hello World! $a"})
    oneParam{a-> "Hello World! $a"}
    oneParam{"Hello World! $it"} // 위와 동일한 결과, it으로 대체 가능

    // 매개변수가 2개 있는 람다식
    moreParam{a,b -> "Hello World! $a, $b"}
}

// 매개변수가 없는 람다식이 noParam 함수의 매개변수 out으로 지정됨.
fun noParam(out: ()->String) = println(out())

// 매개변수가 1개 있는 람다식이 oneParam() 함수의 매개변수 out으로 지정됨.
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

// 매개변수가 2개 있는 람다식의 moreParam 함수의 매개변수로 지정됨
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}