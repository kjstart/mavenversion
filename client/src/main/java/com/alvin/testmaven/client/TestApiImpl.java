package com.alvin.testmaven.client;

import com.alvin.testmaven.core.TestAPI;

public class TestApiImpl implements TestAPI {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String s) {
        this.name = name;
    }

    @Override
    public String getVersion() {
        return "1.0";
    }
}
