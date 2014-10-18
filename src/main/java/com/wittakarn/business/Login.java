/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.business;

import com.wittakarn.domain.User;
import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class Login implements Serializable{
    public static boolean authorize(User user) {
        boolean success = false;
        if(user.getUser().equals("wittakarn") && user.getPassword().equals("keeratichayakorn")){
            success = true;
        }
        return success;
    }
}
