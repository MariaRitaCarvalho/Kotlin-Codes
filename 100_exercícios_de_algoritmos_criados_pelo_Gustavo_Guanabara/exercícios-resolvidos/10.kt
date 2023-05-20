/*
Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e
a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
*/

fun main() {
    print("Digite a largura da parede em metros: ")
    val largura = readLine()?.replace(",", ".")?.toDoubleOrNull()
    if (largura == null) {
        println("Entrada inválida para largura.")
        return
    }

    print("Digite a altura da parede em metros: ")
    val altura = readLine()?.replace(",", ".")?.toDoubleOrNull()
    if (altura == null) {
        println("Entrada inválida para altura.")
        return
    }

    val area = largura * altura
    val tintaNecessaria = area / 2

    println("Área a ser pintada: %.2f metros quadrados".format(area))
    println("Quantidade de tinta necessária: %.2f litros".format(tintaNecessaria))
}
