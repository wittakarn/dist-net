/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.session;

import com.wittakarn.business.Login;
import com.wittakarn.domain.User;
import java.io.Serializable;
import javax.ejb.Stateless;

/**
 *
 * @author Wittakarn
 */
@Stateless
public class LoginService implements LoginServiceable, Serializable {

    @Override
    public boolean authorize(User user) {
        return Login.authorize(user);
    }

}
