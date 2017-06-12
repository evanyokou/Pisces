package com.yh.web.repo.impl

import com.yh.web.repo.HelperRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate

/**
 * Created by Ypc on 2017/06/11.
 */
class HelperRepoImpl : HelperRepo{
        @Autowired
        val jdbcTemplate: JdbcTemplate? = null

        //implement custom functions
}