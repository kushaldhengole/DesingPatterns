package Creational.Factory

class Substraction: AuthOperation {
    override fun calculate(a: Int, b: Int): Int {
        return a-b
    }
}