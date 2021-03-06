package com.talissonmelo.iFood.model

import javax.persistence.*

@Entity
data class Cidade (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 1,

        @Column(nullable = false)
        var nome: String = "",

        @ManyToOne
        @JoinColumn(name = "id_estado", nullable = false)
        var estado: Estado = Estado(1, "")
)