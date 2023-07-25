package com.allron.javalearn.base.枚举;

public class JudgeRole {
    
    public String judge(String roleName){
        return RoleEnum.valueOf(roleName).op();
    }
}
