// Faça um programa que converta graus Celsius em Fahrenheit.

fun main() {
    print("Digite uma temperatura em graus Celsius: ")
    val celsius = readLine()?.replace(",", ".")?.toDoubleOrNull() 
    if (celsius == null) {
      println("Digite uma entrada válida.")
      return
    }
    
    val fahrenheit = (celsius * 1.8) + 32
    println("$celsius graus Celsius equivalem a ${"%.2f".format(fahrenheit)} graus Fahrenheit.")
}
