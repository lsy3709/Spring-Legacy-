package com.myspring.pro27.member.service.lhstest0915;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro27.member.vo.MemberVO;

public interface MemberService {
	 public List listMembers() throws DataAccessException;
	 public int addMember(MemberVO memberVO) throws DataAccessException;
	 public int removeMember(String id) throws DataAccessException;
	 public MemberVO login(MemberVO memberVO) throws Exception;
	 public MemberVO getOneMember(String id) throws DataAccessException;
	 public int updateMember(MemberVO membeVO) throws DataAccessException;
}
