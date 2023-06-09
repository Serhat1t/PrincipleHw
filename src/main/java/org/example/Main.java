package org.example;

public class Main {
    public static void main(String[] args) {
        NewInformation newInformation=new NewInformation();
        newInformation.setFirstName("Serhat");
        newInformation.setSurName("ARİNÇ");
        newInformation.setIdNo(6060);
        newInformation.setCreditCardNo(3460);
        InformationManager informationManager=new InformationManager();
        informationManager.Add(newInformation);
        newInformation.setMemberUsername("Serhatarinc242");
        newInformation.setMemberPassword("Serhat12345");
        informationManager.Login(newInformation);
        CarSpac carSpac=new CarSpac();
        carSpac.setCarPlate("60-ser-60");
        carSpac.setCarBrand("BMW");
        carSpac.setCarmodel("M4");
        CarSpacManager carSpacManager=new CarSpacManager();
        carSpacManager.Add(carSpac);
        CarWash carWash=new CarWash();
        System.out.println("İstediğiniz yıkama türlerini seçiniz :" );
        CleaningType[] cleaningTypes = new CleaningType[]
                {new ExternalWashing(),new EngineCleaning(),new InternalWashing(),new Polishing()};
        double price=0;
        double time=0;
        System.out.println("Seçtiğiniz yıkama çeşitleri: ");
        for (CleaningType cleaningType : cleaningTypes){
            price+= cleaningType.PriceHesapla();
            time+= cleaningType.TimeHesapla();

            System.out.print("-"+ cleaningType.Type()+" ");
        }
        System.out.println("");
        carWash.Location();
        carWash.Notification1();
        System.out.println(carWash.Price(price));
        System.out.println(carWash.Notification2(time));
        System.out.println("Ödeme alındı: "+price+"tl");
        informationManager.Logout(newInformation);


    }

}