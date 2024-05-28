//E31, esta classe foi criada após criar o formulário frmProdutos, a primeira coisa que foi feita foi criar uma classe para a conversão de String para int na hora de definir o preço do produto.

 package classes;

public class Utilidades {
    //método isNumeric está sendo usado para receber a string e verificar se ela pode ser transformada em número
    public static boolean isNumeric (String Numero){
        //tentando converter a String Numero em int
        try{
            Integer.parseInt(Numero);
            return true;
            
        //caso a String Numero tiver algo além de números, o catch vai apontar uma excessão e não será convertido    
        }catch (NumberFormatException nfe) {
            return false;
        }
    }
    
}
