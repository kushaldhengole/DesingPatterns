package Behavioral.ChainOfResponsbility

class HR {
    val tlHandeler = TLHandeler(ManagerHandeler())
    fun sendBonusApprovel(bonus:Int){
        tlHandeler.handelRequest(bonus)
    }

}