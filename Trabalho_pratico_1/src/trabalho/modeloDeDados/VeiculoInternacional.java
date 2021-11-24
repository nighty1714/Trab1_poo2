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
public class VeiculoInternacional extends Veiculo {
    protected float taxaImpostoEstadual;
    protected float taxaImpostoFederal;

    public VeiculoInternacional(float taxaImpostoEstadual, float taxaImpostoFederal, int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, String placa, String categoria, float valorFipe, float valorDiaria, boolean alugado) {
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, placa, categoria, valorFipe, valorDiaria, alugado);
        this.taxaImpostoEstadual = taxaImpostoEstadual;
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    public float getTaxaImpostoEstadual() {
        return taxaImpostoEstadual;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoEstadual(float taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }
    
    @Override
    public float calcularValorDiaria(){
        //
        return valorDiaria;
    }

    @Override
    public String toString() {
        return "VeiculoInternacional{" + "codigoVeiculo=" + codigoVeiculo + ", nomeModelo=" + nomeModelo + ", montadora=" + montadora + ", anoFabricacao=" + anoFabricacao + ", placa=" + placa + ", categoria=" + categoria + ", valorFipe=" + valorFipe + ", valorDiaria=" + valorDiaria + ", alugado=" + alugado + "taxaImpostoEstadual=" + taxaImpostoEstadual + ", taxaImpostoFederal=" + taxaImpostoFederal + '}';
    }
    
    
    
}
