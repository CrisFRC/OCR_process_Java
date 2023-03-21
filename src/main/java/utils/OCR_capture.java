package utils;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class OCR_capture {


    public static void applySegmentation(String path){

    }

    public static String getTextFromImage(String path){
        ITesseract instance = new Tesseract();
        try{
            instance.setLanguage("spa");
            String imageText = instance.doOCR(new File(path));
            System.out.println(imageText);
            return imageText;
        }catch(Exception e)
        {
            e.printStackTrace();
            return "not found";
        }
    }




}
