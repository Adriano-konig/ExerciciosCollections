package Exercicio_01

interface Teste {
    val listaNumeros: MutableList<Int>
        get() = mutableListOf<Int>()

    fun mostrarnumeros(){
        for(numeros in listaNumeros){
            println(numeros)
        }
    }
}