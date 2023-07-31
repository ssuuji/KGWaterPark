package com.water.park.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.water.park.service.BookService;
import com.water.park.service.dao.BookDAO;
import com.water.park.vo.BookVO;


@Service("bookService")		//DAO
public class BookServiceImpl implements BookService {

	
	@Autowired //생성자
	private BookDAO bookimsi;
	
	@Transactional
	public ArrayList <BookVO> getAllBook() {
		return bookimsi.getAllBook();
	}
	
	
	
	
	
	
	
	
	
	
}
