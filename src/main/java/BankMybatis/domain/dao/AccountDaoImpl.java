package BankMybatis.domain.dao;

import BankMybatis.domain.dto.Account;
import BankMybatis.utils.MybatisSqlSessionFactory;
import java.util.List;

import org.apache.ibatis.session.SqlSession;


public class AccountDaoImpl implements AccountDao {

	//SqlSession 생성
	SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();

	@Override
	public void insertAccount(Account acc) throws Exception {
		sqlSession.insert("mapper.account.insertAccount", acc);
		sqlSession.commit();
	}

	@Override
	public Account selectAccount(String id) throws Exception {
		return sqlSession.selectOne("mapper.account.selectAccount", id);
	}

	@Override
	public void updateBalance(Account acc) throws Exception {
		sqlSession.update("mapper.account.updateBalance", acc);
		sqlSession.commit();
	}

	@Override
	public List<Account> selectAllAccount() throws Exception {
		return sqlSession.selectList("mapper.account.selectAllAccount");
	}
}
