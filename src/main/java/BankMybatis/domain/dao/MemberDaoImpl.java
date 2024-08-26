package BankMybatis.domain.dao;

import BankMybatis.domain.dto.Member;

import org.apache.ibatis.session.SqlSession;
import BankMybatis.utils.MybatisSqlSessionFactory;


public class MemberDaoImpl implements MemberDao {
	
	private SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();
	
	@Override
	public void insertMember(Member member) throws Exception {
		Member smember = selectMember(member.getId());
		if(smember!=null) throw new Exception("아이디 중복 오류");
		sqlSession.insert("mapper.member.insertMember", member);
		sqlSession.commit();
	}

	@Override
	public Member selectMember(String id) throws Exception {
		return sqlSession.selectOne("mapper.member.selectMember",id);
	}
}