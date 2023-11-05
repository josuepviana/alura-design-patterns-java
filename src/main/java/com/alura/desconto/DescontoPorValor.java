package com.alura.desconto;

import java.math.BigDecimal;

import com.alura.orcamento.Orcamento;

public class DescontoPorValor extends Desconto{
    
    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0; 
    }
}
