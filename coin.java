import java.util.*;
public class coin{
    public static void main (String [] anko){
        Scanner sc = new Scanner (System.in);
        System.out.println("Who are you?");
        System.out.print(">");
        String a= sc.next();
        System.out.println("Hello,"+a+"!");
        System.out.println("Tossing a coin...");
        int k = 0;
        StringBuilder bui = new StringBuilder();
        Random ran = new Random();
        for(int i=0;i<3;i++){
            System.out.print("Round" + i + ":");
        boolean j= ran.nextBoolean();
        if(j){
            System.out.println("Heads");
            k++;
        }
        else{
            System.out.println("Tails");
        }
        }
        bui.append("Heads: ");
        bui.append((k));
        bui.append(", Tails: ");
        bui.append((3-k));
        System.out.println(bui.toString());
        if(k>=3-k){
            System.out.println("you won");
        }else{
            System.out.println("you lose");
        }
    }
}
