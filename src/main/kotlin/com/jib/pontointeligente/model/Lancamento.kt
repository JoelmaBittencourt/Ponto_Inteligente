package com.jib.pontointeligente.model

import com.jib.pontointeligente.enums.TipoEnum
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity //cria uma tabela
data class Lancamento (

    val data : Date,
    val tipo : TipoEnum,
    val funcionarioId : String,
    val descricao : String? = null, //opcional
    val localizaca : String? = null, //opcional


    @GeneratedValue(strategy = GenerationType.IDENTITY)//os valores a serem atribuídos ao identificador único serão gerados pela coluna de auto incremento do banco de dados. Assim, um valor para o identificador é gerado para cada registro inserido no banco.
    @Id val id : String
        )