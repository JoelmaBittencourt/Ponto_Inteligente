package com.jib.pontointeligente.model

import com.jib.pontointeligente.enums.PerfilEnum
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity //cria uma tabela
data class Funcionario (
    val nome : String,
    val email : String,
    val senha : String,
    val cpf : String,
    val perfil : PerfilEnum,
    val empresaId : String,
    val valorHora : Double? = 0.0, //opcional, se nao tiver nenhum valor sera 0
    val qtdHorasTrabalhaDia : Float? = 0.0f,// f referenciando o float
    val qtdHorasAlmoco : Float? = 0.0f,



    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Caso não seja especificado um nome para a sequence, será utilizada uma sequence padrão, a qual será global
    @Id val id : String
        )