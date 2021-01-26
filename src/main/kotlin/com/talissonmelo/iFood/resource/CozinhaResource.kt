package com.talissonmelo.iFood.resource

import com.talissonmelo.iFood.model.Cidade
import com.talissonmelo.iFood.model.Cozinha
import com.talissonmelo.iFood.service.CozinhaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/cozinhas"])
class CozinhaResource {

    @Autowired
    lateinit var service: CozinhaService;

    @GetMapping
    fun listar(): List<Cozinha> {
        return service.listarCozinhas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun cadastrar(@RequestBody cozinha: Cozinha) : ResponseEntity<Cozinha> {
        var novaCozinha: Cozinha = service.cadastrarCozinha(cozinha);
        return ResponseEntity.ok().body(novaCozinha);
    }
}