package com.spring.member.service.sjw0912;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.spring.member.vo.MemberVO;

public interface MemberService {
	 public List listMembers() throws DataAccessException;
	 public int addMember(MemberVO membeVO) throws DataAccessException;
	 public int removeMember(String id) throws DataAccessException;
	 public int updateMember(MemberVO memberVO) throws DataAccessException;
}
