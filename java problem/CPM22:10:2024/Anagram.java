class Anagram{ 
    public static boolean findAnagram(String str1,String str2)
    {
        if(str1.length()!=str2.length()){
            return false;
        }
        int frequency[]=new int[26];
        for(char ch : str1.toCharArray())
        {
           frequency[ch-'a']++;
        }
        for(char ch : str2.toCharArray()){
            frequency[ch-'a']--;
            if(frequency[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="listen";
        String str2="silentz";
        System.out.println(findAnagram(str1,str2));
    }
}
