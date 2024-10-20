package FactoryDesignpattern

class Addition:AuthOperation {
    override fun calculate(a: Int, b: Int): Int {
        return a+b
    }
}