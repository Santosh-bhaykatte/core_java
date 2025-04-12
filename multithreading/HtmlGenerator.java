package core_Java.multithreading;

class HtmlGenerator {
    public static void main(String[] args) {
        StringBuilder html = new StringBuilder();

        html.append("<html>\n<body>\n");
        html.append("<h1>Welcome User</h1>\n");
        html.append("<p>This is a dynamically generated page.</p>\n");
        html.append("</body>\n</html>");

        System.out.println(html.toString());  // Fast and efficient!
    }
}

