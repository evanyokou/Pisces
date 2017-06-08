package com.yh.web.repo

import com.yh.web.entity.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by yuh on 17/06/08.
 */
@Repository
interface ArticleRepo : JpaRepository<Article,Int>{
}