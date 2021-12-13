/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;

/**
 *
 * @author Nozawa
 */
public class Cartao extends Pagamento{
    private String nome;
    private String bandeira;
    private String numero;

    public Cartao(String nome, String bandeira, String numero) {
        super("Cartão");
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
        
    @Override
    public String toString() {
        return "Tipo de pagamento: " + this.getTipoPagamento() + "\nNome: " + nome + "\nBandeira: " + bandeira + "\nNúmero: " + numero;
    }
    
}
