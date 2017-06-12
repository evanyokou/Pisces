package com.yh.web.service

import org.springframework.data.domain.Page
import java.awt.print.Pageable
import java.io.Serializable

/**
 * Created by Ypc on 2017/06/12.
 */
interface IBaseService<T, ID : Serializable> {
    fun save(entity: T): T
    fun update(entity: T): T
    fun delete(entity: T)
    fun delete(id: ID)
    fun query(id: ID): T
    fun query(): List<T>
    fun query(page: Int): Page<T>
}