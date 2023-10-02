package com.example.demopizzeria.models.database

import jakarta.persistence.*

//comentarios

/*
* notas
*/

@Entity
@Table(name = "Concentrado", schema = "DBPIZZA_ATLAS")
data class ConcentradoEntity (
        @Column(name = "id")
        @Id
        var id : String = "",

        @Column(name = "text")
        @Basic
        var text: String? = "",
        )
