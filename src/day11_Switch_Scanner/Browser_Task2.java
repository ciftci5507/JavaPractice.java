package day11_Switch_Scanner;

public class Browser_Task2 {

    public static void main(String[] args) {

        String browserName = "opera";

        String output;

        switch (browserName) {
            case "chrome":
            case "firefox":
            case "opera":
            case "safari":
            case "edge":
                output = browserName;
                break;
            default:
                output = "Invalid Browser";
        }

        System.out.println(output);

    }
}
