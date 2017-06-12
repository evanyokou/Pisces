package com.yh.web.service.impl

import com.yh.web.repo.BaseRepo
import com.yh.web.service.IBaseService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.domain.Pageable
import java.io.Serializable

/**
 * Created by Ypc on 2017/06/12.
 */
abstract class BaseService<T, ID : Serializable> : IBaseService<T, ID> {

    var baseRepo: BaseRepo<T,ID>? = null

    abstract fun setUp()

    override fun save(entity: T): T {
        return baseRepo!!.save(entity)
    }

    override fun update(entity: T): T {
        return baseRepo!!.save(entity)
    }

    override fun delete(entity: T) {
        baseRepo!!.delete(entity)
    }

    override fun delete(id: ID) {
        baseRepo!!.delete(id)
    }

    override fun query(id: ID): T {
        return baseRepo!!.findOne(id)
    }

    override fun query(): List<T> {
        return baseRepo!!.findAll()
    }

    override fun query(page: Int): Page<T> {
        val sort: Sort = Sort(Sort.Direction.ASC,"id")
        val size: Int = 10
        val pageable: Pageable = PageRequest(page,size,sort)
        return baseRepo!!.findAll(pageable)
    }
}