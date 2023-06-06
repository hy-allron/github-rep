package com.allron.javalearn.base.枚举;

public enum RoleEnum implements RoleOperation{
    ROLE_ROOT_ADMIN {
        @Override
        public String op() {
            return "ROLE_ROOT_ADMIN: " + "has A permission";
        }
    },
    
    ROLE_ORDER_ADMIN {
        @Override
        public String op() {
            return "ROLE_ORDER_ADMIN: " + "has B permission";
        }
    },
    
    ROLE_NORMAL{
        @Override
        public String op() {
            return "no permission";
        }
    }
}