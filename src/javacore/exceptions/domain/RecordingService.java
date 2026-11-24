package javacore.exceptions.domain;

import java.io.IOException;

public class RecordingService {
    public static void recordClip(int seconds) throws IOException {
       try (Camera camera = new Camera()){
           camera.record(seconds);
      }
    }
}
