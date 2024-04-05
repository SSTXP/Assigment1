package com.example.project1_final

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.project1_final.R.id.clrbtn2

class MainActivity : AppCompatActivity() {

    lateinit var conbtn1: Button
    lateinit var crbtn2: Button
    lateinit var dcrinfo: TextView
    lateinit var agein1: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val conbtn1: Button = findViewById(R.id.conbtn1)
        val crbtn2: Button = findViewById(R.id.clrbtn2)
        val dcrinfo: TextView = findViewById(R.id.dcrinfo)
        val agein1: EditText = findViewById(R.id.agein1)

        conbtn1.setOnClickListener {
            val age = agein1.text.toString().toIntOrNull()
            if (age != null && age in 20..100) {
                val output1 = customOutput(age)
                dcrinfo.text = output1
            }else{
                dcrinfo.text = "please enter a valid age which range from 20-100"
            }
        }

        crbtn2.setOnClickListener {
            agein1.text.clear()
            dcrinfo.text = ""
            //this code clears any text in the edittext and textview
        }
    }
    private fun customOutput(age: Int): String {
        return when (age){

            in 20..25 -> {
                "Sophie Scholl was a german student and anti-nazi activist and worked within the White Rose non-violent resistance group, she died at the age of 21"
            }
            in 26..30 -> {
                "Henry Gwyn Jeffreys Moseley was an english physicist who contributed to the science pf physics was the atomic number an moseley's law, he died at the age of 27"
            }
            in 31..35 -> {
                "Wolfgang Amadeus Mozart was a maestro of classical era mostly in Europe, his talent started at the age of 5 which demonstrated his musical genius, he died at the age of 35  "
            }
            in 36..40 -> {
                "Vincent Willem van Gogh was a Dutch post-impressionist painter who was one of the most famous and influential figures in the history of western art, he died at the age of 37"
            }
            in 41..45 -> {
                "Francis Scott Fitzgerald was an American fiction writer whose work helped to illustrate the flamboyance and excess of the jazz age, he died at the age of 44"
            }
            in 46..50 -> {
                "Alfred Wegener was a meteorologist who first to postulate the theory of continental drift, he died at the age of 50"
            }
            in 51..55 -> {
                "William Shakespeare is regarded as one of the greatest playwrights in literature history, he died at the age of 51"
            }
            in 56..60 -> {
                "Ludwig van Beethoven was a famous figure in classical music and is one of the most influential composers in western history, he died at the age of 57"
            }
            in 61..65 -> {
                "Prince(Prince Rogers Nelson) was an iconic American musician recognized from his electric style and flamboyant stage presence, he died at the age of 65"
            }
            in 66..70 -> {
                "Leonardo di ser Piero da Vinci was a polymath,painter,sculptor,architect,musician,mathematician,engineer,inventor,anatomist,geologist,cartographer,botanist and writer, he died at the age of 67"
            }
            in 71..75 -> {
                "Charles Robert Darwin was an english naturalist,geologist and biologist, known for his contributions to the science of evolution,he died at the age of 73"
            }
            in 76..80 -> {
                "Albert Einstein was a German-born theoretical physicist one of the most influential scientist of all time, he died at the age of 76"
            }
            in 81..85 -> {
                "Thomas Alva Edison an inventor and businessman described as Americas greatest inventor, he died at the age of 84"
            }
            in 86..90 -> {
                "Nikola Tesla was a inventor, electrical engineer, mechanical engineer, physicist, and futurist, he died the age of 86"
            }
            in 91..95 -> {
                "Pablo Ruiz Picasso was a Spanish painter,sculptor,print-maker,ceramicist,stage designer,poet and playwright, he died at the age of 91"
            }
            in 96..100 -> {
                "Dave Bartholomew was a songwriter his style fused rhythm and blues ,big band,swing music,rock and roll which got him into multiple halls of fame , he died at the age of 100"
            }

            //https://www.ranker.com/list/historical-figures-we-most-want-to-bring-back-from-the-dead/alexf
            //https://www.ranker.com/list/famous-people-who-died-of-fire/reference
            //https://www.famousscientists.org/great-scientist-died-before-40
            //https://www.famousbirthdays.com/people

            else -> {
                "please enter a valid age which range from 20-100"
                //used to display a message to the user that the input was not compatible
            }
        }.toString()

    }

}

