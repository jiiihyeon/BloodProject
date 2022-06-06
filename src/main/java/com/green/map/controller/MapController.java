package com.green.map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.green.menu.service.MenuService;
import com.green.menu.vo.MenuVo;

@Controller
@RequestMapping("/Map")
public class MapController {
	
	@Autowired
	private MenuService menuService;
	
	
	@RequestMapping("/List")
	public ModelAndView list( ) {
		
		// 메뉴목록 조회
		List<MenuVo> menuList = menuService.getMenuList();
		
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("menuList", menuList);
		mv.setViewName("map/list");
		return mv;
	}

}
