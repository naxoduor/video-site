package com.videoshare.oduor.youtubeclone.config;

import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;


public class AudienceValidator implements OAuth2TokenValidator<Jwt> {

    private final String audience;

    public AudienceValidator(String audience){
        System.out.println("validator");
        this.audience=audience;
    }
    @Override
    public OAuth2TokenValidatorResult validate(Jwt token) {
        System.out.println("Print token");
        System.out.println(token);
        System.out.println("get validatorss");
        System.out.println(token.getAudience());
        System.out.println("print audience");
        System.out.println(audience);
        if(token.getAudience().contains(audience)){
            return OAuth2TokenValidatorResult.success();
        }
        return OAuth2TokenValidatorResult.failure(new OAuth2Error("Invalid audience for the given token"));
    }
}
