package cadastrofornecedoresnovo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BancoForm {
    ArrayList<DadosFornecedores> itensBnaco = new ArrayList<>();
    
    //inserir itens no array
    public void inserirItemArray(DadosFornecedores novoItem){
    itensBnaco.add(novoItem);
    String mensagem = "Item inserido com sucesso!";
    JOptionPane.showMessageDialog(null, mensagem); 
            
    }
    //gravar itens no Arquivo externo CSV
    public void gravarDados(){
    PersistenciaDadosCSV gravarItens
    }
}
