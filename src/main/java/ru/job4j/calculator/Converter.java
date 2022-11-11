package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float inEur = 140; 
        float expectedEur = 2;
        float outEur = Converter.rubleToEuro(140);
        boolean passedEur = expectedEur == outEur;
        System.out.println("140 rubles are 2.0 euro Test result : " + passedEur);
        
        float dollar = Converter.rubleToDollar(180);
        float inUsd = 180;
        float expectedUsd = 3;
        float outUsd = Converter.rubleToDollar(180);
        boolean passedUsd = expectedUsd == outUsd;
        System.out.println("140 rubles are 3 dollar Test result : " + passedUsd);
      
    }
}
