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

    public String getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(String categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public Calendar getVencimentoCNH() {
        return vencimentoCNH;
    }

    public void setVencimentoCNH(Calendar vencimentoCNH) {
        this.vencimentoCNH = vencimentoCNH;
    }

    public boolean isClienteOuro() {
        return clienteOuro;
    }

    public void setClienteOuro(boolean clienteOuro) {
        this.clienteOuro = clienteOuro;
    }
    
    
    //--- metodos ---
    @Override
    public String toString() {
        return("Código de usuário: " + Integer.toString(codigoUsuario) + "\nNome:" + nome + "\nRG:" + rg + "\nCPF:" + cpf + "\nData de nascimento: " + dataNascimento.get(Calendar.DATE) + "/" + dataNascimento.get(Calendar.MONTH) + "/" + dataNascimento.get(Calendar.YEAR) + "Endereço:" + endereco + "\nCEP:" + cep + "\nEmail:" + email + "\nCategoria CNH:" + categoriaCNH + "\nNumero CNH:" + numeroCNH + "\nValidade CNH:" + vencimentoCNH + "\nCliente ouro: " + Boolean.toString(clienteOuro));
    }
}
