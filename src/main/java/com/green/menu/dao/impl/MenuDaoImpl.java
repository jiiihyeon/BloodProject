package com.green.menu.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.menu.dao.MenuDao;
import com.green.menu.vo.MenuVo;

@Repository("menuDao")
public class MenuDaoImpl implements MenuDao {

	@Autowired SqlSession sqlSession;
	
	@Override
	public List<MenuVo> getMenuList() {
		List<MenuVo> menuList = sqlSession.selectList("Menu.MenuList");
		return menuList;
	}

}
