package com.wani.atdd.member.ui

import com.wani.atdd.member.application.MemberRegistrationService
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberRegistrationController (
    private val memberRegistrationService : MemberRegistrationService
        ){


}