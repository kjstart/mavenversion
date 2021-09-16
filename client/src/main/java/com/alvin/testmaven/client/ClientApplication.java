package com.alvin.testmaven.client;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {


    public static void main(String[] a){
        StringUtils.isNotBlank("A");
    }
}
