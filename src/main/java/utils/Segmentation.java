package utils;

import org.opencv.core.*;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

import java.util.ArrayList;
import java.util.List;


public class Segmentation {

    public static void thresholdSegmentation(String path) {

        // load the opencv library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat image = Highgui.imread(path);
        // transform to gray color
        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);
        int threshold = 128;
        Mat thresholdedImage = new Mat();
        Imgproc.threshold(grayImage, thresholdedImage, 0, 255, Imgproc.THRESH_BINARY_INV + Imgproc.THRESH_OTSU);
        Highgui.imwrite("images/output.jpg", thresholdedImage);
    }

}
