package com.visa.photos;

public class Main {

    public static void main(String[] args) {
        Photographer[] photographers = {new ExcitedParent(), new FBIDrone(), new HackedWebcam()};

        for (Photographer p : photographers) {
            p.prepareScene();
            System.out.printf("%s%n%n", p.takePhotograph());
        }
    }
}
