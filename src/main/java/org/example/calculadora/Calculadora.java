package org.example.calculadora;

public class Calculadora {


    private int ans;


    public  int resta (int a,int b){
        ans = a-b;
        return a-b;
    }


    public int suma(int a, int b){
        ans = a+b;
        return ans;
    }


    public int div(int a,int b){
        ans = a/b;
        return ans;
    }

    public int add(int v){
        ans += v;
        return ans;
    }

    public int ans(){
        return ans;
    }

    public static void main(String args[]){

    }

}
