class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder("");
        int i=0,n=command.length();
        while(i<n){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)==')' && i<n){
                sb.append("o");
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)!=')' && i<n){
                sb.append("al");
            }
            i++;
        }
        return sb.toString();
    }
}