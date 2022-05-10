package Exercicio_03

import kotlin.system.exitProcess

class Menu {

    val pegarClasseGuardarVolume = GuardarVolume()

    fun MenuOpcao(){
        println("Oque voce quer fazer:\n" +
                "[1] -> Armazenar\n" +
                "[2] -> Dados\n" +
                "[3] -> Retirar\n" +
                "[4] -> sair")
        var opcao = readln().toInt()

        if (opcao == 1){
            escolherTipoDePeca()
        }else if (opcao == 2){
            if(pegarClasseGuardarVolume.dicionario.isEmpty()){
                println("Armazena está vazio")
                MenuOpcao()
            }else{
                mostrarPecas()
            }
        }
        else if(opcao == 3){
            if (pegarClasseGuardarVolume.dicionario.isEmpty()){
                println("Armazena está vazio")
                MenuOpcao()
            }else{
                opcaoRetirada()
            }
        }
        else if(opcao == 4){
            println("Encerrando com sucesso")
            exitProcess(0)
        }else{
            println("opção inválido")
            MenuOpcao()
        }
    }

    fun escolherTipoDePeca() {
        println("Qual tipo:")
        println(
            "[1] -> Roupa\n" +
                    "[2] -> Calcado\n" +
                    "[3] -> sair\n"
        )
        var opcaotipo = readln().toInt()

        if (opcaotipo == 1) {
            val armazenarRoupa: Peca = Roupa()
            armazenarPeca(armazenarRoupa)
            novoLista()
        } else if (opcaotipo == 2) {
            val armazenarCalcado: Peca = Roupa()
            armazenarPeca(armazenarCalcado)
            novoLista()
        } else if (opcaotipo == 3) {
            exitProcess(0)
        } else {
            println("Opção inválido")
            escolherTipoDePeca()
        }
    }

    fun armazenarPeca(peca: Peca){
        val listaDePeca = ArrayList<Peca>()
        peca.armazenar()
        listaDePeca.add(peca)
        pegarClasseGuardarVolume.guardarPecas(listaDePeca)
    }
    fun novoLista(){
        println("oque vai fazer com esse peça?Vai guardar ou não responda apena numero 1= sim ou 2 = não")
        println("[1] -> Sim\n" +
                "[2] -> não")
        var opcaoUsuario = readln().toInt()
        if (opcaoUsuario == 1){
            escolherTipoDePeca()
        }else if(opcaoUsuario == 2){
            MenuOpcao()
        }else{
            println("Opção inválido apena 1 ou 2")
            novoLista()
        }
    }
    fun mostrarPecas(){
        println("Escolhe opção oque vc quer fazer\n " +
                "[1] -> uma peça\n" +
                "[2] -> dados das peças")
        var opcaoPecas = readln().toInt()

        if (opcaoPecas == 1){
            println("Digite a referencia: ")
            val digitadoReferencia = readln().toInt()

            if (digitadoReferencia in pegarClasseGuardarVolume.dicionario){
                pegarClasseGuardarVolume.mostarPecas(digitadoReferencia)
                MenuOpcao()
            }else{
                println("Não há peça aqui")
                mostrarPecas()
            }
        }else if (opcaoPecas == 2){
            pegarClasseGuardarVolume.mostrarPeca()
            MenuOpcao()
        }else{
            println("Inválido")
            mostrarPecas()
        }
    }

    fun opcaoRetirada(){
        println("Digite numero de referncia gostaria retirar:")
        var codigo = readln().toInt()

        if(codigo in pegarClasseGuardarVolume.dicionario) {
            pegarClasseGuardarVolume.dicionario[codigo]?.forEach {
                it.retirada()
            }
            pegarClasseGuardarVolume.devolverPecas(codigo)
        }else{
                println("opcao Invalido")
                MenuOpcao()
            }
        }
    }
