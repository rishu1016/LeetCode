class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vol=0,con=0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);


            if(!((ch>=97&&ch<=122)||(ch>=65&&ch<=90)||(ch>=48&&ch<=57))){
                return false;
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vol++;
            }else if(!(ch>=48&&ch<=57)){
                con++;
            }
        }
        return vol>0&&con>0;
    }
}