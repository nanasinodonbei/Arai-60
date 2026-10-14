import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();

        for (String email : emails) {
            String[] emailParts = email.split("\\@");
            String local = emailParts[0];
            String domain = emailParts[1];

            String[] localParts = local.split("\\+");
            local = localParts[0];
            local = local.replaceAll("\\.", "");

            String normalized = local + "@" + domain;
            result.add(normalized);
        }

        return result.size();
    }
}