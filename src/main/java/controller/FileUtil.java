package controller;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


public class FileUtil {
    private FileUtil() {}
    public static URL getPathWithName(String name) {
        ClassLoader classLoader = FileUtil.class.getClassLoader();
        return classLoader.getResource(name);
    }
    public static BufferedImage getImageWithName(String path) {
        try {
            ClassLoader classLoader = FileUtil.class.getClassLoader();
            return ImageIO.read(classLoader.getResourceAsStream(path));
        } catch (IOException e) {
            System.out.println("Can't open the image clear_building.png");
        }
        return null;
    }
}