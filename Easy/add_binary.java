class Solution {
    public String addBinary(String a, String b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        
        int aLength = a.length()-1;
        int bLength = b.length()-1;
        StringBuffer s = new StringBuffer();
        int carry = 0;
        while (aLength >= 0 || bLength >= 0 || carry != 0) {
            int sum = carry;
            
            if (aLength >= 0 && a.charAt(aLength) == '1') {
                sum++;
            }
            if (bLength >= 0 && b.charAt(bLength) == '1') {
                sum++;
            }
            int digit = sum % 2;
            carry = sum / 2;
            
            s.append(digit);
            aLength--;
            bLength--;
        }
        return s.reverse().toString();
    }
}
