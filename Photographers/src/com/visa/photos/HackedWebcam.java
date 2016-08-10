package com.visa.photos;

/**
 * Created by afeuer on 8/10/16.
 */
public class HackedWebcam implements Photographer {
    @Override
    public void prepareScene() {
        System.out.println("Let me see your proprietary info...");
    }

    @Override
    public String takePhotograph() {
        return "Got the meetings notes";
    }
}
