package FactoryDesignpattern.Calculator

class Calculator {
    val factory = Factory()
    fun calculate(n1:Int,n2:Int,op:String):Int{
       return factory.getInstance(op).calculate(n1,n2)
    }
}