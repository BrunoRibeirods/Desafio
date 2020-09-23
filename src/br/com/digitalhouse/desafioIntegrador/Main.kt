package br.com.digitalhouse.desafioIntegrador

fun main() {
    val harryPotter = Livro(123, "Harry Potter e ordem da Fenix", "J.K. Row", 2020, 20.00)
    val crepusculo = Livro(456,"Vampiros","seila",2020,5.50)
    val estoque1 = Estoque()


    estoque1.cadastrarLivro(harryPotter, crepusculo)
    estoque1.consultarLivro(123)



    }


