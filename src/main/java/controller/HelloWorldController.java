
package controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.persistence.Convert;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!!!";
    }

    @PostMapping("/")
    public void convertToBlackAndWhite(File file, String newFileName) {
        try {

            final BufferedImage colorImage = ImageIO.read(file);

            Graphics2D g = colorImage.createGraphics();
            g.drawImage(colorImage, null, 0, 0);

            final BufferedImage grayImage = new BufferedImage(colorImage.getWidth(), colorImage.getHeight(),
                    BufferedImage.TYPE_BYTE_GRAY);
            g = grayImage.createGraphics();
            g.drawImage(colorImage, 0, 0, null);
            g.dispose();

            File output = new File("C:/Users/Whatever/Downloads/" + newFileName + ".jpg");
            ImageIO.write(grayImage, "jpg", output);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}