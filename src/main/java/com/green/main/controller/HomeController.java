package com.green.main.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.green.menu.service.MenuService;
import com.green.menu.vo.MenuVo;

@Controller
public class HomeController {
	
	@Autowired
	private MenuService menuService;
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		// 전체 메뉴 목록
		List<MenuVo> menuList= menuService.getMenuList();
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("menuList", menuList);
		mv.setViewName("home");
		return mv;
	}
}
