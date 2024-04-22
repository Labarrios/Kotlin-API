package com.example.demokotlin.repository

import com.example.demokotlin.model.Persona
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonaRepository: CrudRepository<Persona,Long> {



}