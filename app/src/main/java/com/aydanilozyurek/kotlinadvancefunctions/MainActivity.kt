package com.aydanilozyurek.kotlinadvancefunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var myInt: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //let
        myInt?.let {
            val num = it + 1
        }

        val myNum = myInt?.let {
            it + 1
        } ?: 0

        // also
        val ayda = Person("Ayda",23)
        val yagiz = Person("Yağız",30)
        val zeynep = Person("Zeynep",1)

        val people = listOf<Person>(ayda,yagiz,zeynep)
        people.filter { it.age > 18 }.also {
            for(person in it){
                println(person.name)
            }
        }

        //apply
        val intentWithApply = Intent().apply {
            putExtra("","")
            action = ""
        }

        //with
        Person("barley",4).apply {
          var  name = "Barley"
        }.also {
            println(it.name)
        }

        val newBarley = Person("bar",4).apply {
           var name = "Barley"
        }
        println(newBarley.name)

        val anotherBarley = with(Person("barlee",4)) {
            var name = "Barley"
        }
        println(anotherBarley)

        val withBarley = Person("Barly" , 4)
        with(withBarley){
            var name = "Barley"
            var age = 4
        }

        println(withBarley.name)

    }
}
data class Person(val name: String, val age: Int)