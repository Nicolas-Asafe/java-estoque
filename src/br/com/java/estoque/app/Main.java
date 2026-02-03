package br.com.java.estoque.app;
import br.com.java.estoque.data.EstoqueMemory;
import br.com.java.estoque.model.Categoria;
import br.com.java.estoque.model.Produto;
import br.com.java.estoque.service.EstoqueServiceMemory;

class Main {
    static void main(String[] args) {
        EstoqueServiceMemory estoque = new EstoqueServiceMemory();
        EstoqueMemory estoqueData = new EstoqueMemory();
        estoqueData.GenerateEstoque();
        estoque.estoque = estoqueData.estoque;

        // 🔥 Listar só Mercearia.
            for (Produto produto : estoque.listarPorCategoria(Categoria.MERCEARIA)) {
                produto.PrintProduto(); }
            // 🔥 Listar só laticínios.
                for (Produto produto : estoque.listarPorCategoria(Categoria.LATICINIOS)) {
                    produto.PrintProduto(); }

                // 🔥 Listar só Limpeza.
                    for (Produto produto : estoque.listarPorCategoria(Categoria.LIMPEZA)) {
                        produto.PrintProduto(); }

                    // 🔥 Listar só Bebidas.
                        for (Produto produto : estoque.listarPorCategoria(Categoria.BEBIDAS)) {
                            produto.PrintProduto(); }
    }
}
