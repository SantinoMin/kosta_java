package BankMybatis.domain.dao;

import BankMybatis.domain.dto.Account;
import java.util.List;


public interface AccountDao {
	void insertAccount(Account acc) throws Exception;
	Account selectAccount(String id) throws Exception;
	void updateBalance(Account acc) throws Exception;
	List<Account> selectAllAccount() throws Exception;
}
