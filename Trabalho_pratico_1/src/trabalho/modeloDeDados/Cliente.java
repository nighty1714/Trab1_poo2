/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;

/**
 *
 * @author gabri
 */
public class Cliente extends Usuario{
    
    //--- atributos ---
    
    protected String categoriacnh;
    
    protected int vencimentocnh;
    
    protected int numerocnh;
    
    protected boolean ouro;
    
    //--- construtores ---
    
    public Cliente(String nome, String cpf, String rg, int data, String endereco, String cep, String email, int vencimentocnh, int numerocnh, boolean ouro, String categoriacnh){
        
        super(nome,cpf,rg,data,endereco, cep,email);
        
        this.numerocnh = numerocnh;
        
        this.categoriacnh = categoriacnh;
        
        this.vencimentocnh = vencimentocnh;
        
        this.ouro = ouro;
        
    }
    
    @Override
    public String toString() {
    
    return("Cliente:\nNome:" + nome + "RG:" + rg + "CPF:" + cpf + "Data de nascimento:" + data_nascimento + "Endereço:" + endereco + "CEP:" + cep + "Email:" + email + "Categoria CNH:" + categoriacnh + "Numero CNH:" + numerocnh + "Data de validade CNH:" + vencimentocnh + "Cliente ouro:" + ouro);
    
    }
    
    //--- metodos ---
    
    
    
    //--- get e set ---
    
    public String getcategoriacnh(){
        
        return this.categoriacnh;
        
    }
    
   public void setcategoriacnh(String categoriacnh){
       
       this.categoriacnh = categoriacnh;
       
   }
   
   public void setvencimentocnh(int vencimentocnh){
       
       this.vencimentocnh = vencimentocnh;
       
   }
    
    public int getvencimentocnh(){
        
        return this.vencimentocnh;
        
    }
    
    public void setnumerocnh(int numerocnh){
        
        this.numerocnh = numerocnh;
        
    }
    
    public int getnumerocnh(){
        
        return this.numerocnh;
        
    }
    
    public boolean getouro(){
        
        return this.ouro;
        
    }
    
    public void setouro(boolean ouro){
        
        this.ouro = ouro;
        
    }
    
}
