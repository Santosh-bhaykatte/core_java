package core_Java.strings;

public class JSONBuilder {
    public static void main(String[] args) {
        StringBuilder json = new StringBuilder();

        json.append("{")
                .append("\"name\":\"santo\",")
                .append("\"course\":\"MCA\",")
                .append("\"skills\":[\"Java\", \"SQL\", \"C++\"]")
                .append("}");

        System.out.println("JSON output: "+ json.toString());
    }
}
