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

        if (produto == null) {
            throw new RuntimeException("Produto não pode ser nulo");
        }

        if (produto.getId() == null ||
                produto.getNome() == null ||
                produto.getCategoria() == null ||
                produto.getPreco() == null ||
                produto.getQuantidade() == null) {

            throw new RuntimeException("Todos os campos são obrigatórios");
        }

        if (produto.getNome().trim().isEmpty() ||
                produto.getCategoria().trim().isEmpty()) {

            throw new RuntimeException("Nome e categoria não podem estar vazios");
        }

        if (produto.getId() <= 0) {
            throw new RuntimeException("ID inválido");
        }

        if (produto.getPreco() < 0) {
            throw new RuntimeException("Preço inválido");
        }

        if (produto.getQuantidade() < 0) {
            throw new RuntimeException("Quantidade inválida");
        }

        if (listaDeProdutos.stream()
                .anyMatch(p -> p.getId().equals(produto.getId()))) {

            throw new RuntimeException("Produto já cadastrado");
        }

        listaDeProdutos.add(produto);

        System.out.println("Produto salvo com sucesso");
    }

    //Retorna a lista completa de produtos
    public List<Produto> listarTodos(){
        if (listaDeProdutos.isEmpty()){
            System.out.println("Nenhum produto cadastrado");
        }

        return new ArrayList<>(listaDeProdutos);
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

        Produto produtoExistente = buscarPorId(id);
        this.listaDeProdutos.remove(produtoExistente);
        System.out.println("Produto removido com sucesso");
    }


}
