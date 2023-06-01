package ru.falsher;

public class Program {
    public static void main(String[] args) {
        double absl;
        int c = 0;
        //эталонные значения
        int[] referenceValues = {1,5,10,40,70,90,100,105,150,300,700,1200,1800,2500,5000,8000,10000,25000,50000,60000};
        //Показания прибора
        double[] values = {
                1.001,4.997,10.0002,
                39.986,70.001,90.011,
                99.997,105.001,149.999,
                300.015,700.002,1199.991,
                1798.794,2501.613,5002.014,
                7999.145,9997.257,24997.735,
                49885.845,59996.993
        };
        double norm = 0.25;
        System.out.println("Нормированная погрешность прибора: "+norm);
        System.out.println("Прямой ход:");
        System.out.print("№ точки:\t\t\t\t\t\t");
        for (int i=1; i<=values.length; i++) System.out.printf("%-10d| ",i);
        System.out.println();
        System.out.print("Эталонные значения, кПа:\t\t");
        for(int i: referenceValues) System.out.printf("%-10d| ",i);
        System.out.println();
        System.out.print("Показания прибора, кПа:\t\t\t");
        for(double d: values) System.out.printf("%-10s| ",d);
        System.out.println();
        System.out.print("Относительная погрешность, %:\t");
        for (int i = 0; i < values.length; i++) {
            absl = (Math.abs((double) referenceValues[i] - values[i])) / values[i] * 100;
            if (absl > norm) {
                c += 1;
                System.out.print("\u001B[31m");
            }
            else {
                System.out.print("\u001B[32m");
            }
            System.out.printf("%-10.2f\u001B[0m| ",absl);
        }
        System.out.println();
        System.out.println();
        //Эталонные значения
        int[] referenceValues2 = {60000,50000,25000,10000,8000,5000,2500,1800,1200,700,300,150,105,100,90,70,40,10,5,1};
        //Показания прибора
        double[] values2 = {
                59997.231,49837.132,24997.524,
                9997.314,7999.314,5001.731,
                2500.831,1799.214,1200.004,
                699.996,300.012,150.000,
                105.001,99.999,90.001,
                70.000,39.992,9.997,
                5.001,1.001
        };
        System.out.println("Обратный ход:");
        System.out.print("№ точки:\t\t\t\t\t\t");
        for (int i=1; i<=values2.length; i++) System.out.printf("%-10d| ",i);
        System.out.println();
        System.out.print("Эталонные значения, кПа:\t\t");
        for(int i: referenceValues2) System.out.printf("%-10d| ",i);
        System.out.println();
        System.out.print("Показания прибора, кПа:\t\t\t");
        for(double d: values2) System.out.printf("%-10s| ",d);
        System.out.println();
        System.out.print("Относительная погрешность, %:\t");
        for (int i = 0; i < values2.length; i++) {
            absl = (Math.abs((double) referenceValues2[i] - values2[i])) / values2[i] * 100;
            if (absl > norm) {
                c += 1;
                System.out.print("\u001B[31m");
            }
            else {
                System.out.print("\u001B[32m");
            }
            System.out.printf("%-10.2f\u001B[0m| ",absl);
        }
        System.out.println();
        System.out.println();
        System.out.print("Заключение о годности: ");
        if (c == 0) {
            System.out.println("\u001B[32mПрибор годен к эксплуатации!");
        }
        else
        {
            System.out.println("\u001B[31mПрибор не годен к эксплуатации!");
        }
    }

    
}
