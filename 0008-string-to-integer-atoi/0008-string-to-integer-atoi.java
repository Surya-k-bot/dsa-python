class Solution {
    public int myAtoi(String s) {
        
        int len=s.length();
        int index=0;

        // we igore the leading spaces
        while(index<len && s.charAt(index)==' ') index++;

        // If index is equal to the length of the string
        // It means there is no number in a string
        if(index>=len) return 0;

        // Index reach here it means all leading space igored 
        // Current position may be a +/- sign, or digit or characters
        // check if the current character is neg sign so boolean true
        boolean neg=(s.charAt(index)=='-');

        // If the current character is a sign whether it is positive
        // or negative so increase the index by 1
        if(neg || s.charAt(index)=='+') ++index;

        // I divided max value by 10 because we need to check the result 
        // make not more than max or min value.
        // Max value = 2147483647
        // If we add a max value to any number to it convert into neg value
        // and for positve same as neg number.So we divide 10 to ensure that the result will 
        // become this number and in the next number below 7 so continue otherwise
        // it means the number will become greater the max or leeses than min value
        // IT WORKS FOR BOTH INTEGER.MAX_VALUE && INTEGER.MIN_VALUE
        int max=Integer.MAX_VALUE/10;

        // Result is use to store the variable and return this answer
        int result=0;

        // If the current position is non digit so it not going to the loop
        // otherwise it calculate the result
        while(index<len && '0'<=s.charAt(index) && s.charAt(index)<='9'){

            int digit=s.charAt(index)-'0';

            // If the result more than max and less than min so return min/max;
            // and second condition means the result is equal to max.
            // then the next digit not more than 7.If yes so return max or min.
            if(result>max || (result==max && digit>7)){
                return (neg)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            
            // calculate the result
            result=(result*10)+digit;
            index++;

        }


        // System.out.println(result);

        // return answer
        return (neg)?-result:result;




    }

    
}