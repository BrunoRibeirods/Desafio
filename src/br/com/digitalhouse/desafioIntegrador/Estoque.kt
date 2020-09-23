package br.com.digitalhouse.desafioIntegrador

class Estoque(
        val estoqueLivro: MutableList<Livro> = mutableListOf<Livro>(),
        val estoqueColecaoLivro: MutableMap<Long, ColecaoLivro> = mutableMapOf<Long, ColecaoLivro>()
) {
    private var contador: Long = 100

    fun cadastrarLivro(vararg livro: Livro){
        estoqueLivro.addAll(livro)
    }

    fun cadastrarColecao(colecao: ColecaoLivro){
        estoqueColecaoLivro[contador] = colecao
        contador++
        println(contador)
    }


    fun consultarLivro(cod: Long){
        for(consulta in estoqueLivro){
            if (consulta.codigo == cod){
                println("Livro: ${consulta.titulo}")
                println("Autor: ${consulta.autor}")
                println("Ano: ${consulta.anoLancamento}")
                println("Preço: ${consulta.preco}")
                return
            }
        }
        println("Não encontrado")
    }

    fun efetuarVenda(cod: Long){
        for(livro in estoqueLivro){
            if(livro.codigo == cod){
                println("Livro -> ${livro.titulo} -> Vendido!")
                estoqueLivro.remove(livro)
                return
            }
        }

        if (cod in estoqueColecaoLivro.keys) {
            println("Coleção -> ${estoqueColecaoLivro[cod]?.descricao} -> Vendida!")
            estoqueColecaoLivro.remove(cod)
            return
        }


        println("Livro não encontrado.")


    }
}