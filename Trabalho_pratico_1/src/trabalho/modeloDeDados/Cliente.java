/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;
import java.util.Calendar;
/**
 *
 * @author gabri
 */
public class Cliente extends Usuario{
    
    //--- atributos ---
    protected String categoriaCNH;
    protected String numeroCNH;
    protected Calendar vencimentoCNH;
    protected boolean clienteOuro;
    
    //--- construtores ---
    public Cliente(String categoriaCNH, String numeroCNH, Calendar vencimentoCNH, boolean clienteOuro, int codigoUsuario, String nome, String cpf, String rg, Calendar data_nascimento, String endereco, String cep, String email) {
        super(codigoUsuario, nome, cpf, rg, data_nascimento, endereco, cep, email);
        this.categoriaCNH = categoriaCNH;
        this.numeroCNH = numeroCNH;
        this.vencimentoCNH = vencimentoCNH;
        this.clienteOuro = clienteOuro;
    }
    
    //--- get e set ---
    public String getcategoriaCNH(){
        return this.categoriaCNH;
    }
    
   public void setcategoriacnh(String categoriaCNH){
       this.categoriaCNH = categoriaCNH;
   }
   
   public void setvencimentoCNH(Calendar vencimentoCNH){
       this.vencimentoCNH = vencimentoCNH;
   }
    
    public Calendar getvencimentoCNH(){
        return this.vencimentoCNH;
    }
    
    public void setnumeroCNH(String numeroCNH){
        this.numeroCNH = numeroCNH;
    }
    
    public String getnumeroCNH(){
        return this.numeroCNH;
    }
    
    public boolean getClienteOuro(){
        return this.clienteOuro;
    }
    
    public void setClienteOuro(boolean clienteOuro){
        this.clienteOuro = clienteOuro;
    }
    
    //--- metodos ---
    @Override
    public String toString() {
        return("Código de usuário: " + Integer.toString(codigoUsuario) + "\nNome:" + nome + "\nRG:" + rg + "\nCPF:" + cpf + "\nData de nascimento:" + dataNascimento + "Endereço:" + endereco + "\nCEP:" + cep + "\nEmail:" + email + "\nCategoria CNH:" + categoriaCNH + "\nNumero CNH:" + numeroCNH + "\nValidade CNH:" + vencimentoCNH + "\nCliente ouro: " + Boolean.toString(clienteOuro));
    }
}
