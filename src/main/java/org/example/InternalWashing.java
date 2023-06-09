package org.example;

public class InternalWashing extends CleaningType {


    @Override
    public double PriceHesapla() {
        return 75;
    }

    @Override
    public double TimeHesapla() {
        return 30;
    }

    @Override
    public String Type() {
        return "Internal Washing";
    }
}
