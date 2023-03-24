package chap05.section5.protectedtest

open class Base { // 최상위 클래스에는 protected를 사용할 수 없음.
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }
}