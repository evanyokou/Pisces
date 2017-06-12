package com.yh.web.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by Ypc on 2017/06/11.
 */
@Entity
@Table(name="grammar")
data class Grammar (
        @Id
        var id: Int? = null,
        var grammar: String? = null,
        var desc: String? = null
)
