class Solution {
  
  public boolean canTransform(String start, String end) 
  {    
    if (start.replace("X", "").length() != end.replace("X", "").length()) 
    {
      return false;
    }
    int len = start.length();
    int j = 0;
    for (int i = 0; i < len; i++) 
    {  
      if (start.charAt(i) == 'L') 
      {
        while (j < len && end.charAt(j) != 'L') 
            j++;
        if (j > i) 
            return false;        
        j++;
      }       
      
      if (start.charAt(i) == 'R') 
      {
        while (j < len && end.charAt(j) != 'R') 
             j++;
        if (j < i) 
            return false;
        j++;
      }      
    }  
    return true;
  }
}
