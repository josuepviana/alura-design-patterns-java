package com.alura.orcamento.situacao;

import java.math.BigDecimal;

import com.alura.orcamento.Orcamento;

public class Aprovado extends SituacaoOrcamento{
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }

}