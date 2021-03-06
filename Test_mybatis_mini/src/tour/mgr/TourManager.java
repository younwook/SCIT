package tour.mgr;

import java.util.ArrayList;

import tour.dao.tourDAO;
import tour.vo.TourArea;

public class TourManager {
	
	tourDAO dao = new tourDAO();
	
	/**
	 * 도서정보 저장
	 * @param vo 저장할 도서 정보
	 * @return 저장 성공 여부
	 */
	public boolean insertBook(TourArea vo) {
		int cnt = dao.insertBook(vo);
		
		if(cnt > 0) {
			return true;
		}
		
		return false;
	}
	

	/**
	 * 전체 도서 목록 읽기
	 * @return 도서 목록
	 */
	public ArrayList<TourArea> listAll() {
		return dao.listAll();
	}
	
	/**
	 * 번호로 도서정보 읽기
	 * @param bnum 검색할 번호
	 * @return 도서 정보 
	 */
	public TourArea getBook(int bnum) {
		return dao.getBook(bnum);
	}

	/**
	 * 번호로 삭제하기
	 * @param bnum 삭제할 번호
	 * @return 삭제 성공 여부
	 */
	public boolean deleteBook(int bnum) {
		int cnt = dao.deleteBook(bnum);
		
		if(cnt > 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * 번호로 도서 정보 수정하기
	 * @param vo 수정할 정보가 담긴 객체
	 * @return 수정 성공 여부
	 */
	public boolean updateBook(TourArea vo) {
		int cnt = dao.updateBook(vo);
		
		if(cnt > 0) {
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * 검색하기
	 * @param text 검색어
	 * @return 검색 결과
	 */
	public ArrayList<TourArea> searchBook(String text) {
		return dao.searchBook(text);
		
	}
	
	/**
	 * 출판사별 검색하기
	 * @return 검색 결과
	 */
	public ArrayList<TourArea> searchPublisher(){
		return dao.searchPublisher();
		
	}
}
