package com.alura;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.alura.desconto.CalculadoraDeDescontos;
import com.alura.imposto.CalculadoraDeImpostos;
import com.alura.imposto.ICMS;
import com.alura.imposto.ISS;
import com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

class AppTest {

    @Test
    @DisplayName("Teste de calculo de imposto simples.")
    void testImposto(){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println("Valor: " + orcamento.getValor() + " ICMS: " + calculadora.calcular(orcamento, new ICMS()));
        System.out.println("Valor: " + orcamento.getValor() + " ISS: " + calculadora.calcular(orcamento, new ISS()));

    }

    @Test
    @RepeatedTest(5)
    @DisplayName("Teste de desconto simples.")
    void testDesconto(){
        int quantidadeItens = (int) Math.floor(Math.random() * 11);
        BigDecimal valor = new BigDecimal(Math.floor(Math.random() * 1000));
        Orcamento orcamento = new Orcamento(valor, quantidadeItens);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println("Valor: " + orcamento.getValor() + " Qtd Itens: " + orcamento.getQuantidadeItens() + " Desconto: " + calculadora.calcular(orcamento));
        System.out.println("Valor: " + orcamento.getValor() + " Qtd Itens: " + orcamento.getQuantidadeItens() + " Desconto: " + calculadora.calcular(orcamento));

    }
}
