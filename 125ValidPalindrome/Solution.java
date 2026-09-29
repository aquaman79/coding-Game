class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        char[] tabS = s.toCharArray();

        int i = 0;
        int j = tabS.length - 1;

        while (i < j) {

            if (!Character.isLetterOrDigit(tabS[i])) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(tabS[j])) {
                j--;
                continue;
            }

            if (tabS[i] == tabS[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}
