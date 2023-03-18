package com.naila.Chapter9.ObjectAndClasses.Ujian_PBO.Soal3_;

public class TestManager {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Jeffry");

        Manager vp = new VicePresident();
        vp.name = "Jaka";
        vp.sayHello("Budi");
    }
}
