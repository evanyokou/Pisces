package com.yh.web.service

import com.yh.web.entity.Word
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable


/**
 * Created by Ypc on 2017/06/11.
 */
interface IWordService{
    fun queryByName(condition: String): List<Word>
    fun queryByName(condition: String,page: Int): Page<Word>
}