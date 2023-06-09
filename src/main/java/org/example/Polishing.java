package org.example;

public class Polishing extends CleaningType {
    @Override
    public double PriceHesapla() {
        return 150;
    }

    @Override
    public double TimeHesapla() {
        return 80;
    }

    @Override
    public String Type() {
        return "Polishing";
    }
}
