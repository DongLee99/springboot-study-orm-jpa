package domain;

public class CustomDelimiter implements Delimiter{
    private final String customValue;

    public CustomDelimiter(String value) {
        this.customValue = value;
    }

    @Override
    public String[] split(String input) {
        return input.split(customValue);
    }
}
