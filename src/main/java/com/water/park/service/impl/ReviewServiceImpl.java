package com.water.park.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.water.park.service.ReviewService;
import com.water.park.service.dao.ReviewDAO;
import com.water.park.vo.ReviewVO;

	@Service("reviewService")		//DAO
	public class ReviewServiceImpl implements ReviewService{

		
		@Autowired //생성자
		private ReviewDAO reviewimsi;
		
		@Transactional
		public ArrayList<ReviewVO> getAllReview(){
			return reviewimsi.getAllReview();
		}
}
