package com.alura.imposto;

import java.math.BigDecimal;
import com.alura.orcamento.Orcamento;

public class CalculadoraDeImpostos{

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    } 

}