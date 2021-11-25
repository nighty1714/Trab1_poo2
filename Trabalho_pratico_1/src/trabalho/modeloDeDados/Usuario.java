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
public abstract class Usuario {
    
    //--- atributos ---
    
    protected int codigo;
    
    protected String nome;
    
    protected String cpf;
    
    protected String rg;
    
    protected int data_nascimento;
    
    protected String endereco;
    
    protected String cep;
    
    protected String email;
    
    //--- construtores ----
    
    public Usuario(String nome, String cpf, String rg, int data, String endereco, String cep, String email){
        
        this.nome = nome;
        
        this.rg = rg;
        
        this.cpf = cpf;
        
        this.data_nascimento = data;
        
        this.endereco = endereco;
        
        this.cep = cep;
        
        this.email = email;
        
    }
    
    @Override
    public String toString() {
    
    return("Nome:" + nome + "RG:" + rg + "CPF:" + cpf + "Data de nascimento:" + data_nascimento + "Endereço:" + endereco + "CEP:" + cep + "Email:" + email);
    
    }
    
    //--- metodos ----
    
    
    
    
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
    
    public int getdata(){
        
        return this.data_nascimento;
        
    }
    
    public void setdata(int data){
        
        this.data_nascimento = data;
        
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
    
}
