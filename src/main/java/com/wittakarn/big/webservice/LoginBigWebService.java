/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wittakarn.big.webservice;

import com.wittakarn.business.Login;
import com.wittakarn.domain.User;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Wittakarn
 */
@WebService(serviceName = "LoginBigWebService")
public class LoginBigWebService {

    @WebMethod(operationName = "authorize")
    public boolean authorize(@WebParam(name = "user") User user) {
        return Login.authorize(user);
    }
}
