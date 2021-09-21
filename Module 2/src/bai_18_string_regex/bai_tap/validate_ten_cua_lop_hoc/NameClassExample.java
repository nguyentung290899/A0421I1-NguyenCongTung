package bai_18_string_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NAME_CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";
    public NameClassExample() {
        pattern = pattern.compile(NAME_CLASS_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
