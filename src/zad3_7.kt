fun main()
{
 try
 {
  print("Введите первую сторону треугольника: ")
  var a = readLine()!!.toDouble()
  print("Введите вторую сторону треугольника: ")
  var b = readLine()!!.toDouble()
  print("Введите третью сторону треугольника: ")
  var c = readLine()!!.toDouble()
  var P = (a + b + c) / 2
  if (a+b<c || a+c<b || b+c<a) { print("Такого треугольника несуществует") }
  else { if (a>0 && b>0 && c>0)
  { var S = Math.sqrt(P * (P - a) * (P - b) * (P - c))
   print("Площадь треугольника при помоще формулы Герона: ${S} ") }
   else
   { print("Сторона треугольника не может быть отрицательной или такого треугольника несуществует") }
  }
  }catch (e:Exception) {println("Ошибка,ввода данных") }
  }
