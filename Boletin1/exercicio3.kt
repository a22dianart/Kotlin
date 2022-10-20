/* Exercicio 3 */
fun main() {
    var Peso = 74
    var altura = 1.66
    var IMC = (Peso/(altura*altura))
    println("peso: $Peso")
    println("altura: $altura")
    println("IMC: $IMC \n \n")
    println("TABLA IMC \n-----------")
    println("Delgado: <18.5")
    println("Normal: entre 18.5 e 24.9")
    println("Sobrepeso: entre 25 e 29.9")
    print("Obeso: >=30")
}
