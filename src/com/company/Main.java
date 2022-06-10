package com.company;

import java.util.Scanner;

public class Main {

    ///Soru 1;
    //Burada String s1 dediğimizde bir nesne oluşturulur. Toplamda 3 adet nesne oluşturulmuştur.

    public static String degisken = "code";
    public static String alert= " Tanımlı value yu içeren String deger: ";
    public static String errorAlert= " Tanımlı value yu içermiyor";

    public static String compareStrings(String [] parameters){
        for(int i=0;i<parameters.length;i++){
            if(parameters[i] != null){
                if(parameters[i].contains(degisken)){
                    return alert+parameters[i];
                }
            }
        }
        return errorAlert;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] parameters=new String[5];
        for(int i=0;i<5;i++){
            parameters[i]= sc.nextLine();
            System.out.println(compareStrings(parameters));
        }
    }
}
// static ve String data tipinde değişken yaratalım. Ve değeri <<code>> olsun.
//Dönüş tipi String olan ve String[] parametre alan bir metod yazalım. Gelen parametrenin içinde en az 5 farklı String olsun.
// Her bir eleman içinde static olarak belirlediğimiz value içeriyor mu içermiyor mu koşulunu kontrol etsin.
//Main metod içerisinde metoda göndereceğimiz parametreleri kullanıcıdan
//Scanner ile input olarak alalım. Metod içerisinde belirlenen static <<code>> stringini içeren String bulunsun,
// bulunan String metoddan döndürülsün.
// (1 tane String belirlediğimiz değeri içeriyor olacak)
// Console'a "Tanımlı value yu içeren String deger: " + <<String_deger_adi>> "



