package javacore.exceptions.domain;

import java.io.IOException;

public class Camera implements AutoCloseable {
    public Camera() {
        System.out.println("Camera on");
    }

    public void record(int seconds) throws IOException {
        if (seconds <= 0) {
            throw new IllegalArgumentException("Invalid duration: " + seconds);
        }

        if (seconds > 60) {
            throw new IOException("Storage full: " + seconds + "s");
        }
        System.out.println("Recorded " + seconds + "s");
    }

    @Override
    public void close() {
        System.out.println("Camera off");
    }
}

