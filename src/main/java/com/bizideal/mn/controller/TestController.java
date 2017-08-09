package com.bizideal.mn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者 liulq:
 * @data 创建时间：2017年6月21日 下午2:10:05
 * @version 1.0
 * @description 描述
 */
@RestController
public class TestController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public Integer add(@RequestParam Integer a, @RequestParam Integer b, HttpServletRequest request) {
		Integer r = a + b;
		System.out.println("调用了b的add方法");
		System.out.println("sessionid=" + request.getSession().getId());
		request.getSession().setAttribute("a", 3);
		return r;
	}

	@RequestMapping(value = "/sub", method = RequestMethod.GET)
	public Object sub(HttpServletRequest request) {
		System.out.println("调用了b的sub方法");
		System.out.println("sessionid=" + request.getSession().getId());
		Object attribute = request.getSession().getAttribute("a");
		return attribute;
	}
}
