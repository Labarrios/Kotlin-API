package com.example.demokotlin.service.impl

import com.example.demokotlin.commons.GenericServiceImpl
import com.example.demokotlin.model.Persona
import com.example.demokotlin.repository.PersonaRepository
import com.example.demokotlin.service.api.PersonaServiceApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class PersonaServiceImpl : GenericServiceImpl<Persona, Long>(),PersonaServiceApi {
    @Autowired
    lateinit var personaRepository: PersonaRepository

    override fun getDao(): CrudRepository<Persona, Long> {
        return personaRepository;
    }

}