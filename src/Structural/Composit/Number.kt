package Structural.Composit

import Creational.Factory.AuthOperation

class Number(val number: Int):ArithmaticExpression {
    override fun evaluate(): Int {
        return number
    }
}