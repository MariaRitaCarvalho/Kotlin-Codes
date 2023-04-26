// Faça um programa que calcule o fatorial de um número.

fun main() {
  print("Digite um número de 1 a 13: ") // Por enquanto
  val numero = readLine()!!.toIntOrNull()
  if (numero == null) {
    println("Entrada Inválida.")
    return
  }
  val fatorial = fatorial(numero)
  println("O fatorial de $numero é $fatorial.")
}

fun fatorial(n: Int): Int {
  return if (n == 0) {
    1
  } else {
    n * fatorial(n - 1)
  }
}
