package com.yh.web.service

import com.sun.org.apache.xpath.internal.operations.Bool
import com.yh.web.entity.Article

/**
 * Created by yuh on 17/06/08.
 */
interface IArticleService {
    fun findAll(): List<Article>
    fun findOne(id: Int): Article
    fun update(article: Article): Article
    fun delete(id: Int)
}