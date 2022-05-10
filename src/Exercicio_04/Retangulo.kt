package Exercicio_04

import kotlin.system.exitProcess

class Retangulo: Geometrica {
    override var raio: Double = 0.0
    val buscarClasseMenu = Menu()
    var soma: Double = 0.0
    var opcaoRetangulo: Int = 0
    override var base: Double = 0.0
        get() = field
    override var altura: Double = 0.0
        get() = field
    var listaLadosRetangulo = ArrayList<Int>()
    var listaAreaRetangulo = mutableListOf<Double>()

    override fun calculoArea() {
        println("Valor base: ")
        base = readln().toDouble()
        println("Valor altura: ")
        altura = readln().toDouble()

        var resultado = base * altura

        println("Resultado a area de retângulo é: $resultado")
        listaAreaRetangulo.add(resultado)
    }

    override fun ladosRetangulo() {
        for (i: Int in 1..4) {
            println("lados $i: ")
            var lado = readln().toInt()
            soma = soma + lado
            listaLadosRetangulo.add(lado)
        }
        println("Somando lados é: $soma")
    }
    override fun dados() {
        println("valores de lados: ")
        println(listaLadosRetangulo)
    }
   fun dadosAreaRetangulo() {
        println("valores de lados: ")
        println(listaAreaRetangulo)
    }


    override fun opcaoUsuario() {
            for (i: Int in 0..opcaoRetangulo) {
                println(
                    "Oque voce gostaria fazer?\n" +
                            "[1]->Soma todos lados\n" +
                            "[2]->calcula area\n" +
                            "[3]->Dados lados ou raio\n" +
                            "[4]->Dados todas area\n" +
                            "[5]->Volta ao menu principal\n" +
                            "[6]->Sair\n"
                )
                opcaoRetangulo = readln().toInt()

                if (opcaoRetangulo == 1) {
                    ladosRetangulo()
                } else if (opcaoRetangulo == 2) {
                    calculoArea()
                } else if (opcaoRetangulo == 3) {
                    dados()
                } else if (opcaoRetangulo == 4) {
                    dadosAreaRetangulo()
                } else if (opcaoRetangulo == 5) {
                    buscarClasseMenu.exibirOpcao()
                } else if (opcaoRetangulo == 6) {
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
            println(listaAreaRetangulo)
        }

        fun mostarDadoLado(listaLadosRetangulo: ArrayList<Int>) {
            val pegarMetodoLadosQuadrado = ladosRetangulo()
            println("Lados de Retangulo é ")
            println(listaLadosRetangulo)
        }

        override fun ladoDeCirculo() {
            TODO("Not yet implemented")
        }
}