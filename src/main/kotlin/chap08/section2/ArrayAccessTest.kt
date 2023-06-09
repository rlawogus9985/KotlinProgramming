package chap08.section2

import java.util.*

fun main() {
    val arr = intArrayOf(1,2,3,4,5)

    println("arr: ${Arrays.toString(arr)}") // Arrays.toString()은 배열의 내용을 문자열로 변환
    println("size: ${arr.size}") // 배열의 크기
    println("sum(): ${arr.sum()}") // 배열의 합 계산
    // 게터에 의한 접근과 대괄호 연산자 표기법
    println(arr.get(2))
    println(arr[2])
    // 세터에 의한 값의 설정
    arr.set(2,7)
    arr[0] = 8
    println("arr: ${Arrays.toString(arr)}")
    // 루프를 통한 배열의 요소 접근
    for (i in 0..arr.size-1) {
        println("arr[$i] = ${arr[i]}")
    }
}