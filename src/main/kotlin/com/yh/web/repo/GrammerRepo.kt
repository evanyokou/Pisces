package com.yh.web.repo

import com.yh.web.entity.Grammar
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by Ypc on 2017/06/11.
 */
@Repository
interface GrammerRepo : JpaRepository<Grammar,Int> {
}