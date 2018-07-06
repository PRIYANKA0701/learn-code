boolean checkPalindrome(String inputString) {

    int length = inputString.length();
      String reverse="";
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + inputString.charAt(i);
 
      if (inputString.equals(reverse))
      {
            return true;
      }
      else
      {
            return false;     
      }
    
    
}
