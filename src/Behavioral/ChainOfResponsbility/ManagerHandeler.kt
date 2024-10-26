package Behavioral.ChainOfResponsbility

class ManagerHandeler():Handler {

    override fun handelRequest(bonus: Int) {
        if (bonus<=20000){
            println("Mananger Aprroved")
        }
        else{
            println("Bonus rejected")
        }
    }
}