package com.spring.crawling;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class CrawlingServiceImpl implements CrawlingService{

	@Inject
	CrawlingDAO crawlingDAO ;
	
	@Override
	public int insertNotice(CrawlingVO vo) {
		return crawlingDAO.insertNotice(vo);
	}
//	@Override
//	public int deleteBoard(int seq) {
//		return boardDAO.deleteBoard(seq) ;
//	}
//	
//	@Override
//	public int updateBoard(BoardVO vo) {
//		return boardDAO.updateBoard(vo) ;
//	}
//	
//	@Override
//	public BoardVO getBoard(int seq) {
//		return boardDAO.getBoard(seq) ;
//	}
//	
//	@Override
//	public List<BoardVO> getBoardList() {
//		return boardDAO.getBoardList() ;
//	}
}