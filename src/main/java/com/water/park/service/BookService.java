package com.water.park.service;

import java.util.ArrayList;

import com.water.park.vo.BookVO;


public interface BookService {
	ArrayList<BookVO> getAllBook()     throws Exception;
}
