package br.com.digitalhouse.desafioIntegrador

fun main() {
    //Cadastrando Livros
    val harry = Livro(123, "Harry", "Jk", 2020, 20.0)
    val crepusculo = Livro(124, "crepusculo", "Jk", 2020, 20.0)

    //Criando Uma Coleção
    val futebol = Livro(123, "Pele", "Jk", 2020, 20.0)
    val percy = Livro(124, "Percy jackson", "Jk", 2020, 20.0)
    val listaAleatoria = mutableListOf<Livro>()
    listaAleatoria.add(futebol)
    listaAleatoria.add(percy)

    val colecao = ColecaoLivro("Açao", listaAleatoria)


    //Criando o estoque
    val estoque = Estoque()
    estoque.cadastrarLivro(harry, crepusculo)
    estoque.consultarLivro(125)

    //Cadastro de coleção
    estoque.cadastrarColecao(colecao)

    //Efetuando Venda de coleção
    estoque.efetuarVenda(101)

}