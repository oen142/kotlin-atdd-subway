package com.wani.atdd.member.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Account(

    @Id
    val id: Long,
    username: String,
    password: String,
) {


}