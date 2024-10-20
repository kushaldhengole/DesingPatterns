package Structural.Composit

class Expression(val rightExpression: ArithmaticExpression,val leftExpression: ArithmaticExpression, val operations: Operations):ArithmaticExpression {
    override fun evaluate(): Int {
     return when(operations){
         Operations.Add ->{
           rightExpression.evaluate() + leftExpression.evaluate()
         }
         Operations.Sub ->{
             rightExpression.evaluate() - leftExpression.evaluate()
         }
         Operations.Mul ->{
             rightExpression.evaluate()*leftExpression.evaluate()
         }
         Operations.Div ->{
             rightExpression.evaluate() / leftExpression.evaluate()
         }
     }
    }
}