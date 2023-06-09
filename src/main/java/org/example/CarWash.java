package org.example;

public class CarWash {
    public void Location(){
        System.out.println("Müşteriden konum bilgisi alındı;" +
                " En yakın yıkama istasyonları sıralandı.");
    }
    public void Notification1(){
        System.out.println("Reservasyon bilgileriniz kaydedildi," +
                "reservasyon saatinde aracınınızı yıkama istasyonuna getirin.");
    }
    public String Notification2(double a){
        return "Aracınız bize ulaşmıştır -"+a+"- dk sonra aracınızı alabilirsiniz.";
    }

    public String Price(double b){
        return "Ödenecek tutar: "+b+"Tl.";
    }

}
