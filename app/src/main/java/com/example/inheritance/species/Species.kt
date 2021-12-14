package com.example.inheritance.species

import com.example.inheritance.animals.Animal

interface Species {
    fun getKinds(animals: List<Animal>, specie: String): List<Animal>
}