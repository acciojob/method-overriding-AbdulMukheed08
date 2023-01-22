package com.driver;

class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }
    String callAMeth(){
        return super.meth();
    }
}
