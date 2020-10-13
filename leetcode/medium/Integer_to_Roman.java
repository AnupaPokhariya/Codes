class Solution {
    public String intToRoman(int num) {
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        StringBuilder s=new StringBuilder();
        while(num>0){
            if(num-value[i]<0){
                i++;
                continue;
            }
            else{
                s.append(str[i]);
                num=num-value[i];
            }
        }
        return s.toString();
    }
}
