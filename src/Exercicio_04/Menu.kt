package Exercicio_04

import kotlin.system.exitProcess

class Menu {
    var opcao:Int=0
    fun exibirOpcao() {
            for (i: Int in 0..opcao) {
                println(
                    "Qual geometrica gostaria fazer calculo?\n" +
                            "[1] -> Quadrado\n" +
                            "[2] -> Circulo\n" +
                            "[3] -> Retangulo\n" +
                            "[4] -> Sair\n"
                )
                opcao = readln().toInt()

                if (opcao == 1) {
                    Quadrado().opcaoUsuario()
                }  else if (opcao == 2) {
                    Circulo().opcaoUsuario()
                } else if (opcao == 3) {
                    Retangulo().opcaoUsuario()
                } else if (opcao == 4) {
                    println("Encerrado com sucesso")
                    exitProcess(0)
                } else {
                    println("Opção inválido!!!")
                }
                exibirOpcao()
            }
        }
    }
//}