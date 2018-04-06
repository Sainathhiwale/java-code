    
    import java.util.Scanner;
    

    public class IfElse {

        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2!=0){
              ans = "Weird";
            }
            else{
            
               ans = "Not Weird";
                
            }
            System.out.println(ans);
            
        }
    }
