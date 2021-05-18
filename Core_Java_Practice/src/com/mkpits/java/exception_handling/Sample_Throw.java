package com.mkpits.java.exception_handling;

public class Sample_Throw {
    public static void main(String args[]){

        int n1=10;
        int n2=5;
        int res=0;
        try
        {
            res=n1/n2;
        }catch(Exception ee)
        {
            System.out.println(ee.toString());
        }
        finally
        {
            System.out.println("finally res = " + res);
        }
    }

}
