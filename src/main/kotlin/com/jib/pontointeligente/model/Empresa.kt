package com.jib.pontointeligente.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


// por que data class ?
// para acessar os atributos, substitui etter e setter

//@Document do pacote mongodb
@Entity //cria uma tabela
data class Empresa (
    val razaoSocial : String, //coluna

    val cnpj : String,


    @GeneratedValue(strategy = GenerationType.AUTO)//o provedor de persistência a escolha da estratégia mais adequada de acordo com o banco de dados
    @Id val id : String
//    val id : String? = null pode ou não ser nulo
        )

