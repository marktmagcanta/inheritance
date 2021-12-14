package com.example.inheritance.species

import com.example.inheritance.animals.Animal

class SpeciesImp: Species {
    override fun getKinds(animals: List<Animal>, specie: String): List<Animal> {
        return animals.filter { it.specie == specie }
    }

}