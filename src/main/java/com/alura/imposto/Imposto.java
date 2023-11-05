package com.alura.imposto;

import java.math.BigDecimal;

import com.alura.orcamento.Orcamento;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
