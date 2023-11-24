package com.example.teste;

import java.util.ArrayList;
import java.util.List;

public class TabelaNiveis {
    private List<NivelDados> tabela;

    public TabelaNiveis() {
        this.tabela = new ArrayList<>();
        tabela.add(new NivelDados(1, 5, null, 30));
        tabela.add(new NivelDados(2, 6, 300, 36));
        tabela.add(new NivelDados(3, 7, 500, 42));
        tabela.add(new NivelDados(4, 8, 800, 48));
        tabela.add(new NivelDados(5, 9, 1500, 54));
        tabela.add(new NivelDados(6, 10, 2000, 60));
        tabela.add(new NivelDados(7, 11, 3000, 66));
        tabela.add(new NivelDados(8, 12, 5000, 72));
        tabela.add(new NivelDados(9, 13, 9000, 78));
        tabela.add(new NivelDados(10, 20, null, 120));
        tabela.add(new NivelDados(11, 10, 500, 60));
        tabela.add(new NivelDados(12, 11, 800, 66));
        tabela.add(new NivelDados(13, 12, 1000, 72));
        tabela.add(new NivelDados(14, 13, 2000, 78));
        tabela.add(new NivelDados(15, 14, 3000, 84));
        tabela.add(new NivelDados(16, 15, 4000, 90));
        tabela.add(new NivelDados(17, 16, 7000, 96));
        tabela.add(new NivelDados(18, 17, 10000, 102));
        tabela.add(new NivelDados(19, 20, 16000, 120));
        tabela.add(new NivelDados(20, 40, null, 240));
        tabela.add(new NivelDados(21, 15, 1000, 90));
        tabela.add(new NivelDados(22, 16, 2000, 96));
        tabela.add(new NivelDados(23, 17, 3000, 102));
        tabela.add(new NivelDados(24, 18, 4000, 108));
        tabela.add(new NivelDados(25, 19, 5000, 114));
        tabela.add(new NivelDados(26, 20, 6000, 120));
        tabela.add(new NivelDados(27, 21, 10000, 126));
        tabela.add(new NivelDados(28, 22, 15000, 132));
        tabela.add(new NivelDados(29, 23, 25000, 138));
        tabela.add(new NivelDados(30, 60, null, 360));
        tabela.add(new NivelDados(31, 50, 1000, 300));
        tabela.add(new NivelDados(32, 55, 1500, 330));
        tabela.add(new NivelDados(33, 60, 2500, 360));
        tabela.add(new NivelDados(34, 65, 4000, 390));
        tabela.add(new NivelDados(35, 70, 6000, 420));
        tabela.add(new NivelDados(36, 75, 10000, 450));
        tabela.add(new NivelDados(37, 80, 16000, 480));
        tabela.add(new NivelDados(38, 85, 26000, 510));
        tabela.add(new NivelDados(39, 90, 41000, 540));
        tabela.add(new NivelDados(40, 300, null, 1800));
        tabela.add(new NivelDados(41, 150, 1500, 900));
        tabela.add(new NivelDados(42, 170, 2500, 1020));
        tabela.add(new NivelDados(43, 190, 4000, 1140));
        tabela.add(new NivelDados(44, 210, 6000, 1260));
        tabela.add(new NivelDados(45, 230, 10000, 1380));
        tabela.add(new NivelDados(46, 250, 16000, 1500));
        tabela.add(new NivelDados(47, 270, 25000, 1620));
        tabela.add(new NivelDados(48, 290, 41000, 1740));
        tabela.add(new NivelDados(49, 310, 67000, 1860));
        tabela.add(new NivelDados(50, 500, null, 3000));
        tabela.add(new NivelDados(51, 250, 2500, 1500));
        tabela.add(new NivelDados(52, 285, 4000, 1710));
        tabela.add(new NivelDados(53, 320, 6000, 1920));
        tabela.add(new NivelDados(54, 355, 10000, 2130));
        tabela.add(new NivelDados(55, 390, 16000, 2340));
        tabela.add(new NivelDados(56, 425, 26000, 2550));
        tabela.add(new NivelDados(57, 460, 41000, 2760));
        tabela.add(new NivelDados(58, 495, 67000, 2970));
        tabela.add(new NivelDados(59, 530, 110000, 3180));
        tabela.add(new NivelDados(60, 1000, null, 6000));
        tabela.add(new NivelDados(61, 500, 4000, 3000));
        tabela.add(new NivelDados(62, 560, 6000, 3360));
        tabela.add(new NivelDados(63, 620, 10000, 3720));
        tabela.add(new NivelDados(64, 680, 16000, 4080));
        tabela.add(new NivelDados(65, 740, 26000, 4440));
        tabela.add(new NivelDados(66, 800, 41000, 4800));
        tabela.add(new NivelDados(67, 860, 67000, 5160));
        tabela.add(new NivelDados(68, 920, 110000, 5520));
        tabela.add(new NivelDados(69, 980, 200000, 5880));
        tabela.add(new NivelDados(70, 1300, null, 7800));
        tabela.add(new NivelDados(71, 950, 6000, 5700));
        tabela.add(new NivelDados(72, 1010, 10000, 6060));
        tabela.add(new NivelDados(73, 1070, 16000, 6420));
        tabela.add(new NivelDados(74, 1130, 25000, 6780));
        tabela.add(new NivelDados(75, 1190, 41000, 7140));
        tabela.add(new NivelDados(76, 1250, 67000, 7500));
        tabela.add(new NivelDados(77, 1310, 110000, 7860));
        tabela.add(new NivelDados(78, 1370, 170000, 8220));
        tabela.add(new NivelDados(79, 1430, 300000, 8580));
        tabela.add(new NivelDados(80, 1700, null, 10200));
        tabela.add(new NivelDados(81, 1200, 10000, 7200));
        tabela.add(new NivelDados(82, 1270, 15000, 7620));
        tabela.add(new NivelDados(83, 1340, 25000, 8040));
        tabela.add(new NivelDados(84, 1410, 40000, 8460));
        tabela.add(new NivelDados(85, 1480, 65000, 8880));
        tabela.add(new NivelDados(86, 1550, 110000, 9300));
        tabela.add(new NivelDados(87, 1620, 180000, 9720));
        tabela.add(new NivelDados(88, 1690, 300000, 10140));
        tabela.add(new NivelDados(89, 1760, 450000, 10560));
        tabela.add(new NivelDados(90, 2000, null, 12000));
        tabela.add(new NivelDados(91, 1500, 20000, 9000));
        tabela.add(new NivelDados(92, 1550, 25000, 9300));
        tabela.add(new NivelDados(93, 1600, 40000, 9600));
        tabela.add(new NivelDados(94, 1650, 65000, 9900));
        tabela.add(new NivelDados(95, 1700, 100000, 10200));
        tabela.add(new NivelDados(96, 1750, 200000, 10500));
        tabela.add(new NivelDados(97, 1800, 300000, 10800));
        tabela.add(new NivelDados(98, 1850, 450000, 11100));
        tabela.add(new NivelDados(99, 2000, 750000, 12000));
        tabela.add(new NivelDados(100, null, null, null));
    }

    public List<NivelDados> getTabela() {
        return tabela;
    }

    public NivelDados buscarDadosDoNivel(int nivel) {
        for (NivelDados dados : tabela) {
            if (dados.getLevel() == nivel) {
                return dados;
            }
        }
        return null; // Se não encontrar o nível na tabela
    }
}
