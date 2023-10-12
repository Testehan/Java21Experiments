import java.util.ArrayList;
import java.util.List;

public class App {

    void main(){
        System.out.println("hi");

        String name = "Joan";
        String info = STR."My name is \{name}";
        System.out.println(info);

        //  above example is equivalent to below...not sure why I can't compile it ...it does not see the raw part
//        StringTemplate st = RAW."My name is \{name}";
//        info = STR.process(st);
//        System.out.println(info);

        int x = 10, y = 20;
        String sumString = STR."\{x} + \{y} = \{x + y}";
        System.out.println(sumString);

        // Embedded expressions can invoke methods and access fields
        String giftMessage = STR."You have a \{getOfferType()} waiting for you!";
        System.out.println(giftMessage);

        // Any Java expression can be used as an embedded expression — even a template expression
        String[] fruit = { "apples", "oranges", "peaches" };
        var fruitsString = STR."\{fruit[0]}, \{STR."\{fruit[1]}, \{fruit[2]}"}";
        System.out.println(fruitsString);

        printMultilineHtmlExample();
        printMultilineJsonExample();

        templateProcessorThatReturnsJsonObject();
    }

    private void templateProcessorThatReturnsJsonObject() {
//        StringTemplate.Processor<JSONObject, JSONException> JSON_VALIDATE =
//                (StringTemplate st) -> {
//                    String quote = "\"";
//                    List<Object> filtered = new ArrayList<>();
//                    for (Object value : st.values()) {
//                        if (value instanceof String str) {
//                            if (str.contains(quote)) {
//                                throw new JSONException("Injection vulnerability");
//                            }
//                            filtered.add(quote + str + quote);
//                        } else if (value instanceof Number ||
//                                value instanceof Boolean) {
//                            filtered.add(value);
//                        } else {
//                            throw new JSONException("Invalid value type");
//                        }
//                    }
//                    String jsonSource =
//                            StringTemplate.interpolate(st.fragments(), filtered);
//                    return new JSONObject(jsonSource);
//                };
//
//        // using the above defined processor
//        String name    = "Joan Smith";
//        String phone   = "555-123-4567";
//        String address = "1 Maple Drive, Anytown";
//        try {
//            JSONObject doc = JSON_VALIDATE."""
//                {
//                    "name":    \{name},
//                    "phone":   \{phone},
//                    "address": \{address}
//                };
//                """;
//        } catch (JSONException ex) {
//
//        }
    }

    private void printMultilineJsonExample() {
        String name    = "Joan Smith";
        String phone   = "555-123-4567";
        String address = "1 Maple Drive, Anytown";
        String json = STR."""
                {
                    "name":    "\{name}",
                    "phone":   "\{phone}",
                    "address": "\{address}"
                }
                """;

        System.out.println(json);
    }

    private void printMultilineHtmlExample() {
        String title = "My Web Page";
        String text  = "Hello, world";
        String html = STR."""
        <html>
          <head>
            <title>\{title}</title>
          </head>
          <body>
            <p>\{text}</p>
          </body>
        </html>
        """;

        System.out.println(html);
    }

    String getOfferType(){
        return "gift";
    }

}
