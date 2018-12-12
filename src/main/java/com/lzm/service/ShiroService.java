package com.lzm.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;

import java.util.Date;

/**
 * @ClassName ShiroService
 * @Author LZM
 * @Date 2018/12/12 8:41
 * @Version 1.0
 **/
public class ShiroService {
    @RequiresRoles({"admin"})
    public void testMethod(){
        System.out.println("testMethod, time: " + new Date());

        Session session = SecurityUtils.getSubject().getSession();
        Object val = session.getAttribute("key");

        System.out.println("Service SessionVal: " + val);
    }
}
