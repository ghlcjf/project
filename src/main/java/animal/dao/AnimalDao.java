package animal.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import animal.vo.FreeBoard;
import animal.vo.FreeComment;
import animal.vo.FreeCommentCommand;

//import spring.vo.Member;

public class AnimalDao {

	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	//----------------------------------------------------------------------------

	public List<FreeBoard> selectAllFreeBoardList() {
		
		return sqlSession.selectList("mybatis.mapper.member.selectAllFreeBoard");
	}

	public FreeBoard selectByFreeBoardNum(long boardNum) {
		
		return sqlSession.selectOne("mybatis.mapper.member.selectByFreeBoardNum", boardNum);
	}

	public void addViewConutFreeBoard(FreeBoard freeBoard) {
		
		sqlSession.update("mybatis.mapper.member.updateViewCountFreeBoard", freeBoard);
	}

	public void addGoodCount(FreeBoard updateFreeBoard) {
		
		sqlSession.update("mybatis.mapper.member.updateGoodCountFreeBoard", updateFreeBoard);
		
	}

	public void addBadCount(FreeBoard updateFreeBoard) {
		
		sqlSession.update("mybatis.mapper.member.updateBadCountFreeBoard", updateFreeBoard);
		
	}

	public void addReportCount(FreeBoard updateFreeBoard) {
		
		sqlSession.update("mybatis.mapper.member.updateReportCountFreeBoard", updateFreeBoard);
	}

	public List<FreeComment> selectAllFreeComment(long boardNum) {
		// 자유 게시글의 글 번호를 이용해 해당 게시글의 댓글을 리스트로 반환하는 메서드
		return sqlSession.selectList("mybatis.mapper.member.selectAllFreeComment",boardNum);
	}

	public void insertFreeComment(FreeCommentCommand fcc) {
		
		sqlSession.insert("mybatis.mapper.member.insertFreeComment", fcc);
		
	}

	public List<FreeComment> selectAllFreeComment2(String boardNum) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("mybatis.mapper.member.selectAllFreeComment2",boardNum);
	}
	

	
}
