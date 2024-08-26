package BankMybatis.domain.dao;

import BankMybatis.domain.dto.Member;

public interface MemberDao {
	void insertMember(Member member) throws Exception;
	Member selectMember(String id) throws Exception;
}
