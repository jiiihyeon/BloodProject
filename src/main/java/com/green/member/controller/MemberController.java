package com.green.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.green.menu.service.MenuService;
import com.green.menu.vo.MenuVo;

@Controller
@RequestMapping("/Member")
public class MemberController {
	
	@Autowired
	private MenuService menuService;
	
	
	@RequestMapping("/Login")
	public ModelAndView login( ) {
		
		// 메뉴목록 조회
		List<MenuVo> menuList = menuService.getMenuList();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("menuList", menuList);
		mv.setViewName("member/login");
		return mv;
	}
	
	@RequestMapping("/Logout")
	public ModelAndView logout( String menu_id ) {
		
		
		// 메뉴목록 조회
	    List<MenuVo> menuList = menuService.getMenuList();
				
	    ModelAndView mv = new ModelAndView();
		mv.addObject("menuList", menuList);
		mv.setViewName("member/logout");
		return mv;
	}

}