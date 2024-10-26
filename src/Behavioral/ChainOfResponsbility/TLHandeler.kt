package Behavioral.ChainOfResponsbility

class TLHandeler(val handler: Handler):Handler {

    override fun handelRequest(bonus: Int) {
        if (bonus<=10000){
            println("TL Approved")
        }
        else{
            handler.handelRequest(bonus)
        }
    }
}