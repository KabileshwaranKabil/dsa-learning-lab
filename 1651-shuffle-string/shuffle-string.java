class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++){
            sb.append(s.charAt(search(indices,i)));
        }
        return sb.toString();
    }
    static int search(int[] indices,int target){
        for(int i=0;i<indices.length;i++){
            if(indices[i]==target){
                return i;
            }
        }
        return -1;
    }
}