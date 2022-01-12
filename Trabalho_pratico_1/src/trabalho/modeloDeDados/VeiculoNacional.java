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
public class VeiculoNacional extends Veiculo{
    protected float taxaImposto;

    public VeiculoNacional(float taxaImposto, int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, String placa, String categoria, float valorFipe, boolean alugado, float taxaLucro) {
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, placa, categoria, valorFipe, alugado, taxaLucro);
        this.valorDiaria = calcularValorDiaria();
        this.taxaImposto = taxaImposto;
    }

    public float getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(float taxaImposto) {
        this.taxaImposto = taxaImposto;
    }
    
    @Override
    public float calcularValorDiaria(){
        float total = valorFipe*(1+taxaImposto+taxaLucro)/365.0f;
        return total;
    }

    @Override
    public String toString() {
        String str = "Código do Veículo: " + codigoVeiculo + "\nNome do modelo: " + nomeModelo + "\nMontadora: " + montadora + 
                "\nAno de fabricação: " + anoFabricacao + "\nPlaca: " + placa + "\nCategoria: " + categoria + "\nValor FIPE: " + valorFipe + 
                "\nValor da diária: " + valorDiaria + "\nAlugado: ";
        if(alugado){
            str += "Sim";
        }else{
            str += "Não";
        }
        str += "\nTaxa de imposto=" + taxaImposto + "\n";
        return str;
    }
    
}
