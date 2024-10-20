import FactoryDesignpattern.Calculator.Calculator
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter Nuber")
    val n1 = scanner.nextInt()
    println("Enter Number 2")
    val n2 = scanner.nextInt()
    println("Enter operation like +,/,*,-")
    val op = readln()
    val calculator = Calculator()
    println("Sum is ${calculator.calculate(n1,n2,op)}")
}
