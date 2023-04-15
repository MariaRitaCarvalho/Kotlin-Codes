//Faça um programa que verifique se um número é positivo ou negativo.

fun main() {
  print("Digite um número inteiro: ")
  val num = readLine()?.toIntOrNull()
  if (num == null) {
    println("Entrada inválida.")
    return
  }
  if (num > 0) {
    println("O número é positivo.")
  } else if (num < 0) {
    println("O número é negativo.")
  } else {
    println("O número é neutro.")
  }
}
