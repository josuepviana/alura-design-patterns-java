package com.alura.desconto;

import java.math.BigDecimal;

import com.alura.orcamento.Orcamento;

public class CalculadoraDeDescontos{

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoMaisCincoItens(
            new DescontoPorValor(new SemDesconto()));
    
        return desconto.calcular(orcamento);        
    }

}
