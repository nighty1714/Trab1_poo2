/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.modeloDeDados;

import java.io.Serializable;

/**
 *
 * @author Nozawa
 */
public class VeiculoImportado extends Veiculo {
    protected float taxaImpostoEstadual;
    protected float taxaImpostoFederal;

    public VeiculoImportado(float taxaImpostoEstadual, float taxaImpostoFederal, int codigoVeiculo, String nomeModelo, String montadora, int anoFabricacao, String placa, String categoria, float valorFipe, boolean alugado, float taxaLucro) {
        super(codigoVeiculo, nomeModelo, montadora, anoFabricacao, placa, categoria, valorFipe, alugado, taxaLucro);
        this.taxaImpostoEstadual = taxaImpostoEstadual;
        this.taxaImpostoFederal = taxaImpostoFederal;
        this.valorDiaria = calcularValorDiaria();
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
        float total = valorFipe*(1+taxaImpostoEstadual+taxaImpostoFederal+taxaLucro)/365.0f;
        return total;
    }

    @Override
    public String toString() {
        String str = "Código do Veiculo: " + codigoVeiculo + "\nNome do modelo: " + nomeModelo + "\nMontadora: " + montadora + 
                "\nAno de fabricação: " + anoFabricacao + "\nPlaca: " + placa + "\nCategoria: " + categoria + "\nValor FIPE: " + valorFipe +
                "\nValor da diária: " + valorDiaria + "\nAlugado: ";
        if(alugado){
            str += "Sim";
        }else{
            str += "Não";
        }
        str += "\nTaxa de imposto estadual: " + taxaImpostoEstadual + "\nTaxa de imposto federal: " + taxaImpostoFederal + "\n";
        return str;
    }
    
    
    
}
