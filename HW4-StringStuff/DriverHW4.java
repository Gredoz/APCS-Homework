public boolean mixStart(String str) {
  if (str.length() < 3) return false;
  if (str.substring(1, 3).equals("ix")) 
    {return true;
    }
    else
    {return false;
    }
    
  
}

public String makeOutWord(String out, String word) {
  return (out.substring(0, 2) + word + out.substring(2));
}


public String firstHalf(String str) {
  int Full = str.length();
  int Half = (Full/ 2);
  return (str.substring(0, Half));
}
