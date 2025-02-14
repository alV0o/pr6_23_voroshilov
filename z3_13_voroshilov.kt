fun main(){
    try{
        print("Введите кол-во 5 - ")
        val p = readLine()!!.toDouble()
        print("Введите кол-во 4 - ")
        val ch = readLine()!!.toDouble()
        print("Введите кол-во 3 - ")
        val tr = readLine()!!.toDouble()
        print("Введите кол-во 2 - ")
        val dv = readLine()!!.toDouble()

        val sr = (p*5 + ch*4 + tr*3 + dv*2)/(p+ch+tr+dv)
        var sum = 0.0

        when {
            (p<0 || ch<0 || tr<0 || dv<0) -> println("Неверные значения")
            else ->{
                println("Средний балл = " + String.format("%.2f", sr))
                when {
                    (5>=sr && 4<sr) -> sum += p
                    (4>=sr && 3<sr) -> sum+=p +ch
                    (3>=sr && 2<sr) -> sum += p + ch + tr
                    (2>sr) -> sum += p + ch + tr + dv
                    else -> println("неверные данные")
                }
                println("Количество учеников = " + String.format("%.0f",sum))
            }
        }
    }
    catch(e:Exception){
        println("неверный формат")
    }
}