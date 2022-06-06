package com.green.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.menu.service.MenuService;
import com.green.menu.vo.MenuVo;

@Controller
@RequestMapping("/Menus")
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/List")
	public String menuList( Model model ) {
		
		// 메뉴목록 조회
		List<MenuVo> menuList = menuService.getMenuList();
		model.addAttribute("menuList", menuList);
		
		return "menus/list";
		
	}
	
}
