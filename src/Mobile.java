import java.util.Scanner;

public class Mobile {

   public void searchOutdatedModel(String company,String... model){

       Scanner s1=new Scanner(System.in);
       System.out.println("Enter model name");
       String a=s1.nextLine();
       boolean b=false;
       for(int i=0;i< model.length;i++){
//           System.out.println(a);
           if(a.equals(model[i])){
//               System.out.println(a);
               b=true;
               System.out.println(model[i]+"_OUTDATED");

           }

       }
       if(!b && model.length!=0){
           System.out.println("Model is not outdated");
       }

    }

    public static void main(String[] args) {
        Mobile m=new Mobile();

        String[] mod={"note4","note5","note6","note7"};
        m.searchOutdatedModel("Samsung",mod);

    }
}
