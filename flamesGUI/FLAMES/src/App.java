import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    //"mArgs": "--module-path C:/javafx-sdk-11.0.2lib --add-modules javafx.controls,javafx.fxml", 

    @Override
            public void start(Stage primaryStage) throws Exception {  
                Label firstName=new Label("Enter first name");  
                Label secondName = new Label("Enter second name"); 
                Text text = new Text();
                TextField tf1=new TextField();  
                Button btn = new Button("Find Result");
                
                TextField tf2=new TextField();
                GridPane root = new GridPane();
                root.addRow(0, firstName, tf1);  
                root.addRow(1, secondName, tf2); 
                root.addRow(3, text);
                Scene scene=new Scene(root,300,100); 
                primaryStage.setScene(scene);
                primaryStage.setTitle("FLAMES");  
                primaryStage.show();  
                btn.setOnAction(e -> text.setText(FLAMES(getText(tf1.getText()),getText(tf2.getText()))));
                root.addRow(2, btn);
            }
            public static String getText(String text){
                return text;
            }
            // FLAMES code starts from here...
            public static String FLAMES(String  str1, String  str2){
                 str1 =  str1.toLowerCase();
                 str2 =  str2.toLowerCase();
                StringBuilder  strbfr1 = new StringBuilder( str1);
                StringBuilder  strbfr2 = new StringBuilder( str2);
                for(int i=0; i< strbfr1.length();i++){
                    for(int j=0; j< strbfr2.length();j++){
                        if( strbfr1.charAt(i) ==  strbfr2.charAt(j)){
                             strbfr1.replace(i,i+1,"*");
                             strbfr2.replace(j,j+1,"*");
                        }
                    }
                }
                String  strbfr3 = "";
                String  strbfr4 = "";
                 strbfr1.toString();
                 strbfr2.toString();
                for(int i=0; i< strbfr1.length();i++){
                    if( strbfr1.charAt(i)!='*')
                     strbfr3= strbfr3+ strbfr1.charAt(i);
                }
                for(int i=0; i< strbfr2.length();i++){
                    if( strbfr2.charAt(i)!='*')
                     strbfr4= strbfr4+ strbfr2.charAt(i);
                }
                int fLength =  strbfr3.length()+ strbfr4.length();
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
                    return "Friends";
                         
                    case 'l':
                    return "Love";
                         
                    case 'a':
                    return "Affection";
                         
                    case 'm':
                    return "Marriage";
                         
                    case 'e':
                    return "Enemy";
                         
                    case 's':
                    return "Sibling";             
                }
                return null;
            }        
}