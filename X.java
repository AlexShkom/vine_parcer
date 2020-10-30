package com.company;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.Math.*;

public class X {
    public static void main(String[] args) {
        //Массивы входных данных 0
        ArrayList<Double> Alcohol = new ArrayList<>();
        ArrayList<Double> Medical_acid = new ArrayList<>();
        ArrayList<Double> Ash = new ArrayList<>();
        ArrayList<Double> Alcalinity_of_ash = new ArrayList<>();
        ArrayList<Double> Magnesium = new ArrayList<>();
        ArrayList<Double> Total_phenols = new ArrayList<>();
        ArrayList<Double> Flavanoids = new ArrayList<>();
        ArrayList<Double> Nonflavanoid_phenols = new ArrayList<>();
        ArrayList<Double> Proanthocyanins = new ArrayList<>();
        ArrayList<Double> Color_intensity = new ArrayList<>();
        ArrayList<Double> Hue = new ArrayList<>();
        ArrayList<Double> Diluted_wines = new ArrayList<>();
        ArrayList<Double> Proline = new ArrayList<>();

        //Массивы входных данных 1
        ArrayList<Double> Alcohol1 = new ArrayList<>();
        ArrayList<Double> Medical_acid1 = new ArrayList<>();
        ArrayList<Double> Ash1 = new ArrayList<>();
        ArrayList<Double> Alcalinity_of_ash1 = new ArrayList<>();
        ArrayList<Double> Magnesium1 = new ArrayList<>();
        ArrayList<Double> Total_phenols1 = new ArrayList<>();
        ArrayList<Double> Flavanoids1 = new ArrayList<>();
        ArrayList<Double> Nonflavanoid_phenols1 = new ArrayList<>();
        ArrayList<Double> Proanthocyanins1 = new ArrayList<>();
        ArrayList<Double> Color_intensity1 = new ArrayList<>();
        ArrayList<Double> Hue1 = new ArrayList<>();
        ArrayList<Double> Diluted_wines1 = new ArrayList<>();
        ArrayList<Double> Proline1 = new ArrayList<>();

        //Массивы входных данных 2
        ArrayList<Double> Alcohol2 = new ArrayList<>();
        ArrayList<Double> Medical_acid2 = new ArrayList<>();
        ArrayList<Double> Ash2 = new ArrayList<>();
        ArrayList<Double> Alcalinity_of_ash2 = new ArrayList<>();
        ArrayList<Double> Magnesium2 = new ArrayList<>();
        ArrayList<Double> Total_phenols2 = new ArrayList<>();
        ArrayList<Double> Flavanoids2 = new ArrayList<>();
        ArrayList<Double> Nonflavanoid_phenols2 = new ArrayList<>();
        ArrayList<Double> Proanthocyanins2 = new ArrayList<>();
        ArrayList<Double> Color_intensity2 = new ArrayList<>();
        ArrayList<Double> Hue2 = new ArrayList<>();
        ArrayList<Double> Diluted_wines2 = new ArrayList<>();
        ArrayList<Double> Proline2 = new ArrayList<>();

        //Массивы результатов 0
        ArrayList<Double> Alcohol_RES = new ArrayList<>();
        ArrayList<Double> Medical_acid_RES = new ArrayList<>();
        ArrayList<Double> Ash_RES = new ArrayList<>();
        ArrayList<Double> Alcalinity_of_ash_RES = new ArrayList<>();
        ArrayList<Double> Magnesium_RES = new ArrayList<>();
        ArrayList<Double> Total_phenols_RES = new ArrayList<>();
        ArrayList<Double> Flavanoids_RES = new ArrayList<>();
        ArrayList<Double> Nonflavanoid_phenols_RES = new ArrayList<>();
        ArrayList<Double> Proanthocyanins_RES = new ArrayList<>();
        ArrayList<Double> Color_intensity_RES = new ArrayList<>();
        ArrayList<Double> Hue_RES = new ArrayList<>();
        ArrayList<Double> Diluted_wines_RES = new ArrayList<>();
        ArrayList<Double> Proline_RES = new ArrayList<>();

        //Массивы результатов 1
        ArrayList<Double> Alcohol_RES1 = new ArrayList<>();
        ArrayList<Double> Medical_acid_RES1 = new ArrayList<>();
        ArrayList<Double> Ash_RES1 = new ArrayList<>();
        ArrayList<Double> Alcalinity_of_ash_RES1 = new ArrayList<>();
        ArrayList<Double> Magnesium_RES1 = new ArrayList<>();
        ArrayList<Double> Total_phenols_RES1 = new ArrayList<>();
        ArrayList<Double> Flavanoids_RES1 = new ArrayList<>();
        ArrayList<Double> Nonflavanoid_phenols_RES1 = new ArrayList<>();
        ArrayList<Double> Proanthocyanins_RES1 = new ArrayList<>();
        ArrayList<Double> Color_intensity_RES1 = new ArrayList<>();
        ArrayList<Double> Hue_RES1 = new ArrayList<>();
        ArrayList<Double> Diluted_wines_RES1 = new ArrayList<>();
        ArrayList<Double> Proline_RES1 = new ArrayList<>();

        //Массивы результатов 2
        ArrayList<Double> Alcohol_RES2 = new ArrayList<>();
        ArrayList<Double> Medical_acid_RES2 = new ArrayList<>();
        ArrayList<Double> Ash_RES2 = new ArrayList<>();
        ArrayList<Double> Alcalinity_of_ash_RES2 = new ArrayList<>();
        ArrayList<Double> Magnesium_RES2 = new ArrayList<>();
        ArrayList<Double> Total_phenols_RES2 = new ArrayList<>();
        ArrayList<Double> Flavanoids_RES2 = new ArrayList<>();
        ArrayList<Double> Nonflavanoid_phenols_RES2 = new ArrayList<>();
        ArrayList<Double> Proanthocyanins_RES2 = new ArrayList<>();
        ArrayList<Double> Color_intensity_RES2 = new ArrayList<>();
        ArrayList<Double> Hue_RES2 = new ArrayList<>();
        ArrayList<Double> Diluted_wines_RES2 = new ArrayList<>();
        ArrayList<Double> Proline_RES2 = new ArrayList<>();

        //Чтение данных
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\ZDownloads\\wine.data"));
            while (reader.readLine() != null) {
                String[] inputdata = reader.readLine().split(",");
                switch (inputdata[0]) {
                    case "1" -> Setter(inputdata, Alcohol, Medical_acid, Ash, Alcalinity_of_ash, Magnesium, Total_phenols, Flavanoids, Nonflavanoid_phenols, Proanthocyanins, Color_intensity, Hue, Diluted_wines, Proline);
                    case "2" -> Setter(inputdata, Alcohol1, Medical_acid1, Ash1, Alcalinity_of_ash1, Magnesium1, Total_phenols1, Flavanoids1, Nonflavanoid_phenols1, Proanthocyanins1, Color_intensity1, Hue1, Diluted_wines1, Proline1);
                    case "3" -> Setter(inputdata, Alcohol2, Medical_acid2, Ash2, Alcalinity_of_ash2, Magnesium2, Total_phenols2, Flavanoids2, Nonflavanoid_phenols2, Proanthocyanins2, Color_intensity2, Hue2, Diluted_wines2, Proline2);
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

        //Вывод входных данных
        Getter(1, Alcohol, Medical_acid, Ash, Alcalinity_of_ash, Magnesium, Total_phenols, Flavanoids, Nonflavanoid_phenols, Proanthocyanins, Color_intensity, Hue, Diluted_wines, Proline);
        Getter(2, Alcohol1, Medical_acid1, Ash1, Alcalinity_of_ash1, Magnesium1, Total_phenols1, Flavanoids1, Nonflavanoid_phenols1, Proanthocyanins1, Color_intensity1, Hue1, Diluted_wines1, Proline1);
        Getter(3, Alcohol2, Medical_acid2, Ash2, Alcalinity_of_ash2, Magnesium2, Total_phenols2, Flavanoids2, Nonflavanoid_phenols2, Proanthocyanins2, Color_intensity2, Hue2, Diluted_wines2, Proline2);

        //Рассчёт по формулам
        Caller(Alcohol, Medical_acid, Ash, Alcalinity_of_ash, Magnesium, Total_phenols, Flavanoids, Nonflavanoid_phenols, Proanthocyanins, Color_intensity, Hue, Diluted_wines, Proline, Alcohol_RES, Medical_acid_RES, Ash_RES, Alcalinity_of_ash_RES, Magnesium_RES, Total_phenols_RES, Flavanoids_RES, Nonflavanoid_phenols_RES, Proanthocyanins_RES, Color_intensity_RES, Hue_RES, Diluted_wines_RES, Proline_RES);
        Caller(Alcohol1, Medical_acid1, Ash1, Alcalinity_of_ash1, Magnesium1, Total_phenols1, Flavanoids1, Nonflavanoid_phenols1, Proanthocyanins1, Color_intensity1, Hue1, Diluted_wines1, Proline1, Alcohol_RES1, Medical_acid_RES1, Ash_RES1, Alcalinity_of_ash_RES1, Magnesium_RES1, Total_phenols_RES1, Flavanoids_RES1, Nonflavanoid_phenols_RES1, Proanthocyanins_RES1, Color_intensity_RES1, Hue_RES1, Diluted_wines_RES1, Proline_RES1);
        Caller(Alcohol2, Medical_acid2, Ash2, Alcalinity_of_ash2, Magnesium2, Total_phenols2, Flavanoids2, Nonflavanoid_phenols2, Proanthocyanins2, Color_intensity2, Hue2, Diluted_wines2, Proline2, Alcohol_RES2, Medical_acid_RES2, Ash_RES2, Alcalinity_of_ash_RES2, Magnesium_RES2, Total_phenols_RES2, Flavanoids_RES2, Nonflavanoid_phenols_RES2, Proanthocyanins_RES2, Color_intensity_RES2, Hue_RES2, Diluted_wines_RES2, Proline_RES2);

        //Вывод результатов
        RESGetter(1, Alcohol_RES, Medical_acid_RES, Ash_RES, Alcalinity_of_ash_RES, Magnesium_RES, Total_phenols_RES, Flavanoids_RES, Nonflavanoid_phenols_RES, Proanthocyanins_RES, Color_intensity_RES, Hue_RES, Diluted_wines_RES, Proline_RES);
        RESGetter(2, Alcohol_RES1, Medical_acid_RES1, Ash_RES1, Alcalinity_of_ash_RES1, Magnesium_RES1, Total_phenols_RES1, Flavanoids_RES1, Nonflavanoid_phenols_RES1, Proanthocyanins_RES1, Color_intensity_RES1, Hue_RES1, Diluted_wines_RES1, Proline_RES1);
        RESGetter(3, Alcohol_RES2, Medical_acid_RES2, Ash_RES2, Alcalinity_of_ash_RES2, Magnesium_RES2, Total_phenols_RES2, Flavanoids_RES2, Nonflavanoid_phenols_RES2, Proanthocyanins_RES2, Color_intensity_RES2, Hue_RES2, Diluted_wines_RES2, Proline_RES2);
    }

    //Формулы в виде методов:
    //Мат.Ожидание
    public static double MathDisp(ArrayList<Double> ThisList) {
        double max = 0;
        for (Double test : ThisList) max += test;
        return max / ThisList.size();
    }
    //Медиана
    public static double Mediana(ArrayList<Double> ThisList) {
        Collections.sort(ThisList);
        if (ThisList.size() % 2 == 1) return ThisList.get(ThisList.size() / 2);
        else return HalfedSum(ThisList);
    }
    //Полусумма крайних наблюдений
    public static double HalfedSum(ArrayList<Double> ThisList) {
        return (ThisList.get(0) + ThisList.get(ThisList.size() - 1)) / 2;
    }
    //Среднее квадратическое отклонение от среднего
    public static double MiddledSquareVidhylennya(ArrayList<Double> ThisList, ArrayList<Double> MathList) {
        double max = 0;
        for (Double test : ThisList) max += pow(test - MathList.get(0), 2);
        return sqrt(max / ThisList.size());
    }
    //Средний модуль отклонений
    public static double MiddledModuleVidhylennya(ArrayList<Double> ThisList, ArrayList<Double> MathList) {
        double max = 0;
        for (Double test : ThisList) max += test - MathList.get(1);
        if (max < 0) return (max / ThisList.size()) * -1;
        else return max / ThisList.size();
    }
    //Размах
    public static double Razmah(ArrayList<Double> ThisList) {
        return ThisList.get(ThisList.size() - 1) - ThisList.get(0);
    }
    //Дисперсия
    public static double DispRank(ArrayList<Double> ThisList, ArrayList<Double> MathList) {
        double max = 0;
        for (Double test : ThisList) max += pow(test - MathList.get(0), 2);
        return (max / ThisList.size());
    }
    //Нормализация
    public static double Normalization(ArrayList<Double> ThisList, ArrayList<Double> MathList) {
        double max = 0;
        for (Double test : ThisList) max += (test - MathList.get(0)) / sqrt(MathList.get(5)) - max % 1;
        return max;
    }
    //Гипершар
    public static double HyperRound(ArrayList<Double> ThisList) {
        double max = 0;
        for (Double test : ThisList)
            max += test - ThisList.get(0) / ThisList.get(ThisList.size() - 1) - ThisList.get(0);
        return max / ThisList.size();
    }
    //Гиперкуб
    public static double HyperCube(ArrayList<Double> ThisList) {
        double max = 0;
        for (Double test : ThisList)
            max += 2 * (test - ThisList.get(0) / ThisList.get(ThisList.size() - 1) - ThisList.get(0)) - 1;
        return max / ThisList.size();
    }

    //Методы-обработчики
    //Вызов всех методов-формул для каждого списка-атрибута
    public static void Calling(ArrayList<Double> ThisList, ArrayList<Double> BeforeList) {
        ThisList.add(MathDisp(BeforeList));
        ThisList.add(Mediana(BeforeList));
        ThisList.add(MiddledSquareVidhylennya(BeforeList, ThisList));
        ThisList.add(MiddledModuleVidhylennya(BeforeList, ThisList));
        ThisList.add(Razmah(BeforeList));
        ThisList.add(DispRank(BeforeList, ThisList));
        ThisList.add(Normalization(BeforeList, ThisList));
        ThisList.add(HyperRound(BeforeList));
        ThisList.add(HyperCube(BeforeList));
    }
    //Метод, вызывающий вызов для определённого класса
    public static void Caller(ArrayList<Double> Alcohol, ArrayList<Double> Medical_acid, ArrayList<Double> Ash, ArrayList<Double> Alcalinity_of_ash, ArrayList<Double> Magnesium, ArrayList<Double> Total_phenols, ArrayList<Double> Flavanoids, ArrayList<Double> Nonflavanoid_phenols, ArrayList<Double> Proanthocyanins, ArrayList<Double> Color_intensity, ArrayList<Double> Hue, ArrayList<Double> Diluted_wines, ArrayList<Double> Proline, ArrayList<Double> Alcohol_RES, ArrayList<Double> Medical_acid_RES, ArrayList<Double> Ash_RES, ArrayList<Double> Alcalinity_of_ash_RES, ArrayList<Double> Magnesium_RES, ArrayList<Double> Total_phenols_RES, ArrayList<Double> Flavanoids_RES, ArrayList<Double> Nonflavanoid_phenols_RES, ArrayList<Double> Proanthocyanins_RES, ArrayList<Double> Color_intensity_RES, ArrayList<Double> Hue_RES, ArrayList<Double> Diluted_wines_RES, ArrayList<Double> Proline_RES) {
        for (int i = 0; i < 13; i++) {
            switch (i) {
                case (0) -> Calling(Alcohol_RES, Alcohol);
                case (1) -> Calling(Medical_acid_RES, Medical_acid);
                case (2) -> Calling(Ash_RES, Ash);
                case (3) -> Calling(Alcalinity_of_ash_RES, Alcalinity_of_ash);
                case (4) -> Calling(Magnesium_RES, Magnesium);
                case (5) -> Calling(Total_phenols_RES, Total_phenols);
                case (6) -> Calling(Flavanoids_RES, Flavanoids);
                case (7) -> Calling(Nonflavanoid_phenols_RES, Nonflavanoid_phenols);
                case (8) -> Calling(Proanthocyanins_RES, Proanthocyanins);
                case (9) -> Calling(Color_intensity_RES, Color_intensity);
                case (10) -> Calling(Hue_RES, Hue);
                case (11) -> Calling(Diluted_wines_RES, Diluted_wines);
                case (12) -> Calling(Proline_RES, Proline);
            }
        }
    }
    //Метод, считывающий входные данные
    public static void Setter(String[] inputdata, ArrayList<Double> Alcohol, ArrayList<Double> Medical_acid, ArrayList<Double> Ash, ArrayList<Double> Alcalinity_of_ash, ArrayList<Double> Magnesium, ArrayList<Double> Total_phenols, ArrayList<Double> Flavanoids, ArrayList<Double> Nonflavanoid_phenols, ArrayList<Double> Proanthocyanins, ArrayList<Double> Color_intensity, ArrayList<Double> Hue, ArrayList<Double> Diluted_wines, ArrayList<Double> Proline) {
        for (int j = 0; j < 13; j++) {
            switch (j) {
                case (0) -> Alcohol.add(Double.parseDouble(inputdata[1]));
                case (1) -> Medical_acid.add(Double.parseDouble(inputdata[2]));
                case (2) -> Ash.add(Double.parseDouble(inputdata[3]));
                case (3) -> Alcalinity_of_ash.add(Double.parseDouble(inputdata[4]));
                case (4) -> Magnesium.add(Double.parseDouble(inputdata[5]));
                case (5) -> Total_phenols.add(Double.parseDouble(inputdata[6]));
                case (6) -> Flavanoids.add(Double.parseDouble(inputdata[7]));
                case (7) -> Nonflavanoid_phenols.add(Double.parseDouble(inputdata[8]));
                case (8) -> Proanthocyanins.add(Double.parseDouble(inputdata[9]));
                case (9) -> Color_intensity.add(Double.parseDouble(inputdata[10]));
                case (10) -> Hue.add(Double.parseDouble(inputdata[11]));
                case (11) -> Diluted_wines.add(Double.parseDouble(inputdata[12]));
                case (12) -> Proline.add(Double.parseDouble(inputdata[13]));
            }
        }
    }
    //Метод, выводящий входные данные
    public static void Getter(int inputdata, ArrayList<Double> Alcohol, ArrayList<Double> Medical_acid, ArrayList<Double> Ash, ArrayList<Double> Alcalinity_of_ash, ArrayList<Double> Magnesium, ArrayList<Double> Total_phenols, ArrayList<Double> Flavanoids, ArrayList<Double> Nonflavanoid_phenols, ArrayList<Double> Proanthocyanins, ArrayList<Double> Color_intensity, ArrayList<Double> Hue, ArrayList<Double> Diluted_wines, ArrayList<Double> Proline) {
        System.out.println("Входные данные класса " + inputdata + ": ");
        System.out.println(Alcohol);
        System.out.println(Medical_acid);
        System.out.println(Ash);
        System.out.println(Alcalinity_of_ash);
        System.out.println(Magnesium);
        System.out.println(Total_phenols);
        System.out.println(Flavanoids);
        System.out.println(Nonflavanoid_phenols);
        System.out.println(Proanthocyanins);
        System.out.println(Color_intensity);
        System.out.println(Hue);
        System.out.println(Diluted_wines);
        System.out.println(Proline);
        System.out.println();
    }
    //Метод, выводящий выходные данные
    public static void RESGetter(int inputdata, ArrayList<Double> Alcohol_RES, ArrayList<Double> Medical_acid_RES, ArrayList<Double> Ash_RES, ArrayList<Double> Alcalinity_of_ash_RES, ArrayList<Double> Magnesium_RES, ArrayList<Double> Total_phenols_RES, ArrayList<Double> Flavanoids_RES, ArrayList<Double> Nonflavanoid_phenols_RES, ArrayList<Double> Proanthocyanins_RES, ArrayList<Double> Color_intensity_RES, ArrayList<Double> Hue_RES, ArrayList<Double> Diluted_wines_RES, ArrayList<Double> Proline_RES) {
        System.out.println("\n" + "Обработанные данные класса " + inputdata + ": ");
        NumberFormat df = new DecimalFormat("000.0000000000");
        System.out.println("Метод/Ресурс:     " + "Alcohol:         " + "Med.Acid:        " + "Ash:             " + "Alcalinity:      " + "Magnesium:       " + "Total_phenols:   " + "Flavanoids:      " + "Nonflav.Phenols: " + "Proanthocyanins: " + "Color_intensity: " + "Hue:             " + "Diluted_wines:   " + "Proline:");
        for (int i = 0; i < Alcohol_RES.size(); i++) {
            switch (i) {
                case (0) -> System.out.print("Мат.Ожидание:     ");
                case (1) -> System.out.print("Медиана:          ");
                case (2) -> System.out.print("Сред.Кв.Отклон.:  ");
                case (3) -> System.out.print("Сред.Мод.Отклон.: ");
                case (4) -> System.out.print("Размах:           ");
                case (5) -> System.out.print("Мат.Дисперсия:    ");
                case (6) -> System.out.print("Нормализация:     ");
                case (7) -> System.out.print("Метод Гипершара:  ");
                case (8) -> System.out.print("Метод Гиперкуба:  ");
            }
            System.out.print(df.format(Alcohol_RES.get(i)) + ";  ");
            System.out.print(df.format(Medical_acid_RES.get(i)) + ";  ");
            System.out.print(df.format(Ash_RES.get(i)) + ";  ");
            System.out.print(df.format(Alcalinity_of_ash_RES.get(i)) + ";  ");
            System.out.print(df.format(Magnesium_RES.get(i)) + ";  ");
            System.out.print(df.format(Total_phenols_RES.get(i)) + ";  ");
            System.out.print(df.format(Flavanoids_RES.get(i)) + ";  ");
            System.out.print(df.format(Nonflavanoid_phenols_RES.get(i)) + ";  ");
            System.out.print(df.format(Proanthocyanins_RES.get(i)) + ";  ");
            System.out.print(df.format(Color_intensity_RES.get(i)) + ";  ");
            System.out.print(df.format(Hue_RES.get(i)) + ";  ");
            System.out.print(df.format(Diluted_wines_RES.get(i)) + ";  ");
            System.out.print(df.format(Proline_RES.get(i)) + ";  ");
            System.out.println();
        }
    }
}