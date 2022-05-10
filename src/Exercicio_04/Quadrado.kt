package Exercicio_04

import kotlin.system.exitProcess

class Quadrado:Geometrica {
    val buscarClasseMenu = Menu()
    var soma = 0
    var resultado = 0
    var opcaoParaRealizar = 0
    override var raio: Double = 0.0
    override var base: Double = 0.0
        get() = field
    override var altura: Double = 0.0
        get() = field
    var listaLadosQuadrado = ArrayList<Int>()
    var listaAreaQuadrado = mutableListOf<Double>()

    fun ladosQuadrados() {
        for (i: Int in 1..4) {
            println("lados $i: ")
            var lado = readln().toInt()
            soma = soma + lado
            listaLadosQuadrado.add(lado)
        }
        println("Soma lados é $soma")
    }
    fun mostarDadoLado(){
        println("Lados de quadrado é ")
        println(listaLadosQuadrado)
    }

    override fun calculoArea() {
        println("Valor base: ")
        base = readln().toDouble()
        println("Valor altura: ")
        altura = readln().toDouble()

        var resultado = base * altura
        println("Resultado a area de quadrado é: $resultado")

        listaAreaQuadrado.add(resultado)
    }

    override fun dados() {
    }

    override fun ladoDeCirculo() {
    }

    override fun ladosRetangulo() {
        TODO("Not yet implemented")
    }


    fun listaAreaFormas() {
        println("Lista Areas: ")
        println(listaAreaQuadrado)
    }

    override fun opcaoUsuario() {
            for (i: Int in 0..opcaoParaRealizar) {
                println(
                    "Oque voce gostaria fazer?\n" +
                            "[1]->Soma todos lados\n" +
                            "[2]->calcula area\n" +
                            "[3]->Dados lados ou raio\n" +
                            "[4]->Dados todas area\n" +
                            "[5]->Volta ao menu principal\n" +
                            "[6]->Sair\n"
                )
                opcaoParaRealizar = readln().toInt()

                if (opcaoParaRealizar == 1) {
                    ladosQuadrados()
                } else if (opcaoParaRealizar == 2) {
                    calculoArea()
                } else if (opcaoParaRealizar == 3) {
                    mostarDadoLado()
                }else if (opcaoParaRealizar == 4) {
                    listaAreaFormas()
                } else if(opcaoParaRealizar==5){
                    buscarClasseMenu.exibirOpcao()
                }else if (opcaoParaRealizar == 6) {
                    exitProcess(0)
                    Menu()
                } else {
                    println("opção inválido")
                    opcaoUsuario()
                }
                opcaoUsuario()
            }
        }
}