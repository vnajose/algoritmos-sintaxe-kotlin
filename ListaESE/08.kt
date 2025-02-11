fun main() {
    println("Quanto você ganha por hora? R$: ")
    val valorHora = readLine()!!.toDouble()

    println("Quantas horas você trabalhou no mês? ")
    val horasTrabalhadas = readLine()!!.toDouble()

    val salario = valorHora * horasTrabalhadas

    println("O seu salário no mês é: R$ %.2f".format(salario))
}

