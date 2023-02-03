fun main() {
    try {
        print("Введите x1: ")
        var x1 = readln()!!.toDouble()
        print("Введите y1: ")
        var y1 = readln()!!.toDouble()
        print("Введите x2: ")
        var x2 = readln()!!.toDouble()
        print("Введите y2: ")
        var y2 =readln()!!.toDouble()
        print("Введите x3: ")
        var x3 = readln()!!.toDouble()
        print("Введите y3: ")
        var y3 = readln()!!.toDouble()
        print("Введите x4: ")
        var x4 =readln()!!.toDouble()
        print("Введите y4: ")
        var y4 = readln()!!.toDouble()
        if ((x1>0) || (y1>0) || (x2<=0) || (y2<=0) || (x3<=0) || (y3<=0) || (x4<=0) || (y4<=0)) {
            var S = (x1 * y1)
            if ((x1 > 0) || (y1 > 0) || (x2 > 0) || (y2 > 0) || (x3 <= 0) || (y3 <= 0) || (x4 <= 0) || (y4 <= 0)) {
                 S = (x1 * y1 - (x1 - x2) * (y1 - y2))
            }
            if ((x1 > 0) || (y1 > 0) || (x2 > 0) || (y2 > 0) || (x3 > 0) || (y3 > 0) || (x4 > 0) || (y4 > 0)) {
                 S = x1 * y1 - (x1 - x4) * (y1 - y2)
            }
            println("$S Пощадь части прямоугольника расположенной в 1-й части координатной четверти")
        }
    }
    catch (e: Exception) {
        println("Ошибка,ввода данных") }

}