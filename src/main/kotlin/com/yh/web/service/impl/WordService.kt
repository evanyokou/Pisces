package com.yh.web.service.impl

import com.yh.web.entity.Word
import com.yh.web.repo.WordRepo
import com.yh.web.service.IWordService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

/**
 * Created by Ypc on 2017/06/11.
 */
@Service
class WordService : IWordService , BaseService<Word,Int>(){

    @Autowired
    val wordRepo : WordRepo? = null

    override fun setUp() {
        this.baseRepo = wordRepo
    }

    override fun queryByName(condition: String): List<Word> {
        return this.wordRepo!!.queryByName(condition)
    }

    override fun queryByName(condition: String, page: Int): Page<Word> {
        val sort: Sort = Sort(Sort.Direction.ASC,"id")
        val size: Int = 10
        val pageable: Pageable = PageRequest(page,size,sort)
        return this.wordRepo!!.queryByName(condition,pageable)
    }
}