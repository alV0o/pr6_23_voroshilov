fun main(){
    try{
        var x = readLine()!!.toDouble()
        var y = readLine()!!.toDouble()
        var z = readLine()!!.toDouble()
        when{
            (x>=y && y>=z || y>=x && x>=z) -> println(x+y)
            (x>=y && z>=y) -> println (x+z)
            else -> println(y+z)
        }
    }
    catch(e:Exception){
        println("неверный формат данных")
    }
}
