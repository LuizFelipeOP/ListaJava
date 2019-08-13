import java.util.Arrays; 

class Main {
  public static void main(String[] args) {
    
     String s = "pnc"; 
        char[] gfg = s.toCharArray(); 
        char[] invert = new char[gfg.length];

        for (int i = 0; i < gfg.length; ++i) { 
             invert[i] = gfg[(gfg.length-1)-i];  
        }

        System.out.println(Arrays.equals(gfg, invert));
  }
}