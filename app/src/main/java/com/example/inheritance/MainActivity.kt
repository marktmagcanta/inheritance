package com.example.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.inheritance.animals.*
import com.example.inheritance.species.SpeciesImp

class MainActivity : AppCompatActivity() {

    private val lizard = MyAnimal("Lizard")
    private val tiger = MyAnimal("Tiger")
    private val tuna = MyAnimal("Tuna")
    private val chicken = MyAnimal("Chicken")
    private val snake = MyAnimal("Snake")
    private val dog = MyAnimal("Dog")

    private val animals = listOf<Animal>(lizard, tiger, tuna, chicken, snake, dog)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setAnimalButtonClickListeners()
        setSpeciesButtonClickListeners()
    }

    private fun setAnimalButtonClickListeners() {
        val btnLizard = findViewById<Button>(R.id.btn_lizard)
        val btnTiger = findViewById<Button>(R.id.btn_tiger)
        val btnTuna = findViewById<Button>(R.id.btn_tuna)
        val btnChicken = findViewById<Button>(R.id.btn_chicken)
        val btnSnake = findViewById<Button>(R.id.btn_snake)
        val btnDog = findViewById<Button>(R.id.btn_dog)

        val textView = findViewById<TextView>(R.id.tv_animal_sound)

        btnLizard.setOnClickListener {
            textView.text = lizard.getSound()
        }
        btnTiger.setOnClickListener {
            textView.text = tiger.getSound()
        }
        btnTuna.setOnClickListener {
            textView.text = tuna.getSound()
        }
        btnChicken.setOnClickListener {
            textView.text = chicken.getSound()
        }
        btnSnake.setOnClickListener {
            textView.text = snake.getSound()
        }
        btnDog.setOnClickListener {
            textView.text = dog.getSound()
        }
    }

    private fun setSpeciesButtonClickListeners() {
        val textView: TextView = findViewById(R.id.tv_species)
        val btnMammals: Button = findViewById(R.id.btn_mammal)
        val btnReptiles: Button = findViewById(R.id.btn_reptile)
        val btnBirds: Button = findViewById(R.id.btn_bird)
        val btnFish: Button = findViewById(R.id.btn_fish)

        val species = SpeciesImp()

        btnMammals.setOnClickListener {
            textView.text = ""
            val animals = species.getKinds(animals, "Mammal")

            animals.forEach {
                textView.append(it.kind)
                textView.append("\n")
            }
        }
        btnReptiles.setOnClickListener {
            textView.text = ""
            val animals = species.getKinds(animals, "Reptile")

            animals.forEach {
                textView.append(it.kind)
                textView.append("\n")
            }
        }
        btnBirds.setOnClickListener {
            textView.text = ""
            val animals = species.getKinds(animals, "Bird")

            animals.forEach {
                textView.append(it.kind)
                textView.append("\n")
            }
        }
        btnFish.setOnClickListener {
            textView.text = ""
            val animals = species.getKinds(animals, "Fish")

            animals.forEach {
                textView.append(it.kind)
                textView.append("\n")
            }
        }
    }

}