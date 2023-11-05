package com.alura.orcamento.situacao;

import com.alura.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }

}