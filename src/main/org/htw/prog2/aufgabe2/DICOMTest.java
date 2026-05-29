package org.htw.prog2.aufgabe2;

import com.pixelmed.dicom.AttributeList;
import com.pixelmed.display.SourceImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DICOMTest {
    public static void main(String[] args) {
        String infilename = "data/angiogram1.DCM";
        BufferedImage image = null;
        try {
            AttributeList fileattributes = new AttributeList();
            // Metadaten der Datei einlesen
            fileattributes.read(infilename);
            // Bilddaten einlesen
            SourceImage dcImage = new SourceImage(fileattributes);
            // Bild 4 aus Bilddaten in BufferedImage einlesen
            image = dcImage.getBufferedImage(4);
        } catch (Exception e) {
            System.out.println("Error reading image file: " + e.getMessage());
        }
        try {
            ImageIO.write(image, "png", new File("frame4.png"));
        } catch (IOException e) {
            System.out.println("Error writing png file: " + e.getMessage());
        }

    }
}
