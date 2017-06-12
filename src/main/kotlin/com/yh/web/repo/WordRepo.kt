package com.yh.web.repo

import com.yh.web.entity.Word
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository


/**
 * Created by Ypc on 2017/06/11.
 */
@Repository
interface WordRepo : HelperRepo, BaseRepo<Word,Int> {
    @Query("select w from Word w where w.name like %?1% ")
    fun queryByName(queryByName: String): List<Word>

    @Query("select w from Word w where w.name like %:name% ")
    fun queryByName(@Param("name") name: String, pageable: Pageable): Page<Word>
}