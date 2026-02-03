package br.com.java.estoque.respository;

import br.com.java.estoque.model.Categoria;
import br.com.java.estoque.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueRepositoryMemory {

    public List<Produto> estoque = new ArrayList<>();

    public void generateEstoque() {

        estoque.add(new Produto(1, "Arroz Tipo 1 5kg", 28.90, 120, Categoria.MERCEARIA));
        estoque.add(new Produto(2, "Feijão Carioca 1kg", 8.50, 200, Categoria.MERCEARIA));
        estoque.add(new Produto(3, "Açúcar Refinado 1kg", 4.80, 150, Categoria.MERCEARIA));
        estoque.add(new Produto(4, "Sal Refinado 1kg", 2.20, 300, Categoria.MERCEARIA));
        estoque.add(new Produto(5, "Farinha de Trigo", 5.40, 180, Categoria.MERCEARIA));

        estoque.add(new Produto(6, "Leite Integral 1L", 5.20, 250, Categoria.LATICINIOS));
        estoque.add(new Produto(7, "Leite Desnatado 1L", 5.40, 180, Categoria.LATICINIOS));
        estoque.add(new Produto(8, "Manteiga 200g", 9.90, 90, Categoria.LATICINIOS));
        estoque.add(new Produto(9, "Margarina 250g", 7.30, 110, Categoria.LATICINIOS));
        estoque.add(new Produto(10, "Yogurte Light", 4.50, 200, Categoria.LATICINIOS));

        estoque.add(new Produto(11, "Detergente Neutro 500ml", 2.60, 400, Categoria.LIMPEZA));
        estoque.add(new Produto(12, "Sabão em Pó 1kg", 14.90, 70, Categoria.LIMPEZA));
        estoque.add(new Produto(13, "Água Sanitária 1L", 3.40, 220, Categoria.LIMPEZA));
        estoque.add(new Produto(14, "Desinfetante 2L", 6.80, 160, Categoria.LIMPEZA));

        estoque.add(new Produto(15, "Refrigerante Cola 2L", 8.90, 140, Categoria.BEBIDAS));
        estoque.add(new Produto(16, "Suco de Uva 1L", 7.50, 95, Categoria.BEBIDAS));
        estoque.add(new Produto(17, "Suco de Laranja 1L", 7.50, 95, Categoria.BEBIDAS));
        estoque.add(new Produto(18, "Água Mineral 500ml", 2.00, 500, Categoria.BEBIDAS));

        estoque.add(new Produto(19, "Biscoito Recheado Chocolate", 4.20, 180, Categoria.BISCOITOS_SNACKS));
        estoque.add(new Produto(20, "Bolacha de Água e Sal", 3.80, 160, Categoria.BISCOITOS_SNACKS));
        estoque.add(new Produto(21, "Salgadinho Milho 100g", 6.50, 130, Categoria.BISCOITOS_SNACKS));
    }
}
