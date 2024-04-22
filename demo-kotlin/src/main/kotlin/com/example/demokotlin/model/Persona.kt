package com.example.demokotlin.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "Persona")
data class Persona(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long = 0,
    @Column
    val nombre:String = "",
    @Column
    val apellido:String = "",
    @Column
    val direccion:String = "",
    @Column
    val telefono:String = "") {}