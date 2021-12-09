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
public class Dinheiro extends Pagamento{
    public Dinheiro(){
        super("Dinheiro");
    }
    
    @Override
    public String toString(){
        return "Pagamento: Dinheiro\n";
    }
}
