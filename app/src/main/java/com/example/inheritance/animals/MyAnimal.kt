package com.example.inheritance.animals

class MyAnimal(kind: String): Animal(kind) {

    init {
        this.specie = setAnimalSpecie(kind)
    }

    override fun getSound(): String {
        return when(kind) {
            Animals.DOG.kind -> "Bow-wow!"
            Animals.CHICKEN.kind -> "buk, buk, buk, ba-gawk"
            Animals.LIZARD.kind -> "Chirp, chirp!"
            Animals.TUNA.kind -> "Tuna sound"
            Animals.TIGER.kind -> "Roar!"
            Animals.SNAKE.kind -> "Hiss, hiss!"
            else -> {
                "Animal not found"
            }
        }
    }

    override fun setAnimalSpecie(kind: String): String {
         return when(kind) {
            Animals.DOG.kind -> Animals.DOG.specie
            Animals.CHICKEN.kind -> Animals.CHICKEN.specie
            Animals.LIZARD.kind -> Animals.LIZARD.specie
            Animals.TIGER.kind -> Animals.TIGER.specie
            Animals.TUNA.kind -> Animals.TUNA.specie
            Animals.SNAKE.kind -> Animals.SNAKE.specie
             else -> {
                 "Animal not found"
             }
         }
    }
}

enum class Animals(val kind: String, val specie: String) {
    DOG("Dog", "Mammal"),
    CHICKEN("Chicken", "Bird"),
    LIZARD("Lizard", "Reptile"),
    TUNA("Tuna", "Fish"),
    TIGER("Tiger", "Mammal"),
    SNAKE("Snake", "Reptile")
}