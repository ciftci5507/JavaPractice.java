package day10_NestedIf;

public class Protocol_Task {

    public static void main(String[] args) {
        // Let's say the status code is 200
        int statusCode = 400;

        String statusCodeLabel = statusCode == 200 ? "OK" :
                statusCode == 201 ? "Created" : statusCode == 202 ? "Accepted" :
                        statusCode == 301 ? "Moved Permanently" :
                                statusCode == 303 ? "See Other" :
                                        statusCode == 304 ? "Not Modified" :
                                                statusCode == 307 ? "Temporary Redirect" :
                                                        statusCode == 400 ? "Bad Request" :
                                                                statusCode == 401 ? "Unauthorized" :
                                                                        statusCode == 403 ? "Forbidden" :
                                                                                statusCode == 404 ? "Not Found" :
                                                                                        statusCode == 410 ? "Gone" :
                                                                                                statusCode == 500 ? "Internal Server Error" :
                                                                                                        statusCode == 503 ? "Service Unavailable" :
                                                                                                                "Unknown";

        // Print the label for the status code
        System.out.println(statusCodeLabel);
    }
}
