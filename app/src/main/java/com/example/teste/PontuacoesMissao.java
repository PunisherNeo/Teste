package com.example.teste;

import java.util.HashMap;
import java.util.Map;
public class PontuacoesMissao {
    public static Map<String, Map<String, Integer>> getPontuacoes() {
        Map<String, Map<String, Integer>> pontuacoesMissao = new HashMap<>();

        // BAIONETA
        Map<String, Integer> pontuacoesBaioneta = new HashMap<>();
        pontuacoesBaioneta.put("VARG", 65);
        pontuacoesBaioneta.put("DAVID", 210);
        pontuacoesBaioneta.put("SYNDROME", 65);
        pontuacoesBaioneta.put("JOE", 65);
        pontuacoesBaioneta.put("VALERA", 65);
        pontuacoesBaioneta.put("CAPISCE", 65);
        pontuacoesBaioneta.put("KLAUS", 155);
        pontuacoesBaioneta.put("SHI", 155);
        pontuacoesBaioneta.put("VICTOR", 155);
        pontuacoesBaioneta.put("SPENCER", 155);
        pontuacoesBaioneta.put("TRAVIS", 155);
        pontuacoesBaioneta.put("BATYA", 50);
        pontuacoesBaioneta.put("HAWK", 40);
        pontuacoesBaioneta.put("JASON", 150);
        pontuacoesBaioneta.put("BORIS", 150);
        pontuacoesBaioneta.put("THOR", 150);
        pontuacoesBaioneta.put("RICK", 150);
        pontuacoesBaioneta.put("MISHKA", 40);
        pontuacoesBaioneta.put("ROOKIE", 35);
        pontuacoesBaioneta.put("EPICOS", 200);

        pontuacoesMissao.put("BAIONETA", pontuacoesBaioneta);

        // BRECHA
        Map<String, Integer> pontuacoesBrecha = new HashMap<>();
        pontuacoesBrecha.put("VARG", 115);
        pontuacoesBrecha.put("DAVID", 115);
        pontuacoesBrecha.put("SYNDROME", 240);
        pontuacoesBrecha.put("JOE", 115);
        pontuacoesBrecha.put("VALERA", 115);
        pontuacoesBrecha.put("CAPISCE", 115);
        pontuacoesBrecha.put("KLAUS", 85);
        pontuacoesBrecha.put("SHI", 85);
        pontuacoesBrecha.put("VICTOR", 180);
        pontuacoesBrecha.put("SPENCER", 85);
        pontuacoesBrecha.put("TRAVIS", 85);
        pontuacoesBrecha.put("BATYA", 85);
        pontuacoesBrecha.put("HAWK", 85);
        pontuacoesBrecha.put("JASON", 85);
        pontuacoesBrecha.put("BORIS", 70);
        pontuacoesBrecha.put("THOR", 70);
        pontuacoesBrecha.put("RICK", 70);
        pontuacoesBrecha.put("MISHKA", 70);
        pontuacoesBrecha.put("ROOKIE", 55);
        pontuacoesBrecha.put("EPICOS", 200);

        pontuacoesMissao.put("BRECHA", pontuacoesBrecha);

        // B.S.S.
        Map<String, Integer> pontuacoesBSS = new HashMap<>();
        pontuacoesBSS.put("VARG", 95);
        pontuacoesBSS.put("DAVID", 255);
        pontuacoesBSS.put("SYNDROME", 95);
        pontuacoesBSS.put("JOE", 95);
        pontuacoesBSS.put("VALERA", 95);
        pontuacoesBSS.put("CAPISCE", 95);
        pontuacoesBSS.put("KLAUS", 70);
        pontuacoesBSS.put("SHI", 70);
        pontuacoesBSS.put("VICTOR", 70);
        pontuacoesBSS.put("SPENCER", 190);
        pontuacoesBSS.put("TRAVIS", 70);
        pontuacoesBSS.put("BATYA", 70);
        pontuacoesBSS.put("HAWK", 60);
        pontuacoesBSS.put("JASON", 160);
        pontuacoesBSS.put("BORIS", 60);
        pontuacoesBSS.put("THOR", 60);
        pontuacoesBSS.put("RICK", 60);
        pontuacoesBSS.put("MISHKA", 60);
        pontuacoesBSS.put("ROOKIE", 50);
        pontuacoesBSS.put("EPICOS", 200);

        pontuacoesMissao.put("B.S.S.", pontuacoesBSS);
        // COBERTURA
        Map<String, Integer> pontuacoesCobertura = new HashMap<>();
        pontuacoesCobertura.put("VARG", 115);
        pontuacoesCobertura.put("DAVID", 115);
        pontuacoesCobertura.put("SYNDROME", 115);
        pontuacoesCobertura.put("JOE", 115);
        pontuacoesCobertura.put("VALERA", 240);
        pontuacoesCobertura.put("CAPISCE", 115);
        pontuacoesCobertura.put("KLAUS", 85);
        pontuacoesCobertura.put("SHI", 85);
        pontuacoesCobertura.put("VICTOR", 85);
        pontuacoesCobertura.put("SPENCER", 85);
        pontuacoesCobertura.put("TRAVIS", 180);
        pontuacoesCobertura.put("BATYA", 85);
        pontuacoesCobertura.put("HAWK", 85);
        pontuacoesCobertura.put("JASON", 85);
        pontuacoesCobertura.put("BORIS", 85);
        pontuacoesCobertura.put("THOR", 150);
        pontuacoesCobertura.put("RICK", 70);
        pontuacoesCobertura.put("MISHKA", 70);
        pontuacoesCobertura.put("ROOKIE", 55);
        pontuacoesCobertura.put("EPICOS", 200);

        pontuacoesMissao.put("COBERTURA", pontuacoesCobertura);
        // DEMONSTRAÇÃO
        Map<String, Integer> pontuacoesDemonstracao = new HashMap<>();
        pontuacoesDemonstracao.put("VARG", 115);
        pontuacoesDemonstracao.put("DAVID", 115);
        pontuacoesDemonstracao.put("SYNDROME", 115);
        pontuacoesDemonstracao.put("JOE", 115);
        pontuacoesDemonstracao.put("VALERA", 115);
        pontuacoesDemonstracao.put("CAPISCE", 240);
        pontuacoesDemonstracao.put("KLAUS", 85);
        pontuacoesDemonstracao.put("SHI", 85);
        pontuacoesDemonstracao.put("VICTOR", 85);
        pontuacoesDemonstracao.put("SPENCER", 85);
        pontuacoesDemonstracao.put("TRAVIS", 85);
        pontuacoesDemonstracao.put("BATYA", 180);
        pontuacoesDemonstracao.put("HAWK", 70);
        pontuacoesDemonstracao.put("JASON", 70);
        pontuacoesDemonstracao.put("BORIS", 70);
        pontuacoesDemonstracao.put("THOR", 70);
        pontuacoesDemonstracao.put("RICK", 70);
        pontuacoesDemonstracao.put("MISHKA", 150);
        pontuacoesDemonstracao.put("ROOKIE", 55);
        pontuacoesDemonstracao.put("EPICOS", 200);

        pontuacoesMissao.put("DEMONSTRAÇÃO", pontuacoesDemonstracao);
        // FACA
        Map<String, Integer> pontuacoesFaca = new HashMap<>();
        pontuacoesFaca.put("VARG", 90);
        pontuacoesFaca.put("DAVID", 90);
        pontuacoesFaca.put("SYNDROME", 90);
        pontuacoesFaca.put("JOE", 90);
        pontuacoesFaca.put("VALERA", 320);
        pontuacoesFaca.put("CAPISCE", 90);
        pontuacoesFaca.put("KLAUS", 65);
        pontuacoesFaca.put("SHI", 240);
        pontuacoesFaca.put("VICTOR", 240);
        pontuacoesFaca.put("SPENCER", 65);
        pontuacoesFaca.put("TRAVIS", 240);
        pontuacoesFaca.put("BATYA", 60);
        pontuacoesFaca.put("HAWK", 55);
        pontuacoesFaca.put("JASON", 55);
        pontuacoesFaca.put("BORIS", 55);
        pontuacoesFaca.put("THOR", 55);
        pontuacoesFaca.put("RICK", 55);
        pontuacoesFaca.put("MISHKA", 55);
        pontuacoesFaca.put("ROOKIE", 45);
        pontuacoesFaca.put("EPICOS", 200);

        pontuacoesMissao.put("FACA", pontuacoesFaca);

        // HABITANTES
        Map<String, Integer> pontuacoesHabitantes = new HashMap<>();
        pontuacoesHabitantes.put("VARG", 95);
        pontuacoesHabitantes.put("DAVID", 95);
        pontuacoesHabitantes.put("SYNDROME", 225);
        pontuacoesHabitantes.put("JOE", 225);
        pontuacoesHabitantes.put("VALERA", 95);
        pontuacoesHabitantes.put("CAPISCE", 225);
        pontuacoesHabitantes.put("KLAUS", 70);
        pontuacoesHabitantes.put("SHI", 70);
        pontuacoesHabitantes.put("VICTOR", 70);
        pontuacoesHabitantes.put("SPENCER", 70);
        pontuacoesHabitantes.put("TRAVIS", 70);
        pontuacoesHabitantes.put("BATYA", 170);
        pontuacoesHabitantes.put("HAWK", 140);
        pontuacoesHabitantes.put("JASON", 60);
        pontuacoesHabitantes.put("BORIS", 60);
        pontuacoesHabitantes.put("THOR", 60);
        pontuacoesHabitantes.put("RICK", 60);
        pontuacoesHabitantes.put("MISHKA", 140);
        pontuacoesHabitantes.put("ROOKIE", 40);
        pontuacoesHabitantes.put("EPICOS", 200);

        pontuacoesMissao.put("HABITANTES", pontuacoesHabitantes);

        // HILDR
        Map<String, Integer> pontuacoesHildr = new HashMap<>();
        pontuacoesHildr.put("VARG", 480);
        pontuacoesHildr.put("DAVID", 100);
        pontuacoesHildr.put("SYNDROME", 100);
        pontuacoesHildr.put("JOE", 100);
        pontuacoesHildr.put("VALERA", 100);
        pontuacoesHildr.put("CAPISCE", 100);
        pontuacoesHildr.put("KLAUS", 70);
        pontuacoesHildr.put("SHI", 70);
        pontuacoesHildr.put("VICTOR", 70);
        pontuacoesHildr.put("SPENCER", 70);
        pontuacoesHildr.put("TRAVIS", 70);
        pontuacoesHildr.put("BATYA", 70);
        pontuacoesHildr.put("HAWK", 70);
        pontuacoesHildr.put("JASON", 60);
        pontuacoesHildr.put("BORIS", 300);
        pontuacoesHildr.put("THOR", 60);
        pontuacoesHildr.put("RICK", 60);
        pontuacoesHildr.put("MISHKA", 60);
        pontuacoesHildr.put("ROOKIE", 50);
        pontuacoesHildr.put("EPICOS", 200);

        pontuacoesMissao.put("HILDR", pontuacoesHildr);

        // LIMPEZA
        Map<String, Integer> pontuacoesLimpeza = new HashMap<>();
        pontuacoesLimpeza.put("VARG", 115);
        pontuacoesLimpeza.put("DAVID", 115);
        pontuacoesLimpeza.put("SYNDROME", 115);
        pontuacoesLimpeza.put("JOE", 240);
        pontuacoesLimpeza.put("VALERA", 115);
        pontuacoesLimpeza.put("CAPISCE", 115);
        pontuacoesLimpeza.put("KLAUS", 85);
        pontuacoesLimpeza.put("SHI", 85);
        pontuacoesLimpeza.put("VICTOR", 85);
        pontuacoesLimpeza.put("SPENCER", 180);
        pontuacoesLimpeza.put("TRAVIS", 85);
        pontuacoesLimpeza.put("BATYA", 85);
        pontuacoesLimpeza.put("HAWK", 70);
        pontuacoesLimpeza.put("JASON", 70);
        pontuacoesLimpeza.put("BORIS", 70);
        pontuacoesLimpeza.put("THOR", 70);
        pontuacoesLimpeza.put("RICK", 150);
        pontuacoesLimpeza.put("MISHKA", 70);
        pontuacoesLimpeza.put("ROOKIE", 55);
        pontuacoesLimpeza.put("EPICOS", 200);

        pontuacoesMissao.put("LIMPEZA", pontuacoesLimpeza);

        // LOGÍSTICA
        Map<String, Integer> pontuacoesLogistica = new HashMap<>();
        pontuacoesLogistica.put("VARG", 115);
        pontuacoesLogistica.put("DAVID", 240);
        pontuacoesLogistica.put("SYNDROME", 115);
        pontuacoesLogistica.put("JOE", 115);
        pontuacoesLogistica.put("VALERA", 115);
        pontuacoesLogistica.put("CAPISCE", 115);
        pontuacoesLogistica.put("KLAUS", 85);
        pontuacoesLogistica.put("SHI", 180);
        pontuacoesLogistica.put("VICTOR", 85);
        pontuacoesLogistica.put("SPENCER", 85);
        pontuacoesLogistica.put("TRAVIS", 85);
        pontuacoesLogistica.put("BATYA", 85);
        pontuacoesLogistica.put("HAWK", 85);
        pontuacoesLogistica.put("JASON", 85);
        pontuacoesLogistica.put("BORIS", 85);
        pontuacoesLogistica.put("THOR", 70);
        pontuacoesLogistica.put("RICK", 70);
        pontuacoesLogistica.put("MISHKA", 70);
        pontuacoesLogistica.put("ROOKIE", 55);
        pontuacoesLogistica.put("EPICOS", 200);

        pontuacoesMissao.put("LOGÍSTICA", pontuacoesLogistica);

        // MARTELO
        Map<String, Integer> pontuacoesMartelo = new HashMap<>();
        pontuacoesMartelo.put("VARG", 95);
        pontuacoesMartelo.put("DAVID", 95);
        pontuacoesMartelo.put("SYNDROME", 95);
        pontuacoesMartelo.put("JOE", 95);
        pontuacoesMartelo.put("VALERA", 95);
        pontuacoesMartelo.put("CAPISCE", 95);
        pontuacoesMartelo.put("KLAUS", 240);
        pontuacoesMartelo.put("SHI", 70);
        pontuacoesMartelo.put("VICTOR", 70);
        pontuacoesMartelo.put("SPENCER", 70);
        pontuacoesMartelo.put("TRAVIS", 70);
        pontuacoesMartelo.put("BATYA", 240);
        pontuacoesMartelo.put("HAWK", 60);
        pontuacoesMartelo.put("JASON", 60);
        pontuacoesMartelo.put("BORIS", 190);
        pontuacoesMartelo.put("THOR", 60);
        pontuacoesMartelo.put("RICK", 190);
        pontuacoesMartelo.put("MISHKA", 190);
        pontuacoesMartelo.put("ROOKIE", 50);
        pontuacoesMartelo.put("EPICOS", 200);

        pontuacoesMissao.put("MARTELO", pontuacoesMartelo);

        // M. BÁSICA
        Map<String, Integer> pontuacoesMBasica = new HashMap<>();
        pontuacoesMBasica.put("VARG", 160);
        pontuacoesMBasica.put("DAVID", 160);
        pontuacoesMBasica.put("SYNDROME", 160);
        pontuacoesMBasica.put("JOE", 160);
        pontuacoesMBasica.put("VALERA", 160);
        pontuacoesMBasica.put("CAPISCE", 160);
        pontuacoesMBasica.put("KLAUS", 120);
        pontuacoesMBasica.put("SHI", 120);
        pontuacoesMBasica.put("VICTOR", 120);
        pontuacoesMBasica.put("SPENCER", 120);
        pontuacoesMBasica.put("TRAVIS", 120);
        pontuacoesMBasica.put("BATYA", 120);
        pontuacoesMBasica.put("HAWK", 100);
        pontuacoesMBasica.put("JASON", 100);
        pontuacoesMBasica.put("BORIS", 100);
        pontuacoesMBasica.put("THOR", 100);
        pontuacoesMBasica.put("RICK", 100);
        pontuacoesMBasica.put("MISHKA", 100);
        pontuacoesMBasica.put("ROOKIE", 80);
        pontuacoesMBasica.put("EPICOS", 200);

        pontuacoesMissao.put("M. BÁSICA", pontuacoesMBasica);

        // RECONHECIMENTO
        Map<String, Integer> pontuacoesReconhecimento = new HashMap<>();
        pontuacoesReconhecimento.put("VARG", 240);
        pontuacoesReconhecimento.put("DAVID", 115);
        pontuacoesReconhecimento.put("SYNDROME", 115);
        pontuacoesReconhecimento.put("JOE", 115);
        pontuacoesReconhecimento.put("VALERA", 115);
        pontuacoesReconhecimento.put("CAPISCE", 115);
        pontuacoesReconhecimento.put("KLAUS", 180);
        pontuacoesReconhecimento.put("SHI", 85);
        pontuacoesReconhecimento.put("VICTOR", 85);
        pontuacoesReconhecimento.put("SPENCER", 85);
        pontuacoesReconhecimento.put("TRAVIS", 85);
        pontuacoesReconhecimento.put("BATYA", 85);
        pontuacoesReconhecimento.put("HAWK", 85);
        pontuacoesReconhecimento.put("JASON", 150);
        pontuacoesReconhecimento.put("BORIS", 70);
        pontuacoesReconhecimento.put("THOR", 70);
        pontuacoesReconhecimento.put("RICK", 70);
        pontuacoesReconhecimento.put("MISHKA", 70);
        pontuacoesReconhecimento.put("ROOKIE", 55);
        pontuacoesReconhecimento.put("EPICOS", 200);

        pontuacoesMissao.put("RECONHECIMENTO", pontuacoesReconhecimento);

        // S. COMUM
        Map<String, Integer> pontuacoesSComum = new HashMap<>();
        pontuacoesSComum.put("VARG", 65);
        pontuacoesSComum.put("DAVID", 65);
        pontuacoesSComum.put("SYNDROME", 65);
        pontuacoesSComum.put("JOE", 65);
        pontuacoesSComum.put("VALERA", 65);
        pontuacoesSComum.put("CAPISCE", 65);
        pontuacoesSComum.put("KLAUS", 50);
        pontuacoesSComum.put("SHI", 50);
        pontuacoesSComum.put("VICTOR", 50);
        pontuacoesSComum.put("SPENCER", 50);
        pontuacoesSComum.put("TRAVIS", 50);
        pontuacoesSComum.put("BATYA", 50);
        pontuacoesSComum.put("HAWK", 150);
        pontuacoesSComum.put("JASON", 150);
        pontuacoesSComum.put("BORIS", 150);
        pontuacoesSComum.put("THOR", 150);
        pontuacoesSComum.put("RICK", 150);
        pontuacoesSComum.put("MISHKA", 150);
        pontuacoesSComum.put("ROOKIE", 120);
        pontuacoesSComum.put("EPICOS", 200);

        pontuacoesMissao.put("S. COMUM", pontuacoesSComum);

        // S. INCOMUM
        Map<String, Integer> pontuacoesSIncomum = new HashMap<>();
        pontuacoesSIncomum.put("VARG", 65);
        pontuacoesSIncomum.put("DAVID", 65);
        pontuacoesSIncomum.put("SYNDROME", 65);
        pontuacoesSIncomum.put("JOE", 65);
        pontuacoesSIncomum.put("VALERA", 65);
        pontuacoesSIncomum.put("CAPISCE", 65);
        pontuacoesSIncomum.put("KLAUS", 180);
        pontuacoesSIncomum.put("SHI", 180);
        pontuacoesSIncomum.put("VICTOR", 180);
        pontuacoesSIncomum.put("SPENCER", 180);
        pontuacoesSIncomum.put("TRAVIS", 180);
        pontuacoesSIncomum.put("BATYA", 180);
        pontuacoesSIncomum.put("HAWK", 40);
        pontuacoesSIncomum.put("JASON", 40);
        pontuacoesSIncomum.put("BORIS", 40);
        pontuacoesSIncomum.put("THOR", 40);
        pontuacoesSIncomum.put("RICK", 40);
        pontuacoesSIncomum.put("MISHKA", 40);
        pontuacoesSIncomum.put("ROOKIE", 30);
        pontuacoesSIncomum.put("EPICOS", 200);

        pontuacoesMissao.put("S. INCOMUM", pontuacoesSIncomum);


        // S. RARO
        Map<String, Integer> pontuacoesSRaro = new HashMap<>();
        pontuacoesSRaro.put("VARG", 240);
        pontuacoesSRaro.put("DAVID", 240);
        pontuacoesSRaro.put("SYNDROME", 240);
        pontuacoesSRaro.put("JOE", 240);
        pontuacoesSRaro.put("VALERA", 240);
        pontuacoesSRaro.put("CAPISCE", 240);
        pontuacoesSRaro.put("KLAUS", 50);
        pontuacoesSRaro.put("SHI", 50);
        pontuacoesSRaro.put("VICTOR", 50);
        pontuacoesSRaro.put("SPENCER", 50);
        pontuacoesSRaro.put("TRAVIS", 50);
        pontuacoesSRaro.put("BATYA", 50);
        pontuacoesSRaro.put("HAWK", 40);
        pontuacoesSRaro.put("JASON", 40);
        pontuacoesSRaro.put("BORIS", 40);
        pontuacoesSRaro.put("THOR", 40);
        pontuacoesSRaro.put("RICK", 40);
        pontuacoesSRaro.put("MISHKA", 40);
        pontuacoesSRaro.put("ROOKIE", 30);
        pontuacoesSRaro.put("EPICOS", 200);

        pontuacoesMissao.put("S. RARO", pontuacoesSRaro);


        return pontuacoesMissao;
    }
}
