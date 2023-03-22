package utils;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class OCR_capture {



    public static String getTextFromImage(String path){
        Segmentation.thresholdSegmentation(path);
        ITesseract instance = new Tesseract();
        try{
            instance.setLanguage("spa");
            String imageText = instance.doOCR(new File("images/output.jpg"));
            System.out.println(imageText);
            return null;
        }catch(Exception e)
        {
            e.printStackTrace();
            return "not found";
        }
    }




}
