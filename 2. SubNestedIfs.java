package subnestedifs;
import java.util.Scanner;
public class SubNestedIfs {

  
    public static void main(String[] args) {
        String College,Academic,Major;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your College? CAS, CBA, CEA, CITCS, CTE, COA");
        College = sc.nextLine();
        
        if (College.equals ("CAS")){
        System.out.println("What is your Academic Program? English, Poitical Science, "
                + "Communication, Psychology");
        Academic = sc.nextLine();
            if (Academic.equals ("English")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Political Science")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Communication")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Psychology")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else 
                System.out.println("The input is INVALID");
        }
        if (College.equals ("CBA")){
        System.out.println("What is your Academic Program? Business Administration, "
                + "Entrepreneurship, Office Administration");
        Academic = sc.nextLine();
            if (Academic.equals ("Business Administration")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Entrepreneurship")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Office Administration")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else 
                System.out.println("The input is INVALID");
            }
         if (College.equals ("CEA")){
        System.out.println("What is your Academic Program? Architecture, Civil Engineering, "
                + "Computer Engineering, Electronics Engineering, Enrionmental & Sanitary Engineering");
        Academic = sc.nextLine();
            if (Academic.equals ("Architecture")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Civil Engineering")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Computer Engineering")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Electronics Engineering")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
         }
            else if (Academic.equals ("Enrionmental & Sanitary Engineering")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
         }
            else 
                System.out.println("The input is INVALID");
         }
         if (College.equals ("CTE")){
        System.out.println("What is your Academic Program? Elementary Education - General, "
                + "Elementary Education, Secondary Education");
        Academic = sc.nextLine();
            if (Academic.equals ("Elementary Education - General")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Elementary Education")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Secondary Education")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else
                System.out.println("The input is INVALID");
         }
         if (College.equals ("COA")){
        System.out.println("What is your Academic Program? Accountancy, Accounting Technology,"
                + " Management Accounting, Forensic Accounting");
        Academic = sc.nextLine();
            if (Academic.equals ("Accountancy")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Accounting Technology")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Management Accounting")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else if (Academic.equals ("Forensic Accounting")){
                System.out.println("Your College is " + College + " and your academic program is" 
                        + " Bachelor of Arts in " + Academic);
            }
            else
                System.out.println("The input is INVALID");
         }
          if (College.equals ("CITCS")){
        System.out.println("What is your Major? Computer Science, "
                + "Information System, Information Technology, Associate in Computer Technology");
        Major = sc.nextLine();
            if (Major.equals ("Computer Science")){
                System.out.println("What is your Academic Program? Mobile Tech. Track or Digital Arts and Animation Track");
                Academic = sc.nextLine();
               
                if (Academic.equals ("Mobile Tech. Track")){
                    System.out.println("Your College is " + College + " and your Major is" 
                        + " Bachelor of Arts in " + Major + " and your academic program is " + Academic);
                }
                else if (Academic.equals ("Digital Arts and Animation Track")){
                    System.out.println("Your College is " + College + " and your Major is" 
                        + " Bachelor of Arts in " + Major + " and your academic program is " + Academic);
                }
                else 
                    System.out.println("Invalid Input");
                
            }
            else if (Major.equals ("Information System")){
                System.out.println("What is your Academic Program? e-Learning Technology Track and Business Process Management Track");
                Academic = sc.nextLine();
                if (Academic.equals ("e-Learning Technology Track")){
                    System.out.println("Your College is " + College + " and your Major is" 
                        + " Bachelor of Arts in " + Major + " and your academic program is " + Academic);
                }
                else if (Academic.equals ("Business Process Management Track")){
                    System.out.println("Your College is " + College + " and your Major is" 
                        + " Bachelor of Arts in " + Major + " and your academic program is " + Academic);
                }
                else 
                    System.out.println("Invalid Input");
            }   
            else if (Major.equals ("Information Technology")){
                System.out.println("What is your Academic Program? Enterprise Resource Planning Track, "
                        + "Network and Security Track, Web Technology Track");
                Academic = sc.nextLine();
                if (Academic.equals ("Enterprise Resource Planning Track")){
                    System.out.println("Your College is " + College + " and your Major is" 
                        + " Bachelor of Arts in " + Major + " and your academic program is " + Academic);
                }
                else if (Academic.equals ("Network and Security Track")){
                    System.out.println("Your College is " + College + " and your Major is" 
                        + " Bachelor of Arts in " + Major + " and your academic program is " + Academic);
                }
                else if (Academic.equals ("Web Technology Track")){
                    System.out.println("Your College is " + College + " and your Major is" 
                        + " Bachelor of Arts in " + Major + " and your academic program is " + Academic);
                }
                else
                    System.out.println("Input Invalid");
                
            }
            else if (Major.equals ("Associate in Computer Technology")){
                System.out.println("What is your Academic Program? Call Center Services Track and "
                        + "Computer Maintenance and Network Management Track");
                Academic = sc.nextLine();
                if (Academic.equals ("Call Center Services Track")){
                    System.out.println("Your College is " + College + " and your Major is" 
                        + " Bachelor of Arts in " + Major + " and your academic program is " + Academic);
                }
                else if (Academic.equals ("Computer Maintenance and Network Management Track")){
                    System.out.println("Your College is " + College + " and your Major is" 
                        + " Bachelor of Arts in " + Major + " and your academic program is " + Academic);
                }
                else 
                    System.out.println("Invalid Input");
            }
               
            }
            else
                System.out.println("The input is INVALID"); 
          }
}

