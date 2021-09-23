package domain;

public interface Delimiter {
    public final static String defaultValue = "[,;]";

    String[] split(String input);
}
