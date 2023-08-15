import java.util.Scanner;

import javax.swing.TransferHandler;

public class App {
     private static final Scanner scanner =new Scanner(System.in);
    
    public static void main(String[] args) {

        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = " Welcome to Smart Banking ";
        final String NEW_ACCOUNT = "Open new account";
        final String DEPOSITE="Deposite Money";
        final String WITHDRAWAL = "Withdrawal Money";
        final String TRANSFER = "Tranfer Money";
        final String BALANCE= "Check Account Balance";
        final String DROP= "Drop Exsisting Account";


        String[] newAccount = new String[0];
        
        String screen = DASHBOARD;



        do{
            final String APP_TITLE = String.format("%s%s%s",
            COLOR_BLUE_BOLD, screen, RESET);

                System.out.println(CLEAR);
                //System.out.println("-".repeat(30));
                System.out.println(" ".repeat((30 - APP_TITLE.length() + 7)/2).concat(APP_TITLE));
                //System.out.println("-".repeat(30));

                switch(screen){
                    case DASHBOARD: 
                        System.out.println("\n[1]. Open New Account");
                        System.out.println("[2].Deposite Money");
                        System.out.println("[3]. Withdrawel Money");
                        System.out.println("[4]. Transfer Money");
                        System.out.println("[5]. Check Account Balance");
                        System.out.println("[6]. Drop Exsisting Account");
                        System.out.println("[7]. Exit\n");
                        System.out.print("Enter an option to continue > ");
                        int option = scanner.nextInt();
                        scanner.nextLine();

                        switch (option){
                            case 1: screen = NEW_ACCOUNT; break;
                            case 2: screen = DEPOSITE; break;
                            case 3: screen = WITHDRAWAL; break;
                            case 4: screen = WITHDRAWAL; break;
                            case 5: screen = TRANSFER ; break;
                            case 6: screen = BALANCE; break;
                            case 7: screen = DROP; break;
                            case 8: System.exit(0); break;
                            default: continue;
                          }
                        break;
                        case NEW_ACCOUNT:
                        System.out.printf("New A: AC-%03d \n", (newAccount.length + 1));
    
                        boolean valid;
                        String name;
                        do{
                            valid = true;
                            System.out.print("Enter a Name: ");
                            name = scanner.nextLine().strip();
                            if (name.isBlank()){
                                System.out.printf("%sName can't be empty%s\n", COLOR_RED_BOLD, RESET);
                                valid = false;
                                continue;
                            }
                            for (int i = 0; i < name.length(); i++) {
                                if (!(Character.isLetter(name.charAt(i)) || 
                                    Character.isSpaceChar(name.charAt(i))) ) {
                                    System.out.printf("%sInvalid Name%s\n", COLOR_RED_BOLD, RESET);
                                    valid = false;
                                    break;
                                }
                            }
                        }while(!valid);
                        
                        boolean validok;
                        int initialDeposit;
                        do{
                            validok = true;
                            System.out.print("Initial Deposite: ");
                            initialDeposit = scanner.nextInt();
                            scanner.nextLine();
                            if (initialDeposit<5000){
                                System.out.printf("%sminimam value mor than 5000%s\n", COLOR_RED_BOLD, RESET);
                                validok = false;
                                continue;
                            }else System.out.println("Name has been creat Sucsess");
                            
                        }while(!validok);
                    }                  
             }while(true);
            
    
              
     }                  
                           
    
}