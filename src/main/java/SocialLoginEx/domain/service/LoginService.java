package SocialLoginEx.domain.service;

import BankMybatis.domain.dto.Member;

public interface LoginService {

  Member kakaoLogin(String code) throws Exception;

}
