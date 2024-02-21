package com.bochra.authMicroservice.service;

import com.bochra.authMicroservice.dao.request.SignUpRequest;
import com.bochra.authMicroservice.dao.request.SigninRequest;
import com.bochra.authMicroservice.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
