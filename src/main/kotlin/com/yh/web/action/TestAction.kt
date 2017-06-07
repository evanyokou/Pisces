package com.yh.web.action

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * Created by yuh on 17/06/07.
 */
@Controller
class TestAction {
    @RequestMapping("/test")
    fun test(): ModelAndView{
        val m = ModelAndView()
        val data: IntArray = intArrayOf(1,2,3,4,5)
        m.viewName = "test"
        m.addObject("test",data)
        return m
    }
}