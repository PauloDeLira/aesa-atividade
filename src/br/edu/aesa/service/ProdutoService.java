package br.edu.aesa.service;

import br.edu.aesa.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private List<Produto> listaDeProdutos;


    public ProdutoService() {
        this.listaDeProdutos = new ArrayList<>();
    }

    //Salva um produto na lista de produtos
    public void salvar(Produto produto) {
        if (listaDeProdutos.stream()
                .anyMatch(p -> p.getId().equals(produto.getId()))) {
            throw new RuntimeException("Produto já cadastrado");
        }

        listaDeProdutos.add(produto);
        System.out.println("Produto salvo com sucesso");
    }

    //Retorna a lista completa de produtos
    public List<Produto> listarTodos(){
        return this.listaDeProdutos;
    }

    //Busca um produto pelo seu ID
    public Produto buscarPorId(Long id){
        return this.listaDeProdutos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    //Atualiza um produto
    public void atualizarProduto(Produto produto){

        Produto produtoExistente = buscarPorId(produto.getId());

        produtoExistente.setNome(produto.getNome());
        produtoExistente.setCategoria(produto.getCategoria());
        produtoExistente.setPreco(produto.getPreco());
        produtoExistente.setQuantidade(produto.getQuantidade());

        System.out.println("Produto atualizado com sucesso");
    }

    //Remove um produto
    public void removerProduto(Long id){

        if (listaDeProdutos.isEmpty()){
            throw new RuntimeException("Lista de produtos vazia");
        }

        if (listaDeProdutos.stream()
                .noneMatch(p -> p.getId().equals(id))){
            throw new RuntimeException("Produto não encontrado para deletar.");
        }

        Produto produtoExistente = buscarPorId(id);
        this.listaDeProdutos.remove(produtoExistente);
        System.out.println("Produto removido com sucesso");
    }


}
