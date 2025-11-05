package _32_LayerdArchitecture2.service;


import _32_LayerdArchitecture2.dto.SigninReqDto;

public interface SigninService {
    void signin(SigninReqDto signinReqDto);

    boolean isEmpty(String str);
}
