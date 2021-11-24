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

    public VeiculoNacional(float taxaImposto, int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, String placa, String categoria, float valorFipe, float valorDiaria, boolean alugado) {
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, placa, categoria, valorFipe, valorDiaria, alugado);
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
        //
        return valorDiaria;
    }

    @Override
    public String toString() {
        return "VeiculoNacional{" + "codigoVeiculo=" + codigoVeiculo + ", nomeModelo=" + nomeModelo + ", montadora=" + montadora + ", anoFabricacao=" + anoFabricacao + ", placa=" + placa + ", categoria=" + categoria + ", valorFipe=" + valorFipe + ", valorDiaria=" + valorDiaria + ", alugado=" + alugado + "taxaImposto=" + taxaImposto + '}';
    }
    
}
