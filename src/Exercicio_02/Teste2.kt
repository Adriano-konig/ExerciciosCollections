package Exercicio_02

interface Teste2 {
    val conjuntoNumeros2: MutableList<Int>
        get() = mutableListOf<Int>()

    fun mostrarnumeros(){
        for(numeros in conjuntoNumeros2){
            println(numeros)
        }
    }
}