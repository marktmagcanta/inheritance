package com.example.inheritance.animals

abstract class Animal(val kind: String) {

    lateinit var specie: String
    abstract fun getSound(): String
    abstract fun setAnimalSpecie(kind: String): String
}