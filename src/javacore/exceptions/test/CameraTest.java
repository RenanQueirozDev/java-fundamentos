package javacore.exceptions.test;

import javacore.exceptions.domain.RecordingService;

import java.io.IOException;

public class CameraTest {
    public static void main(String[] args) {

        int[] clips = {30, 0, 90, 60};
        for (int i = 0; i < clips.length; i++) {
            try {
                RecordingService.recordClip(clips[i]);
                ;
            } catch (IllegalArgumentException | IOException e) {
                System.out.println("Failed: " + e.getMessage());
            } finally {
                System.out.println("Clip done");
            }

        }
    }
}
