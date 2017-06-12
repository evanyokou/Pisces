package com.yh.web.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by Ypc on 2017/06/11.
 */
@Entity
@Table(name="example")
data class Example (
        @Id
        var id: Int? = null,
        var gid: Int? = null,
        var content: String? = null
)
