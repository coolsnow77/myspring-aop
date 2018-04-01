package com.xueguoxue.myaop.service;

import com.xueguoxue.myaop.config.ApplicationContextHolder;
import org.springframework.beans.BeansException;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MenuService {

    @Cacheable(cacheNames = {"menu"})
    public List<String> getMenuList(){
        System.out.println("");
        System.out.println("mock: get from db");
        return Arrays.asList("article", "comment", "admin");
    }

    public List<String> getRecommends() throws BeansException {
        MenuService menuService = ApplicationContextHolder.getContext().getBean(MenuService.class);
        return menuService.getMenuList();
    }
}
