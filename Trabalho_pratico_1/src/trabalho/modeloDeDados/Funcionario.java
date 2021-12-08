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
public class Funcionario extends Usuario{
    
    //--- atributos ---
    protected float salario;
    protected String pis;
    protected Calendar dataAdmissao;
    
    //--- construtores ---
    public Funcionario(float salario, String pis, Calendar dataAdmissao, int codigoUsuario, String nome, String cpf, String rg, Calendar data_nascimento, String endereco, String cep, String email) {
        super(codigoUsuario, nome, cpf, rg, data_nascimento, endereco, cep, email);
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }
    
    //--- get e set ---
    public void setSalario( float salario){
        this.salario = salario;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public void setPis(String pis){
        this.pis = pis;
    }
    
    public String getPis(){
        return this.pis;
    }
    
    public void setDataAdmissao(Calendar dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }
    
    public Calendar getDataAdmissao(){
        return this.dataAdmissao;
    }
    
    //--- metodos ---
    @Override
    public String toString() {
        return("Funcionario:\n Nome:" + nome + "RG:" + rg + "CPF:" + cpf + "\nData de nascimento: " + dataNascimento.get(Calendar.DATE) + "/" + dataNascimento.get(Calendar.MONTH) + "/" + dataNascimento.get(Calendar.YEAR) + "Endereço:" + endereco + "CEP:" + cep + "Email:" + email + "Salario:" + salario + "PIS:" + pis + "Data de admissão:" + dataAdmissao.get(Calendar.DATE) + "/" + dataAdmissao.get(Calendar.MONTH) + "/" + dataAdmissao.get(Calendar.YEAR));
    }
}
