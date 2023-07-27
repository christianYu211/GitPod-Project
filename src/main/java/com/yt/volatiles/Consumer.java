package com.yt.volatiles;

import java.util.concurrent.BlockingDeque;

public class Consumer {
    BlockingDeque storage;

    public Consumer(BlockingDeque storage){
        this.storage = storage;
    }
    public boolean needMoreNums(){
        if(Math.random() > 0.97){
            return false;
        }
        return true;
    }
}
