fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readLine()!!.toInt()
    print("Digite o segundo número: ")
    val numero2 = readLine()!!.toInt()
    val soma = numero1 + numero2
    println("A soma dos dois números é: $soma")
}