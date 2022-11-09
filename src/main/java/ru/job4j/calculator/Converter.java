package ru.job4j.converter;

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
        
        float dollar = Converter.rubleToDollar(140);
        float inUsd = 140; 
        float expectedUsd = 2.3F;
        float expectedUsdRounded = (float) Math.round(expectedUsd);
        float outUsd = Converter.rubleToDollar(140);
        boolean passedUsd = expectedUsdRounded == outUsd;       
        System.out.println("140 rubles are 2.3 dollar Test result : " + passedUsd);
      
    }
}
