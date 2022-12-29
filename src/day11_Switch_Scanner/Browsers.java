package day11_Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browserName = "firefox";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge";


        if (validBrowser) {


            if (browserName == "safari") {
                result = "Safari is Selected";
            } else if (browserName == "chrome") {
                result = "Chrome is Selected";
            } else if (browserName == "firefox") {
                result = "Firefox is Selected";
            } else if (browserName == "opera") {
                result = "Opera is Selected";
            } else {
                result = "Edge is Selected";
            }
        } else {

            result = "Invalid Browser Name";
        }

        System.out.println(result);


    }

}
