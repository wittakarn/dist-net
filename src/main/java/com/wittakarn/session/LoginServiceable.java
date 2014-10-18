/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.session;

import com.wittakarn.domain.User;
import javax.ejb.Remote;

/**
 *
 * @author Wittakarn
 */
@Remote
public interface LoginServiceable {
    public boolean authorize(User user);
}
