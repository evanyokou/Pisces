package com.yh.web.action

import com.yh.web.entity.Article
import com.yh.web.service.impl.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * Created by yuh on 17/06/07.
 */
@Controller
class TestAction (
        @Autowired
        val articleService: ArticleService
){
    @RequestMapping("/test")
    fun test(): ModelAndView{
        val m = ModelAndView()
        val data: List<Article> = articleService.findAll()
        m.viewName = "test"
        m.addObject("test",data)
        return m
    }
}