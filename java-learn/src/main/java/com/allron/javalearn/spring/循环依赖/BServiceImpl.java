package com.allron.javalearn.spring.循环依赖;

import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author allron
 * @date 2023/5/11 16:28
 */
@Service
public class BServiceImpl {
    
    /*@Autowired
    private AServiceImpl aService;*/
    
    public void print(){
        System.out.println("BService");
    }
}
