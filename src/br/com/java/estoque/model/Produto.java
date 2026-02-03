package br.com.java.estoque.model;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private Categoria categoria;

    public Produto(int id, String nome, double preco, int quantidade, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void PrintProduto() {
        System.out.println(
                "ID: " + id +
                        " | Nome: " + nome +
                        " | Preço: R$ " + preco +
                        " | Quantidade: " + quantidade +
                        " | Categoria: " + categoria
        );
    }
}
