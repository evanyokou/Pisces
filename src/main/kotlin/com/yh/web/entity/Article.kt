package com.yh.web.entity

import java.sql.Date
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by yuh on 17/06/08.
 */
@Entity
@Table(name = "article")
data class Article (
        @Id
        var id: Int? = null,

        var title: String? = null,
        var author: String? = null,
        var time: Date? = null,
        var content: String? = null
)