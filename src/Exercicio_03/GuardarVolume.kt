package Exercicio_03

class GuardarVolume {
        val dicionario = mutableMapOf<Int, ArrayList<Peca>>()
        var i: Int = 100

        fun guardarPecas(listaDePeca: ArrayList<Peca>):Int{
            i += 1
            dicionario[i] = listaDePeca
            return i
        }

        fun mostrarPeca() {
            dicionario.forEach { (chave, lista) ->
                println(chave)
                lista.forEach {
                    println(it.tipoDePeca)
                    println(it.marca)
                    println(it.modelo)
                }
            }
        }

        fun mostarPecas(numero: Int){
            dicionario[i]?.forEach {
                println("Tipo ${it.tipoDePeca}")
                println("Marca: ${it.marca}")
                println("Modelo: ${it.modelo}")
            }
        }

        fun devolverPecas(num:Int){
            dicionario.remove(num)
        }
}