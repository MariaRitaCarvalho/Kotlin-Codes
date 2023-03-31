// Faça um programa que verifique se um número é par ou ímpar.

fun main() {
    print("Digite um número inteiro: ")
    var num = readLine()?.toIntOrNull()
    if (num == null){
      println("Número inválido inserido.")
      return
    }
    var num2 = num?.rem(2)
    if (num2 == 0) { 
      println("O número é par")
    } else println("O número é ímpar")
}
