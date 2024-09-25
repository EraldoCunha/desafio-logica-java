package exercicio81a100.exercicio_87;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seeding {

    public static List<Municipio> gerarMunicipios() {
        List<Municipio> municipios = new ArrayList<>(Arrays.asList(
                new Municipio(1, Estado.RS, 30000, 120),
                new Municipio(2, Estado.SC, 25000, 98),
                new Municipio(3, Estado.PR, 40000, 150),
                new Municipio(4, Estado.SP, 50000, 210),
                new Municipio(5, Estado.RJ, 32000, 180),
                new Municipio(6, Estado.MG, 47000, 140),
                new Municipio(7, Estado.ES, 22000, 110),
                new Municipio(8, Estado.BA, 30000, 190),
                new Municipio(9, Estado.SE, 15000, 85),
                new Municipio(10, Estado.AL, 17000, 95),
                new Municipio(11, Estado.PE, 29000, 200),
                new Municipio(12, Estado.PB, 28000, 120),
                new Municipio(13, Estado.RN, 21000, 130),
                new Municipio(14, Estado.CE, 34000, 165),
                new Municipio(15, Estado.PI, 20000, 80),
                new Municipio(16, Estado.MA, 24000, 90),
                new Municipio(17, Estado.PA, 38000, 195),
                new Municipio(18, Estado.AP, 16000, 65),
                new Municipio(19, Estado.AM, 31000, 140),
                new Municipio(20, Estado.RR, 11000, 50),
                new Municipio(21, Estado.RS, 27000, 145),
                new Municipio(22, Estado.SC, 35000, 175),
                new Municipio(23, Estado.PR, 32000, 160),
                new Municipio(24, Estado.SP, 46000, 210),
                new Municipio(25, Estado.RJ, 33000, 190),
                new Municipio(26, Estado.MG, 44000, 150),
                new Municipio(27, Estado.ES, 29000, 130),
                new Municipio(28, Estado.BA, 37000, 170),
                new Municipio(29, Estado.SE, 18000, 95),
                new Municipio(30, Estado.AL, 24000, 110),
                new Municipio(31, Estado.PE, 31000, 200),
                new Municipio(32, Estado.PB, 27000, 125),
                new Municipio(33, Estado.RN, 22000, 140),
                new Municipio(34, Estado.CE, 34000, 180),
                new Municipio(35, Estado.PI, 25000, 105),
                new Municipio(36, Estado.MA, 36000, 150),
                new Municipio(37, Estado.PA, 39000, 190),
                new Municipio(38, Estado.AP, 13000, 75),
                new Municipio(39, Estado.AM, 33000, 145),
                new Municipio(40, Estado.RR, 12000, 55),
                new Municipio(41, Estado.RS, 25000, 135),
                new Municipio(42, Estado.SC, 37000, 185),
                new Municipio(43, Estado.PR, 41000, 205),
                new Municipio(44, Estado.SP, 46000, 225),
                new Municipio(45, Estado.RJ, 35000, 175),
                new Municipio(46, Estado.MG, 42000, 165),
                new Municipio(47, Estado.ES, 23000, 115),
                new Municipio(48, Estado.BA, 34000, 155),
                new Municipio(49, Estado.SE, 17000, 90),
                new Municipio(50, Estado.AL, 20000, 100),
                new Municipio(51, Estado.PE, 30000, 200),
                new Municipio(52, Estado.PB, 28000, 135),
                new Municipio(53, Estado.RN, 23000, 125),
                new Municipio(54, Estado.CE, 35000, 170),
                new Municipio(55, Estado.PI, 24000, 110),
                new Municipio(56, Estado.MA, 36000, 180),
                new Municipio(57, Estado.PA, 40000, 190),
                new Municipio(58, Estado.AP, 15000, 85),
                new Municipio(59, Estado.AM, 34000, 150),
                new Municipio(60, Estado.RR, 14000, 60),
                new Municipio(61, Estado.RS, 27000, 145),
                new Municipio(62, Estado.SC, 36000, 165),
                new Municipio(63, Estado.PR, 43000, 210),
                new Municipio(64, Estado.SP, 47000, 225),
                new Municipio(65, Estado.RJ, 36000, 175),
                new Municipio(66, Estado.MG, 45000, 160),
                new Municipio(67, Estado.ES, 21000, 100),
                new Municipio(68, Estado.BA, 38000, 180),
                new Municipio(69, Estado.SE, 20000, 95),
                new Municipio(70, Estado.AL, 22000, 105),
                new Municipio(71, Estado.PE, 31000, 195),
                new Municipio(72, Estado.PB, 29000, 125),
                new Municipio(73, Estado.RN, 24000, 130),
                new Municipio(74, Estado.CE, 37000, 175),
                new Municipio(75, Estado.PI, 23000, 110),
                new Municipio(76, Estado.MA, 39000, 180),
                new Municipio(77, Estado.PA, 42000, 190),
                new Municipio(78, Estado.AP, 17000, 85),
                new Municipio(79, Estado.AM, 35000, 155),
                new Municipio(80, Estado.RR, 13000, 65),
                new Municipio(81, Estado.RS, 28000, 140),
                new Municipio(82, Estado.SC, 38000, 170),
                new Municipio(83, Estado.PR, 44000, 210),
                new Municipio(84, Estado.SP, 48000, 220),
                new Municipio(85, Estado.RJ, 37000, 185),
                new Municipio(86, Estado.MG, 46000, 165),
                new Municipio(87, Estado.ES, 25000, 120),
                new Municipio(88, Estado.BA, 39000, 175),
                new Municipio(89, Estado.SE, 21000, 105),
                new Municipio(90, Estado.AL, 23000, 115),
                new Municipio(91, Estado.PE, 32000, 205),
                new Municipio(92, Estado.PB, 30000, 135),
                new Municipio(93, Estado.RN, 25000, 145),
                new Municipio(94, Estado.CE, 38000, 180),
                new Municipio(95, Estado.PI, 24000, 115),
                new Municipio(96, Estado.MA, 40000, 190),
                new Municipio(97, Estado.PA, 43000, 200),
                new Municipio(98, Estado.AP, 18000, 90),
                new Municipio(99, Estado.AM, 36000, 160),
                new Municipio(100, Estado.RR, 15000, 70),
                new Municipio(101, Estado.MG, 35000, 150),
                new Municipio(102, Estado.ES, 27000, 140),
                new Municipio(103, Estado.BA, 42000, 185),
                new Municipio(104, Estado.SE, 18000, 85),
                new Municipio(105, Estado.AL, 26000, 105),
                new Municipio(106, Estado.PE, 34000, 190),
                new Municipio(107, Estado.PB, 28000, 130),
                new Municipio(108, Estado.RN, 30000, 145),
                new Municipio(109, Estado.CE, 38000, 170),
                new Municipio(110, Estado.PI, 20000, 95),
                new Municipio(111, Estado.MA, 36000, 180),
                new Municipio(112, Estado.PA, 44000, 200),
                new Municipio(113, Estado.AP, 19000, 80),
                new Municipio(114, Estado.AM, 32000, 150),
                new Municipio(115, Estado.RR, 16000, 75),
                new Municipio(116, Estado.RO, 27000, 110),
                new Municipio(117, Estado.AC, 22000, 100),
                new Municipio(118, Estado.TO, 25000, 130),
                new Municipio(119, Estado.MT, 40000, 175),
                new Municipio(120, Estado.GO, 36000, 155),
                new Municipio(121, Estado.DF, 47000, 210),
                new Municipio(122, Estado.MS, 32000, 145),
                new Municipio(123, Estado.RS, 29000, 160),
                new Municipio(124, Estado.SC, 31000, 170),
                new Municipio(125, Estado.PR, 45000, 220),
                new Municipio(126, Estado.SP, 51000, 230),
                new Municipio(127, Estado.RJ, 34000, 190),
                new Municipio(128, Estado.MG, 38000, 165),
                new Municipio(129, Estado.ES, 26000, 125),
                new Municipio(130, Estado.BA, 39000, 200),
                new Municipio(131, Estado.SE, 23000, 110),
                new Municipio(132, Estado.AL, 20000, 90),
                new Municipio(133, Estado.PE, 35000, 180),
                new Municipio(134, Estado.PB, 29000, 135),
                new Municipio(135, Estado.RN, 24000, 120),
                new Municipio(136, Estado.CE, 37000, 160),
                new Municipio(137, Estado.PI, 21000, 100),
                new Municipio(138, Estado.MA, 33000, 140),
                new Municipio(139, Estado.PA, 41000, 195),
                new Municipio(140, Estado.AP, 15000, 70),
                new Municipio(141, Estado.AM, 35000, 170),
                new Municipio(142, Estado.RR, 17000, 85),
                new Municipio(143, Estado.RO, 28000, 115),
                new Municipio(144, Estado.AC, 19000, 90),
                new Municipio(145, Estado.TO, 26000, 125),
                new Municipio(146, Estado.MT, 42000, 205),
                new Municipio(147, Estado.GO, 37000, 160),
                new Municipio(148, Estado.DF, 46000, 220),
                new Municipio(149, Estado.MS, 33000, 150),
                new Municipio(150, Estado.RS, 28000, 140),
                new Municipio(151, Estado.SC, 35000, 165),
                new Municipio(152, Estado.PR, 47000, 215),
                new Municipio(153, Estado.SP, 53000, 240),
                new Municipio(154, Estado.RJ, 36000, 195),
                new Municipio(155, Estado.MG, 40000, 180),
                new Municipio(156, Estado.ES, 27000, 135),
                new Municipio(157, Estado.BA, 41000, 210),
                new Municipio(158, Estado.SE, 21000, 105),
                new Municipio(159, Estado.AL, 24000, 115),
                new Municipio(160, Estado.PE, 36000, 185),
                new Municipio(161, Estado.PB, 30000, 140),
                new Municipio(162, Estado.RN, 25000, 130),
                new Municipio(163, Estado.CE, 39000, 180),
                new Municipio(164, Estado.PI, 22000, 105),
                new Municipio(165, Estado.MA, 34000, 150),
                new Municipio(166, Estado.PA, 43000, 200),
                new Municipio(167, Estado.AP, 16000, 75),
                new Municipio(168, Estado.AM, 36000, 165),
                new Municipio(169, Estado.RR, 14000, 60),
                new Municipio(170, Estado.RO, 29000, 120),
                new Municipio(171, Estado.AC, 23000, 100),
                new Municipio(172, Estado.TO, 27000, 135),
                new Municipio(173, Estado.MT, 43000, 215),
                new Municipio(174, Estado.GO, 38000, 170),
                new Municipio(175, Estado.DF, 48000, 230),
                new Municipio(176, Estado.MS, 34000, 155),
                new Municipio(177, Estado.RS, 30000, 150),
                new Municipio(178, Estado.SC, 36000, 175),
                new Municipio(179, Estado.PR, 48000, 220),
                new Municipio(180, Estado.SP, 54000, 245),
                new Municipio(181, Estado.RJ, 38000, 200),
                new Municipio(182, Estado.MG, 42000, 190),
                new Municipio(183, Estado.ES, 28000, 140),
                new Municipio(184, Estado.BA, 43000, 215),
                new Municipio(185, Estado.SE, 22000, 110),
                new Municipio(186, Estado.AL, 25000, 120),
                new Municipio(187, Estado.PE, 37000, 190),
                new Municipio(188, Estado.PB, 31000, 145),
                new Municipio(189, Estado.RN, 26000, 135),
                new Municipio(190, Estado.CE, 40000, 185),
                new Municipio(191, Estado.PI, 23000, 110),
                new Municipio(192, Estado.MA, 35000, 160),
                new Municipio(193, Estado.PA, 45000, 210),
                new Municipio(194, Estado.AP, 17000, 80),
                new Municipio(195, Estado.AM, 37000, 175),
                new Municipio(196, Estado.RR, 15000, 65),
                new Municipio(197, Estado.RO, 30000, 130),
                new Municipio(198, Estado.AC, 24000, 110),
                new Municipio(199, Estado.TO, 28000, 140),
                new Municipio(200, Estado.MT, 44000, 220)
        ));
        return municipios;
    }
}
