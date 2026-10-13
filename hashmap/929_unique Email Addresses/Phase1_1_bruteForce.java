import java.util.List;
import java.util.ArrayList;

/**
 * UniqueEmailAddresses Solution
 * 
 * bruteForce
 */
class Solution {
    public int numUniqueEmails(String[] emails) {
        List<String> normalizedEmails = new ArrayList<>();

        for (String email : emails) {
            // @でsplitし、@の前後で分ける
            String[] emailParts = email.split("@");
            String local = emailParts[0];
            String domain = emailParts[1];
            
            // +でsplitし、＋前後で分けてホストの部分でlocalを更新する
            String[] localParts = local.split("\\+");
            local = localParts[0];
            
            // .を除去
            local = local.replaceAll("\\.", "");

            // localとdomainを結合
            String normalized = local + "@" + domain;
            normalizedEmails.add(normalized);
        }

        List<String> uniqueEmails = new ArrayList<>();
        for (String normalizedEmail : normalizedEmails) {
            if (!uniqueEmails.contains(normalizedEmail)) {
                uniqueEmails.add(normalizedEmail);
            }
        }

        return uniqueEmails.size();
    }
}