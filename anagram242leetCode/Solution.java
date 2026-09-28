class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] tabS = s.toCharArray();
        char[] tabT = t.toCharArray();


        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

           map.put(tabS[i],map.getOrDefault(tabS[i],0)+1);
           map.put(tabT[i],map.getOrDefault(tabT[i],0)-1);
        }
        for(int count : map.values())
        {
            if(count != 0)
                return false;
        }
        return true ;
    }
}
