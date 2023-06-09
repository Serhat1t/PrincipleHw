package org.example;

public class ExternalWashing extends CleaningType {
    @Override
    public double PriceHesapla() {
        return 50;
    }

    @Override
    public double TimeHesapla() {
        return 25;
    }

    @Override
    public String Type() {
        return "External Washing";
    }
}
