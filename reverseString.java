// To reverse a String-------------------
class String2{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++){ // travers loop upto the half length of the string.
            int front = i;  //finding the front index of the string.
            int back = sb.length()-1-i;  //finding the last index of the string.

            char frontChar = sb.charAt(front); // front value with it's index.
            char backChar = sb.charAt(back); // back value with it's index.

            sb.setCharAt(front,backChar); // replacing the backchar at front index.
            sb.setCharAt(back,frontChar); // replacing the frontchar at back index.

        }

        System.out.print(sb);
    }
}