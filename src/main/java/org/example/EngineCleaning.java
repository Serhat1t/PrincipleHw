package org.example;

public class EngineCleaning extends CleaningType {
    @Override
    public double PriceHesapla() {
        return 100;
    }

    @Override
    public double TimeHesapla() {
        return 45;
    }

    @Override
    public String Type() {
        return "Engine cleaning";
    }
}
