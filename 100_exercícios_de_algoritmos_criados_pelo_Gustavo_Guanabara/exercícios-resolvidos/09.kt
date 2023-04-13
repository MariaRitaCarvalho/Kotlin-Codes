/*
Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar.
Considere US$1,00 = R$3,45.
*/

fun main () {
  val taxaDeCambio = 3.45
  print("Digite o valor em reais que você tem na carteira: ")
  var carteira = readLine()?.replace(",", ".")?.toDoubleOrNull()

  if (carteira != null) {
    val valorEmDolar = carteira / taxaDeCambio
    println("Com R$ ${"%.2f".format(carteira)}, você pode comprar US$ ${"%.2f".format(valorEmDolar)}")
  } else {
    println("Entrada inválida. Por favor, insira apenas números inteiros ou separados por ponto ou vírgula.")
  }
}
