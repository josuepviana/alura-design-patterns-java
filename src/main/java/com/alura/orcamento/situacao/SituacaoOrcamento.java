package com.alura.orcamento.situacao;

import java.math.BigDecimal;

import com.alura.exceptions.SituacaoException;
import com.alura.orcamento.Orcamento;

public abstract class SituacaoOrcamento{
    
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new SituacaoException("Orçamento já aprovado!");
    }

    public void reprovar(Orcamento orcamento){
        throw new SituacaoException("Orçamento já reprovado!");
    }

    public void finalizar(Orcamento orcamento){
        throw new SituacaoException("Orçamento já finalizado!");
    }
}