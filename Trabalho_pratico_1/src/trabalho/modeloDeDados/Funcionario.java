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
public class Funcionario extends Usuario{
    
    //--- atributos ---
    
    protected float salario;
    
    protected String pis;
    
    protected int data_adimissao;
    
    //--- construtores ---
    
    public Funcionario(String nome, String cpf, String rg, int data, String endereco, String cep, String email, float salario, String pis, int data_adimissao){
        
        super(nome, cpf, rg, data, endereco, cep, email);
        
        this.salario = salario;
        
        this.pis = pis;
        
        this.data_adimissao = data_adimissao;
        
    }
    
    @Override
    public String toString() {
        
        return("Funcionario:\n Nome:" + nome + "RG:" + rg + "CPF:" + cpf + "Data de nascimento:" + data_nascimento + "Endereço:" + endereco + "CEP:" + cep + "Email:" + email + "Salario:" + salario + "PIS:" + pis + "Data de adimissão:" + data_adimissao);
        
    }
    
    //--- metodos ---
    
    
    
    //--- get e set ---
    
    public void setsalario( float salario){
        
        this.salario = salario;
        
    }
    
    public float getsalario(){
        
        return this.salario;
        
    }
    
    public void setpis(String pis){
        
        this.pis = pis;
        
    }
    
    public String getpis(){
        
        return this.pis;
        
    }
    
    public void setdataadimissao(int data){
        
        this.data_adimissao = data;
        
    }
    
    public int getdataadimissao(){
        
        return this.data_adimissao;
        
    }
    
}
