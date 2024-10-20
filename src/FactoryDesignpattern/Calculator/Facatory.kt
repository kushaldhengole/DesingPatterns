package FactoryDesignpattern.Calculator;

public class Factory {
    fun getInstance(type:String): AuthOperation {
        return when(type){
            "+" -> {
                Addition()
            }
            "*"->{
                Multiplication()
            }
            "-"->{
                Substraction()
            }
            "/"->{
                Div()
            }
            else->{
                Div()
            }
        }
    }
}
