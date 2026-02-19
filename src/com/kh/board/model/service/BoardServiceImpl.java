package com.kh.board.model.service;

import java.sql.Connection;
import java.util.List;

import com.kh.board.model.dao.BoardDao;
import static com.kh.board.model.template.JDBCTemplate.*;
import com.kh.board.model.vo.Board;

// BoardService 인터페이스를 구현하는 클래스.
// 각 메서드의 설명에 맞게 기능을 작성.
public class BoardServiceImpl implements BoardService{
	
	private BoardDao dao = new BoardDao();
	
	@Override
	public int login(String memberId, String MemberPwd) {
		Connection conn = getConnection();
		int result = dao.login(conn, memberId,MemberPwd);
		close(conn);
		return result;
	}

	@Override
	public int insertBoard(Board b) {
		Connection conn = getConnection();
		int result = dao.insertBoard(conn, b);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

	@Override
	public List<Board> selectBoardList() {
		Connection conn = getConnection();
		List<Board> list = dao.selectBoardList(conn);
		close(conn);
		return list;
	}

	@Override
	public Board selectBoard(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateBoard(int boardNo, Board b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
