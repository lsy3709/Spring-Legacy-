package com.myspring.pro27.member.daosmh0915;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro27.member.vo.MemberVO;

public interface MemberDAO {
	// μΆκ?, ? ??? ? λ³? κ°?? Έ?€κΈ? λ©μ? μΆκ?
	 public MemberVO selectOneMember(String id) throws DataAccessException;
	 
	 //μΆκ?, ??  λ°μ?κΈ?.
	 public int updateMember(MemberVO memberVO) throws DataAccessException ;
	 
	 public List selectAllMemberList() throws DataAccessException;
	 public int insertMember(MemberVO memberVO) throws DataAccessException ;
	 public int deleteMember(String id) throws DataAccessException;
	 // ? ? ?κ³? ??
	 public MemberVO loginById(MemberVO memberVO) throws DataAccessException;

}
