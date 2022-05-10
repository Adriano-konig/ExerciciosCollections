package Exercicio_02

fun main() {
    val conjuntoNumeros2 = mutableSetOf<Int>()
    conjuntoNumeros2.add(1)
    conjuntoNumeros2.add(5)
    conjuntoNumeros2.add(5)
    conjuntoNumeros2.add(6)
    conjuntoNumeros2.add(7)
    conjuntoNumeros2.add(8)
    conjuntoNumeros2.add(8)
    conjuntoNumeros2.add(8)

    println("Conjutno de elementos: $conjuntoNumeros2")
    println("Diferença entre exercicio 1 e exercicio 02, exercicio 01 usei a mutableListOf pode repetir o mesmo numero " +
            "e exercicio 02 usei mutableSetOf numeros repetidos foram retirado")
}