import java.util.Set;
import java.util.HashSet;

class Solution {
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
        if (!email.contains("@")) {
            throw new IllegalArgumentException("invalid email format");
        }

        String[] emailParts = email.split("@", 2);
        String domain = emailParts[1];
        String local = emailParts[0].split("\\+")[0].replaceAll("\\.", "");

        return local + "@" + domain; 
    }
}
