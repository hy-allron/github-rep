package com.allron.javalearn.spring.循环依赖;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author allron
 * @date 2023/5/11 16:28
 */
@Service
public class AServiceImpl {
    
    private final BServiceImpl bService;
    
    @Autowired
    public AServiceImpl (BServiceImpl bService) {
        this.bService = bService;
    }
    
    public void print(){
        bService.print();
    }
}
