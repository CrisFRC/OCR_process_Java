package utils;

public class Data_capture {

    public static String[] getWordFromDB(String text){
        String clean = text.replaceAll(" ","");
        String[] textWished = clean.split(";");
        return textWished;
    }

}