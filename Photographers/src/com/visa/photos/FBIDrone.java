package com.visa.photos;

/**
 * Created by afeuer on 8/10/16.
 */
public class FBIDrone implements Photographer {
    @Override
    public void prepareScene() {
        System.out.println("bzzzzzzzzzz");
    }

    @Override
    public String takePhotograph() {
        return "chk chk";
    }
}
