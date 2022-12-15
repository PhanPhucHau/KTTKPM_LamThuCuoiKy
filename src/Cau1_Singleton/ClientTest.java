package Cau1_Singleton;


import java.awt.*;

public class ClientTest {
    public static void main(String[] args) {
        EagerInitialization eager1 = new EagerInitialization().getInstance();
        eager1.setName("Hậu");
        System.out.println(eager1.getName());


    }

}
