import java.util.Scanner;
public class flames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String strBfr1 = sc.nextLine();
        System.out.println("Enter second name");
        String strBfr2 = sc.nextLine();
        strBfr1 = strBfr1.toLowerCase();
        strBfr2 = strBfr2.toLowerCase();
        StringBuilder str1 = new StringBuilder(strBfr1);
        StringBuilder str2 = new StringBuilder(strBfr2);
        
        for(int i=0; i<str1.length();i++){
            for(int j=0; j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    str1.replace(i,i+1,"*");
                    str2.replace(j,j+1,"*");
                }
            }
        }
        String strTemp1 = "";
        String strTemp2 = "";
        str1.toString();
        str2.toString();
        for(int i=0; i<str1.length();i++){
            if(str1.charAt(i)!='*')
            strTemp1=strTemp1+str1.charAt(i);
        }
        for(int i=0; i<str2.length();i++){
            if(str2.charAt(i)!='*')
            strTemp2=strTemp2+str2.charAt(i);
        }
        int fLength = strTemp1.length()+strTemp2.length();
        StringBuilder flames = new StringBuilder("flames");
        String flamesChk="";
        while(flames.length()!=1){
            int mod = fLength%flames.length();

            if(mod!=0)
            flamesChk = flames.substring(mod)+flames.substring(0,mod-1);

            else
            flamesChk = flames.substring(0,flames.length()-1);
            flames = new StringBuilder(flamesChk);
        }
        switch(flamesChk.charAt(0))
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
