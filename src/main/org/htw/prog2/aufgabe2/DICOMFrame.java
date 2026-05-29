package org.htw.prog2.aufgabe2;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DICOMFrame {
    private static final double[][] S_x = new double[][]{new double[]{-1,0,1}, new double[]{-2,0,2}, new double[]{-1,0,1}};
    private static final double[][] S_y = new double[][]{new double[]{-1,-2,-1}, new double[]{0,0,0}, new double[]{1,2,1}};

    public DICOMFrame(BufferedImage image) {
    }

    private int getGrayscalePixel(BufferedImage image, int x, int y) {
        return 0;
    }

    private void detectEdges() {
    }

    public BufferedImage getImage() {
        return null;
    }

    public BufferedImage getEdges(double brightness) {
        return null;
    }
}
