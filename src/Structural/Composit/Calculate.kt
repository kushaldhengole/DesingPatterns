package Structural.Composit

fun main (){
    val two = Number(2)
    val four = Number(4)
    val three = Number(3)
    val expression = Expression(four,two,Operations.Div)
    val mainExp = Expression(three,expression,Operations.Mul)

    println("Sum Of ${mainExp.evaluate()}")
}