package com.example.hello;
public class Hello {
    public static void main(String[] args) throws Exception {
        while (true) {
            new Hello().hello();
            Thread.sleep(2000);
        }
    }

    public void hello() {
        System.out.println("Hello, World");
    }
}
