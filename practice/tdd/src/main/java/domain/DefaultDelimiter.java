package domain;

public class DefaultDelimiter implements Delimiter{

    public DefaultDelimiter() {
    }

    @Override
    public String[] split(String input) {
        return input.split(defaultValue);
    }
}
