/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;
import java.io.Serializable;
import java.util.Calendar;
/**
 *
 * @author gabri
 */
public abstract class Usuario implements Serializable{

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

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getRG() {
        return rg;
    }

    public void setRG(String rg) {
        this.rg = rg;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return cep;
    }

    public void setCEP(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //--- metodos ----
    @Override
    public String toString() {
        return("Código de usuário: " + Integer.toString(codigoUsuario) + "\nNome: " + nome + "\nRG: " + rg + "\nCPF: " + cpf + "\nData de nascimento: " + dataNascimento.get(Calendar.DATE) + "/" + dataNascimento.get(Calendar.MONTH) + "/" + dataNascimento.get(Calendar.YEAR) + "\nEndereço: " + endereco + "\nCEP: " + cep + "\nEmail: " + email);
    }
}
