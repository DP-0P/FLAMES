import java.util.Scanner;
public class flames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String s5 = sc.nextLine();
        System.out.println("Enter second name");
        String s6 = sc.nextLine();
        s5 = s5.toLowerCase();
        s6 = s6.toLowerCase();
        StringBuilder s1 = new StringBuilder(s5);
        StringBuilder s2 = new StringBuilder(s6);
        for(int i=0; i<s1.length();i++){
            for(int j=0; j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    s1.replace(i,i+1,"*");
                    s2.replace(j,j+1,"*");
                }
            }
        }
        String s3 = "";
        String s4 = "";
        s1.toString();
        s2.toString();
        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i)!='*')
            s3=s3+s1.charAt(i);
        }
        for(int i=0; i<s2.length();i++){
            if(s2.charAt(i)!='*')
            s4=s4+s2.charAt(i);
        }
        int fLength = s3.length()+s4.length();
        StringBuilder flames = new StringBuilder("flames");
        String gg="";
        while(flames.length()!=1){
            int mod = fLength%flames.length();

            if(mod!=0)
            gg = flames.substring(mod)+flames.substring(0,mod-1);

            else
            gg = flames.substring(0,flames.length()-1);
            flames = new StringBuilder(gg);
        }
        switch(gg.charAt(0))
        {
            case 'f':
                System.out.println("Friends");
                break;
            case 'l':
                System.out.println("Love");
                break;
            case 'a':
                System.out.println("Affection");
                break;
            case 'm':
                System.out.println("Marriage");
                break;
            case 'e':
                System.out.println("Enemy");
                break;
            case 's':
                System.out.println("Sibling");
                break;        
        }
    }
}
