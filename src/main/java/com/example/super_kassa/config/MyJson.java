package com.example.super_kassa.config;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
public class MyJson implements Serializable {


    private Long current;

    public void add(Integer add) {
        this.current += add;
    }
}