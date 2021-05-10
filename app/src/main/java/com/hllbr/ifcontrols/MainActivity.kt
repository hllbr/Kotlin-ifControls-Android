package com.hllbr.ifcontrols

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Kotlin If Controls ==
        val myAge = 32
        if (myAge < 32) {//if kontrolü içerisindeki ifade sağlanıyorsa süslü parantez içerisindeki işlemler gerçekleştirilecektir.Aksi bir durumda bu alan pas geçilecek ve parantez dışından devam ewdilecektir.
            println("Welcome")

        } else if (myAge >= 30 && myAge <= 40) {
            //Eğer yaşım 30'a eşit yada büyükse ve 40'a eşit veya küçükse bu alanı çalıştır.
            println("myAge 30-40")
        } else if (myAge >= 40 && myAge <= 50) {
            println("myAge 40-50")
        } else {
            //eğer şart sağlanmassa gerçekleştirilecek alan olarak belirleyebiliriz.
            //bir if controlünde else yapısı bulunmayabilir.Fakat else her zaman bir ife bağlı olarak meydana getirlmek zorundadır.
            println("You do not have permission to enter the venue")
        }
        /*
        Kotlin içerisinde veya diğer dillerde Kontroller sadece if-else if-else ile sınırlı değil.


         */

        //Switch ==Genellikle çok fazla else if kontrolü yapmak zorunda kaldığımız durumlarda devreye girer

        val day = 3

        var dayString = ""

        if (day == 1) {
            dayString = "Monday"
            println(dayString)
        } else if (day == 2) {
            dayString == "Tuesday"
            println(dayString)
        } else if (day == 3){
            dayString = "Wednesday"
            println(dayString)

        }
    //when() kontrolü == when ne zaman anlamına gelmekte
    when(day){//Bazı yazılım dillerinde bu yapı için Switch denir.
        1->dayString = "Monday"//day değişkenim ne zaman 1 değerine eşit olursa
        2->dayString = "Tuesday"
        3->dayString = "Wednesday"
        else->dayString = ""
    }
        println(dayString)

}

    }
