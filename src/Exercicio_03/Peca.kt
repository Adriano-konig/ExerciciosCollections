package Exercicio_03

abstract class Peca (val tipoDePeca: String){
    var marca: String =""
    var modelo: String = ""

    open fun armazenar(){
        println("Marca $tipoDePeca")
        marca = readln()
        println("Modelo de $tipoDePeca")
        modelo = readln()
    }
    abstract fun retirada()
}