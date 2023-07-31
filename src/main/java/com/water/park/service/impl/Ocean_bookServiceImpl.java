package com.water.park.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.water.park.service.Ocean_bookService;
import com.water.park.service.dao.Ocean_bookDAO;
import com.water.park.vo.Ocean_bookVO;

@Service("ocean_bookService")	
public class Ocean_bookServiceImpl implements Ocean_bookService{

		
		@Autowired //생성자
		private Ocean_bookDAO ocean_bookimsi;
		
		@Transactional
		public ArrayList <Ocean_bookVO> getAllOcean_book() {
			return ocean_bookimsi.getAllOcean_book();

		
	}
}