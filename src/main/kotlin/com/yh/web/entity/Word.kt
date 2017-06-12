package com.yh.web.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by Ypc on 2017/06/11.
 */
@Entity
@Table(name="word")
data class Word(
        @Id
        var id: Int? = null,
        var name: String? = null,
        var kana: String? = null,
        var desc: String? = null
) : Serializable{

}