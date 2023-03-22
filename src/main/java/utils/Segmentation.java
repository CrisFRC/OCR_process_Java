package utils;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;



public class Segmentation {

    public static void thresholdSegmentation(String path) {

        // load the opencv library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat image = Imgcodecs.imread(path);
        // transform to gray color
        Mat grayImage = new Mat();
        Imgproc.cvtColor(image, grayImage, Imgproc.COLOR_BGR2GRAY);
        int threshold = 128;
        Mat thresholdedImage = new Mat();
        Imgproc.threshold(grayImage, thresholdedImage, threshold, 255, Imgproc.THRESH_BINARY);
        Imgcodecs.imwrite("image\\output_image.jpg", thresholdedImage);
    }

}
