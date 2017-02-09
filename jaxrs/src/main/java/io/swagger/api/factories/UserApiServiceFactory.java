package io.swagger.api.factories;

import io.swagger.api.UserApiService;
import io.swagger.api.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-02-09T15:37:28.022Z")
public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}
