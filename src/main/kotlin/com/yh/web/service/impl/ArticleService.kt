package com.yh.web.service.impl

import com.sun.org.apache.xpath.internal.operations.Bool
import com.yh.web.entity.Article
import com.yh.web.repo.ArticleRepo
import com.yh.web.service.IArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by yuh on 17/06/08.
 */
@Service
class ArticleService: IArticleService {
    @Autowired
    val articleRepo: ArticleRepo? = null

    override fun findAll(): List<Article> {
        return articleRepo!!.findAll()
    }

    override fun findOne(id: Int): Article {
        return articleRepo!!.findOne(id)
    }

    override fun update(article: Article): Article {
        return articleRepo!!.save(article)
    }

    override fun delete(id: Int) {
        return articleRepo!!.delete(id)
    }
}