fun main() {
    try {
        print("Введите трехзначное число: ");
        var K = readLine()!!.toDouble()
        if (K > 999 || K < 0) {
            print("У Вас не трехзначное число!")
        } else {
            var d = K  / 100
            K  = K  % 100
            var m = K  / 10
            K  = K  % 10
            if ((m > d) || (K  > m)) {
                print("Цифры образуют арифметическую прогрессию")
            } else print("Цифры не образуют арифметическую прогрессию")
        }
    }
    catch (e: Exception) {
        println("Ошибка,ввода данных") }
    }


