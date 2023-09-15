package com.myspring.pro27.member.daosmh0915;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.pro27.member.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List selectAllMemberList() throws DataAccessException {
		List<MemberVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
	}

	@Override
	public int insertMember(MemberVO memberVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insertMember", memberVO);
		return result;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		int result = sqlSession.delete("mapper.member.deleteMember", id);
		return result;
	}
	
	@Override
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException{
		// ?΄?Ό?΄?Έ?Έ -> ?λ²? : ?°?΄?° ??΄??? ?¨?€?? 
		  MemberVO vo = sqlSession.selectOne("mapper.member.loginById",memberVO);
		  // ???΄ ??Όλ©?, ?? ??? ? λ³΄λ?? ?€ κ°?μ§?κ³? ?΄. 
		return vo;
	}

	// ??? ? λ³΄λ?? μ‘°ν ?  ? ??? λ©μ? : selectOne, ??€? λ©μ? 
			// μ‘°κ±΄, μ²«λ²μ§? ?Έ?: member.xml ? sql λ¬Έμ₯? ?λ³? ??΄? 
			// ?λ²μ§Έ ?Έ?: ?λΉμ ?κΈ? μ‘°κ±΄ ??Όλ―Έν°(λ¬Έμ?΄), ? ??? ??΄?λ₯? ? ?¬. 
			// where id = "?¬κΈ°μ ?¬?©?  ?? "
			@Override
			public MemberVO selectOneMember(String id) throws DataAccessException {
				 MemberVO membervo = null;
				 membervo = (MemberVO) sqlSession.selectOne("mapper.member.selectMemberById", id);
				return membervo;
			}

			// ??  ? ?©?κΈ?.
			@Override
			public int updateMember(MemberVO memberVO) throws DataAccessException {
				int result = sqlSession.update("mapper.member.updateMember", memberVO);
				return result;
			}

}
