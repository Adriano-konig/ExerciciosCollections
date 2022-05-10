package Exercicio_05
const val bola = "bola"
const val boneca = "boneca"
const val dado = "dado"

fun main() {
    val map = mapOf(
        bola to "azul",
        boneca to "amarela",
        dado to "rosa"
    )

    println("Chave = Values:")
    println(map)
}