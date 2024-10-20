package Creational.Factory

class Div: AuthOperation {
    override fun calculate(a: Int, b: Int): Int {
        return a/b.toInt()
    }
}