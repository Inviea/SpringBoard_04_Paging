package com.myweb.persistence;

import java.util.List;

import com.myweb.domain.Criteria;
import com.myweb.domain.ProductVO;

public interface ProductDAO {
	
	public void insert(ProductVO pvo);
	public List<ProductVO> selectList(Criteria cri);
	public ProductVO selectOne(Integer pno);
	public void update(ProductVO pvo);
	public void delete(Integer pno);
	public void deleteImg(Integer pno);
	public int selectOne();
	
	
}
