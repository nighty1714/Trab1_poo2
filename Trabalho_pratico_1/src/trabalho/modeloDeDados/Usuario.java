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
public abstract class Usuario {

    //--- atributos ---
    protected int codigoUsuario;
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Calendar dataNascimento;
    protected String endereco;
    protected String cep;
    protected String email;
   
    //--- construtores ----
    public Usuario(int codigoUsuario, String nome, String cpf, String rg, Calendar data_nascimento, String endereco, String cep, String email) {
        this.codigoUsuario = codigoUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = data_nascimento;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
    }
    
    //--- get e set ---
    public String getnome(){
        return this.nome;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public String getrg(){
        return this.rg;
    }
    
    public void setrg(String rg){
        this.rg = rg;
    }
    
    public String getcpf(){
        return this.cpf;
    }
    
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    
    public Calendar getdata(){
        return this.dataNascimento;
    }
    
    public void setdata(Calendar dataNascimento ){
        this.dataNascimento = dataNascimento;
    }
    
    public String getendereco(){
        return this.endereco;
    }
    
    public void setendereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getcep(){
        return this.cep;
    }
    
    public void setcep(String cep){
        this.cep = cep;
    }
    
    public String getemail(){
        return this.email;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    //--- metodos ----
    @Override
    public String toString() {
        return("Código de usuário: " + Integer.toString(codigoUsuario) + "\nNome: " + nome + "\nRG: " + rg + "\nCPF: " + cpf + "\nData de nascimento: " + dataNascimento.get(Calendar.DATE) + "/" + dataNascimento.get(Calendar.MONTH) + "/" + dataNascimento.get(Calendar.YEAR) + "\nEndereço: " + endereco + "\nCEP: " + cep + "\nEmail: " + email);
    }
}
