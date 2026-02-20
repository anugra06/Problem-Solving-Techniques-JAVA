class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        int n=s.length();
        int mid= n/2;
        int vowelcount=0;
        for(int i=0;i<mid; i++){
            char a=s.charAt(i);
            char b=s.charAt(mid+i);
            if (vowels.contains(a)) vowelcount++;
            if (vowels.contains(b)) vowelcount--;
        }
        return vowelcount==0;
    }
}
