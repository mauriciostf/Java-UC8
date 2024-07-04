
package aula12;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;


public class FormatadorCampos {
    
    public void formataCampoTelefone(JFormattedTextField field) throws ParseException{

    MaskFormatter mask = new MaskFormatter();
    mask.setMask("(##)#####-####");
    mask.install(field);
    
}
    
    
    public void formataCampoCPF(JFormattedTextField field) throws ParseException{

    MaskFormatter mask = new MaskFormatter();
    mask.setMask("###.###.###-##");
    mask.install(field);
    
}
     public void formataCampoTelefoneInternacional(JFormattedTextField field) throws ParseException{

    MaskFormatter mask = new MaskFormatter();
    mask.setMask("+##(##)####-####");
    mask.install(field);    
}
 public void formataCampoCEP(JFormattedTextField field) throws ParseException{

    MaskFormatter mask = new MaskFormatter();
    mask.setMask("##.###-###");
    mask.install(field);
    
}
 
  public void formataPlacaAutomovel(JFormattedTextField field) throws ParseException{

    MaskFormatter mask = new MaskFormatter();
    mask.setMask("###-####");
    mask.install(field);
    
}
  
   public void formataCampoCNPJ(JFormattedTextField field) throws ParseException{

    MaskFormatter mask = new MaskFormatter();
    mask.setMask("##.###.###/####-##");
    mask.install(field);
    
}
   
    public void formataCampoTituloEleitor(JFormattedTextField field) throws ParseException{

    MaskFormatter mask = new MaskFormatter();
    mask.setMask("##########/##");
    mask.install(field);
    
}
    
     public void formataCampoDataNascimento(JFormattedTextField field) throws ParseException{

    MaskFormatter mask = new MaskFormatter();
    mask.setMask("##/##/####");
    mask.install(field);
    
}
    
}
