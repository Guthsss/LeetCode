public class NumeroDoPalindromo {
    public boolean isPalindrome(int x) {

        // Converte o número para uma string
        String string = Integer.toString(x);

        int start= 0;
        int end = string.length() - 1;

        while (start < end) {
            if (string.charAt(start) != string.charAt(end))
                return false; 
        }
        start ++;
        end ++;

        return true;
    }    
};
