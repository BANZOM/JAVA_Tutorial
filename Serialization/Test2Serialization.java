package Serialization;

import java.io.Serializable;

public class Test2Serialization implements Serializable {
    private int var1;
    Test2Serialization (int var1){
        this.var1 = var1;
    }
    public int getVar1(){
        return var1;
    }
}
