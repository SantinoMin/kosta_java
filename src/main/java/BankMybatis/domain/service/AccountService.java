package BankMybatis.domain.service;

import BankMybatis.domain.dto.Account;
import java.util.List;



public interface AccountService {
	Account makeAccount(Account acc) throws Exception;
	Account deposit(String id, Integer money) throws Exception;
	Account withdraw(String id, Integer money) throws Exception;
	Account accountInfo(String id) throws Exception;
	List<Account> allAccountInfo() throws Exception;
	void transfer(String sid, String rid, Integer money) throws Exception;
	
	boolean checkAccDoubleId(String id) throws Exception;
}
