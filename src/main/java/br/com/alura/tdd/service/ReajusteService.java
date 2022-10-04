package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void reajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal percentual = desempenho.percentualAumento();
        BigDecimal aumento = funcionario.getSalario().multiply(percentual);

        funcionario.reajustarSalario(aumento);
    }
}
