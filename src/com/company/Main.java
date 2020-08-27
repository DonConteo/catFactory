package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = reader.readLine();
            Cat cat = CatFactory.getCatByName(s);
            if (s.equals("")) break;
            System.out.println(cat.toString());
        }
    }
	public static class CatFactory{
	    static Cat getCatByName(String name){
	        Cat cat = null;
	        if ("male".equals(name)){
	            cat = new MaleCat("кот");
            }
	        if ("female".equals(name)){
	            cat = new FemaleCat("кошка");
            }
            return cat;
        }
    }

    static class Cat{
        private String name;
        protected Cat(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public String toString() {
            return "Я - " + getName();
        }
    }

    static class MaleCat extends Cat{
        protected MaleCat(String name) {
            super(name);
        }
        public String toString(){
            return ("Я - солидный " + getName());
        }
    }

    static class FemaleCat extends Cat{
        protected FemaleCat(String name) {
            super(name);
        }
        public String toString(){
            return ("Я - изящная " + getName());
        }
    }
}
