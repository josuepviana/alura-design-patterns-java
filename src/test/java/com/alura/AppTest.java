package com.alura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.alura.desconto.CalculadoraDeDescontos;
import com.alura.imposto.CalculadoraDeImpostos;
import com.alura.imposto.ICMS;
import com.alura.imposto.ISS;
import com.alura.orcamento.Orcamento;
import com.alura.pedido.GeraPedido;

import java.math.BigDecimal;

class AppTest {
    Orcamento orcamento;
    BigDecimal valor;
    int quantidadeItens;

    @BeforeEach
    void setUp(){
        quantidadeItens = (int) Math.floor(Math.random() * 11);
        valor = new BigDecimal(Math.floor(Math.random() * 1000));
        orcamento = new Orcamento(valor, quantidadeItens);
    }

    @Test
    @DisplayName("Teste de calculo de imposto simples.")
    void testImposto(){
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println("Valor: " + orcamento.getValor() + " ICMS: " + calculadora.calcular(orcamento, new ICMS()));
        System.out.println("Valor: " + orcamento.getValor() + " ISS: " + calculadora.calcular(orcamento, new ISS()));

    }

    @Test
    @RepeatedTest(5)
    @DisplayName("Teste de desconto simples.")
    void testDesconto(){
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println("Valor: " + orcamento.getValor() + " Qtd Itens: " + orcamento.getQuantidadeItens() + " Desconto: " + calculadora.calcular(orcamento));
        System.out.println("Valor: " + orcamento.getValor() + " Qtd Itens: " + orcamento.getQuantidadeItens() + " Desconto: " + calculadora.calcular(orcamento));

    }

    @Test
    @DisplayName("Teste simples usando gerador de pedidos.")
    void testPedido(){
        GeraPedido gerador = new GeraPedido("Alex", valor, quantidadeItens);
        gerador.executa();
    }
}
