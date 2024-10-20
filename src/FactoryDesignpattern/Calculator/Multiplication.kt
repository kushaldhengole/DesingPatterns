package FactoryDesignpattern.Calculator

class Multiplication: AuthOperation {
    override fun calculate(a: Int, b: Int): Int {
        return a*b
    }
}