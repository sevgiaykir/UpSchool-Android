package com.example.homework1
import java.util.*

fun main(){
    val numInput=Scanner(System.`in`)
    while(true) {
        println(
                    "1: Asal Sayı Kontrolü \n" +
                    "2: Harf Notu Hesaplama \n" +
                    "3: Gün Hesaplama \n" +
                    "4: Sayı Bulma \n"
        )
        print("Yapmak istediğiniz işlem numarasını giriniz: ")

        val işlem = numInput.nextInt()

        when (işlem) {
            1 -> asalSayiKontrol()
            2 -> harfNotuHesapla()
            3 -> gunHesapla()
            4 -> sayiBulmaca()
            else -> println("Yanlış bir değer girdiniz!")
        }
    }
}

fun asalSayiKontrol(){
    val numInput=Scanner(System.`in`)
    print("Lütfen bir sayı giriniz: ")
    val num=numInput.nextInt()

    var kontrol=0
    for(i in 2..(num-1)) {
        if (num % i == 0) {
            kontrol++
        }
    }
        if (kontrol == 0) {
            println("$num asal bir sayıdır.")
        }
        else {
            println("$num asal bir sayı değildir.")
        }
    }

fun harfNotuHesapla() {
    val numInput=Scanner(System.`in`)
    print("Lütfen vize notunuzu giriniz: ")
    val vize =numInput.nextInt()
    print("Lütfen final notunuzu giriniz: ")
    val final =numInput.nextInt()
    val ort= (vize*40/100)+(final*60/100)
    println("Ortalamanız: $ort")

    var harfNotu =""
    when(ort){
        in 0..49 -> harfNotu="FF"
        in 50..60 -> harfNotu="DD"
        in 60..70 -> harfNotu="CC"
        in 70..80 -> harfNotu="BB"
        in 80..100 -> harfNotu="AA"
    }
    println("Harf notunuz $harfNotu.")
}

fun gunHesapla(){
    val numInput=Scanner(System.`in`)
    print("Lütfen çarşamba gününden sonra geçen gün sayısını giriniz: ")
    val gunSayisi =numInput.nextInt()
    print("$gunSayisi gün sonra günlerden ")
    when(gunSayisi%7){
        1 -> println("Perşembe.")
        2 -> println("Cuma.")
        3 -> println("Cumartesi.")
        4 -> println("Pazar.")
        5 -> println("Pazartesi.")
        6 -> println("Salı.")
        0 -> println("Çarşamba.")
        else -> print("Lütfen geçerli bir değer giriniz.")
    }
}

fun sayiBulmaca() {
    val randomSayi= (1..100).random()
    println("Sayıyı tahmin etmek için 3 hakkınız var.")
    val numInput=Scanner(System.`in`)
    var i=1
    while(i<4)
    {
        print("Tahmininizi giriniz: ")
        val tahmin =numInput.nextInt()

        val kalanTahmin=3-i

        if(tahmin<randomSayi){
            println("Daha büyük bir sayı denemelisiniz.")
        }
        else if(tahmin>randomSayi){
            println("Daha küçük bir sayı denemelisiniz.")
        }
        else{
            println("Sayıyı buldunuz, tebrikler!")
            break
        }

        if(kalanTahmin==0){
            println("Tahmin hakkınız bitti!")
            break
        }

        println("Kalan hakkınız: $kalanTahmin")
        i++
    }
}



