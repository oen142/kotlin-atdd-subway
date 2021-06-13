package com.wani.atdd.member.repository

import org.springframework.data.jpa.repository.JpaRepository

interface MemberRegistrationRepository : JpaRepository<Account, Long> {
}