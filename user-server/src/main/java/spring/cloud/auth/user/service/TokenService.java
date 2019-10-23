package spring.cloud.auth.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import spring.cloud.auth.user.domain.JWT;

/**
 * Created by byang059 on 2019-10-22
 */
@FeignClient(value = "auth-server")
public interface TokenService {
    @PostMapping(value = "/oauth/token")
    JWT getToken(@RequestHeader(value = "Authorization") String authorization, @RequestParam("grant_type") String type,
                 @RequestParam("username") String username, @RequestParam("password") String password);
}
