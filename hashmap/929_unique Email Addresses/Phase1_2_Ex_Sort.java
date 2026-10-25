import java.util.Arrays;

/**
 * Solution
 * 
 * Pattarn Sort
 */
class Solution {

    // クラスロード時に1回だけコンパイル（コスト小・全インスタンスで共有可能）
    private static final String AT_SIGN = "\\@";
    private static final String PLUS_SING = "\\+";
    private static final String DOT = "\\.";

    public int numUniqueEmails(String[] emails) {
        String[] normalizedEmailsArray = new String[emails.length];
        for (int i = 0; i < emails.length; i++) {
            normalizedEmailsArray[i] = normalize(emails[i]);
        }

        Arrays.sort(normalizedEmailsArray);

        // ソートした配列の隣接要素の比較で重複を検出
        int result = 1; // ソート済み配列の先頭は必ずユニークなので1から開始
        for (int i = 1; i < normalizedEmailsArray.length; ++i) {
            if (!normalizedEmailsArray[i].equals(normalizedEmailsArray[i - 1])) {
                result++;
            }
        }

        return result;
    }

    private String normalize(String email) {
        String[] emailParts = email.split(AT_SIGN, 2);
        String[] localParts = emailParts[0].split(PLUS_SING);
        String local = localParts[0].replaceAll(DOT, "");
        String domain = emailParts[1];

        return local + AT_SIGN + domain;
    }
}
