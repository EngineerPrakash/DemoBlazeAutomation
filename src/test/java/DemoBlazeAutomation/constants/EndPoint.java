package DemoBlazeAutomation.constants;

public enum EndPoint {

    HOME("/index.html"),

    CART("/cart");

    public final String url;

    EndPoint(String url) {
        this.url = url;
    }

}
