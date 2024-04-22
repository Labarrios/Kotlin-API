package com.example.demokotlin.controller

import com.example.demokotlin.model.Persona
import com.example.demokotlin.service.api.PersonaServiceApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
class PersonaControlller {

    @Autowired
    lateinit var personaServiceApi: PersonaServiceApi

    @GetMapping("/all")
    fun getAll(): MutableList<Persona>?{
        return personaServiceApi.all
    }

    @PostMapping("/save")
    fun save (@RequestBody persona:Persona): ResponseEntity<Persona>{
        var obj = personaServiceApi.save(persona);
        return ResponseEntity<Persona>(persona, HttpStatus.OK)
    }

    @GetMapping("delete/{id}")
    fun delete (@PathVariable id:Long): ResponseEntity<Persona>{
        val persona =  personaServiceApi.get(id)
        if(persona != null){
            personaServiceApi.delete(id);
        }else{
            return ResponseEntity<Persona>(HttpStatus.NO_CONTENT)
        }

        return ResponseEntity<Persona>(persona, HttpStatus.OK)

    }
}