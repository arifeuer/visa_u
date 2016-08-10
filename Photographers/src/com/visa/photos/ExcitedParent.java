package com.visa.photos;

/**
 * Created by afeuer on 8/10/16.
 */
public class ExcitedParent implements Photographer {
    @Override
    public void prepareScene() {
        System.out.println("Hey kids, smile!");
    }

    @Override
    public String takePhotograph() {
        return "A beautiful group of kids, ready for the photo album";
    }
}
