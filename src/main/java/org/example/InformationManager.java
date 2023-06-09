package org.example;

public class InformationManager {
    public void Add(NewInformation newInformation){
        System.out.println("Müşteri eklendi: "+newInformation.getFirstName()+
                " "+newInformation.getSurName());
    }
    public void Login(NewInformation newInformation){
        System.out.println("Müşteri sisteme giriş yaptı: "+newInformation.getMemberUsername());
    }
    public void Logout(NewInformation newInformation){
        System.out.println("Müşteri sistemden çıkış yaptı: "+ newInformation.getMemberUsername());
    }
}
