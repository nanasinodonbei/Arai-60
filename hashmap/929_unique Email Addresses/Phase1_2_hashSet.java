import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 * 
 * Pattern HashSet
 */
class Solution {
    private static final String AT_SIGN = "@";
    private static final String PLUS_SIGN = "\\+";
    private static final String DOT = "\\.";

    public int numUniqueEmails(String[] emails) {
        if (emails == null) {
            throw new IllegalArgumentException("emails must not be null");
        }
        if (emails.length == 0) {
            return 0;
        }

        Set<String> seenEmails = new HashSet<>();
        for (String email : emails) {
            seenEmails.add(normalize(email));
        }

        return seenEmails.size();
    }

    private String normalize(String email) {
        String[] parts = email.split(AT_SIGN, 2);
        String domain = parts[1];
        String local = parts[0].split(PLUS_SIGN)[0].replaceAll(DOT, "");

        return local + AT_SIGN + domain;
    }
}
