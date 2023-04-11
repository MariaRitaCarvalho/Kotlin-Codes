/*
Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 185.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm
*/

fun main() {
    print("Digite uma distância em metros: ")
    val dist = readLine()?.replace(",", ".")?.toDoubleOrNull()
    if (dist == null) {
        println("Entrada inválida. Por favor, insira apenas números inteiros ou separados por ponto ou vírgula.")
        return
    }
    val km = dist / 1000
    val hm = dist / 100
    val dam = dist / 10
    val dm = dist * 10
    val cm = dist * 100
    val mm = dist * 1000

    println("""
    A distância $dist m corresponde a:
    ${"%.2f".format(km)} km
    ${"%.2f".format(hm)} hm
    ${"%.2f".format(dam)} dam
    ${"%.2f".format(dm)} dm
    ${"%.2f".format(cm)} cm
    ${"%.2f".format(mm)} mm
    """.trimIndent())
}
