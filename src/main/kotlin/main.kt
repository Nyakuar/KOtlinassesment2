fun main(){
    CurrentAccount(45678,"tembalan",10000,50.6)


    var car=product("jeep",45.0,1000,"other")
    var vegetables=product("cabbage",6.0,50,"groceries")
    var health=product("patient",59.0,1000,"hygiene")
    var x=car
    println(x)





    println(evnIndices("Nyakuar"))





}
//quiz 1
class CurrentAccount(var accountnumber:Int,var accountname:String,var balance:Int,amount: Double){
    fun deposit(amount:Double){
        var x=amount+balance
    }
    fun withdraw(amount:Double){

    }
    fun details(){
        var x= ("Account number $accountnumber with balance $balance is operated by $accountname")
    }
}

//quiz 2
//class SavingAccount




//quiz3

data class product(var name:String,var weight:Double,var price:Int,var category:String)
fun takeProd(name:product){
    var prd = mutableListOf<product>()
    name.category
    println(prd)
}


//quiz 4
fun evnIndices(name:String):String{
    var x =""
    for (char in name){
        if (name.indexOf(char)%2==0){
            x+=char
        }

    }
    return x
}




