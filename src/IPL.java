import java.util.Scanner;

public class IPL {

   public void homeTeamStadium(Stadium stadium) {
      Stadium s1=Stadium.CHIDAMBARAM_STADIUM;
      if(stadium.equals(s1)){
         System.out.println("This is the home ground of CSK");
      }
      Stadium s2=Stadium.M_CHINNASWAMY_STADIUM;
      if(stadium.equals(s2)){
         System.out.println("This is the home ground of RCB");
      }
      Stadium s3=Stadium.EDEN_GARDENS_STADIUM;
      if(stadium.equals(s3)){
         System.out.println("This is the home ground of KKR");
      }
      Stadium s4=Stadium.WANKHEDE_STADIUM;
      if(stadium.equals(s4)){
         System.out.println("This is the home ground of MI");
      }

   }

   public static void main(String[] args) {
      Scanner s1=new Scanner(System.in);
      System.out.println("Enter the Stadium");
      String std= s1.next();

      //String to enum conversion
      Stadium name= Stadium.valueOf(std.toUpperCase());

      IPL i=new IPL();
      i.homeTeamStadium(name);
   }
}
