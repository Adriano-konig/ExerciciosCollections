package Exercicio_04

import kotlin.system.exitProcess

class Circulo: Geometrica {
    val buscarClasseMenu = Menu()
    val buscarClasseQuadrado = Quadrado()
    val listaAreaCirculo = mutableListOf<Double>()
    var listaLadosCirculo = mutableListOf<Double>()
    override var base:Double = 0.0
        get() = field
    override var altura:Double = 0.0
        get() = field
    override var raio:Double = 0.0
        get() = field

    var opcaoCirculo: Int = 0

    override fun calculoArea() {
        println("Valor raio: ")
        raio = readln().toDouble()

        var resultadoRaio = raio * raio
        var total = 3.14 * resultadoRaio

        println("Resultado a area de circulo é: $total")
        listaAreaCirculo.add(total)
    }

    override fun ladoDeCirculo(){
        println("Digite o valor de raio")
        raio = readln().toDouble()
        val lado = 2 * 3.14
        val totalLado = lado * raio
        println("Calculo de raio é: $totalLado")
        listaLadosCirculo.add(raio)

    }

    override fun ladosRetangulo() {
        TODO("Not yet implemented")
    }

    override fun dados(){
        println("Raio de circulo é: $listaLadosCirculo")
    }

   fun dadosArea(){
       println("Lista area: \n $listaAreaCirculo")
    }

    override fun opcaoUsuario() {
        for (i: Int in 0..opcaoCirculo) {
            println(
                "Oque voce gostaria fazer?\n" +
                        "[1]->Soma todos lados\n" +
                        "[2]->calcula area\n" +
                        "[3]->Dados lados ou raio\n" +
                        "[4]->Dados todas area\n" +
                        "[5]->Volta ao menu principal\n" +
                        "[6]->Sair\n"
            )
            opcaoCirculo = readln().toInt()

            if (opcaoCirculo == 1) {
                ladoDeCirculo()
            } else if (opcaoCirculo == 2) {
                calculoArea()
            } else if (opcaoCirculo == 3) {
                dados()
            }else if (opcaoCirculo == 4) {
                dadosArea()
            } else if(opcaoCirculo==5){
                buscarClasseMenu.exibirOpcao()
            }else if (opcaoCirculo == 6) {
                exitProcess(0)
                Menu()
            } else {
                println("opção inválido")
                opcaoUsuario()
            }
            opcaoUsuario()
        }
    }
    fun listaAreaFormas() {
        val pegarMetodoCalculoArea = calculoArea()
        println("Lista Areas: ")
        println(listaAreaCirculo)
    }

}