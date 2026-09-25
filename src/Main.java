import br.edu.aesa.app.ProdutoApp;

public class Main {
    public static void main(String[] args) {
        ProdutoApp produtoApp = new ProdutoApp();

        try{
            produtoApp.executar();
        } catch (Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());

        }
    }
}