     import java.util.Random;
     import java.util.*;
 class game{
       public int number;
       public  int inputNumber;
       private int  guess;
       game(){
           Random rand= new Random();
           this.number=rand.nextInt(100);          
       }
        
        void takingInput(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            this.inputNumber=sc.nextInt();
    
 
        }
        void setNoofGuess(int guess){
             this.guess=guess;
             
                 
        }
            
             
        int getNoofGuess(){
            if(guess<=5){
                if(guess==1){
                System.out.println("Best Player You won");
                }
                else
                {
                System.out.println("IN Top 5 well done,keep it up!");
                }   
            }
            else if((guess>5) && (guess<=10)){
                 System.out.println(" Well played nice work!");

                }
            else{
                System.out.println("You loose took too many guesses ");
               }
            return guess;
        }
                       
        boolean isCorrectNumber(){
            if(inputNumber==number)
            {
                return true;
            }
            else if(inputNumber<number){
                 System.out.println("Two low");
                 return false;   
            }
            else if(inputNumber>number){
                 System.out.println("Two high");
                 return false;   
                
            }
            
             return false;
        }
        
 }




    public class playgame{
          public static void main(String[] args){
           game g =new game();
           boolean b;
           int cnt=0;
           do{
           cnt++;
           g.takingInput();
           b=g.isCorrectNumber();
           }while(b==false);
           System.out.println(b);
           g.setNoofGuess(cnt);
           int guess =g.getNoofGuess();
           System.out.println("you took"+guess+"Guesses");

           


          }

    }
