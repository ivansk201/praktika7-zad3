fun main() {
    try {
        print("Введите скорость лодки в стоячей воде (V): ")
        var v = readLine()!!.toDouble()
        print("Введите скорость течение реки (U): ")
        var u = readLine()!!.toDouble()
        print("Введите время движения лодки по озеру (t1): ")
        var t1 = readLine()!!.toDouble()
        print("Введите время движения лодки по реке (против течения) (t2): ")
        var t2 = readLine()!!.toDouble()
     var s = v * t1 + (v - u) * t2
        if (s<0) {
            println("Введеные числа не могут быть отрицательными")
        }
        else
        {
            print("Путь пройденный лодкой ${s} км.")
        }
    }
    catch (e: Exception) {
        println("Ошибка,ввода данных") }
}