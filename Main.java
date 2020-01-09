
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int maxValueInclusive = 100, minValueInclusive = 10;
        String myStringOfWords = " --help mohaaaaaaaaaaaa".trim(),Argument_word="";

        String[] words = myStringOfWords.split(" ");
        boolean isNumeric = false,isNumeric_2nd=false, first_is_number = false, first_is_word=false,help_needed=false,number_detected=false;
        int nu=0,Increse_due_help=0,the_number=0;
        String the_word="",Argument_number="";

        if(words[0].equals("--help") && !help_needed){
            Increse_due_help=1;
            help_needed=true;
        }
        //Cheaking the seconde input if it is a number
        isNumeric = words[0+Increse_due_help].chars().allMatch(Character::isDigit);
        if (isNumeric) {
            first_is_number = true;
            the_number = Integer.parseInt(words[0+Increse_due_help]);
            number_detected=true;

        }
        //get the string value of the 2nd input
        else if (!first_is_number){
            the_word=words[0+Increse_due_help];
            first_is_word=true;
        }
        if ((help_needed && words.length==3) || (!help_needed && words.length==2)) {
          isNumeric_2nd = words[1+Increse_due_help].chars().allMatch(Character::isDigit);
          if (!first_is_number && isNumeric_2nd) {
          the_number = Integer.parseInt(words[1+Increse_due_help]);
          number_detected=true;

          }
          else if(first_is_number && isNumeric_2nd){

              System.out.println("duplicated number input");
              System.exit(-1);
          }
          else if(!isNumeric_2nd){
              if(first_is_word){

                  System.out.println("duplicated word input");
                  System.exit(-1);
              }
              the_word=words[1+Increse_due_help];
          }}
        System.out.println(the_number);
        if(the_number > minValueInclusive && the_number <= maxValueInclusive) {
            Argument_number=Integer.toString(the_number);

        }
        else if((the_number < minValueInclusive || the_number> maxValueInclusive)&&(number_detected)){
            Argument_number="Does not follow the rules!";
        }
        else{
            Argument_number="Not available !";

        }
        if (the_word.length()>= 3 && the_word.length()<= 10 ){
            Argument_word=the_word;



        }
        else  if (the_word.length()< 3 || the_word.length()> 10 ){
            Argument_word="Does not follow the rules!";
        }
        else{
            Argument_word="Not available !";

        }

        System.out.println("Argument_word =\t"+Argument_word+"\n"+"Argument_number =\t"+Argument_number+"\nhelp neede?\t"+help_needed);
    }
}


//This is a demo task.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].
//        Copyright 2009–2020 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

//        int[] A = {-1, -3};
//        if(A.length==0)
//        {
//            System.out.println("empty Aay");
//            System.exit(0);
//        }
//        int next_number=1,pre_val=0;
//        boolean ran_once=false, conasiting_liast=false;
//        Arrays.sort(A);
//        System.out.println("Arrasy content: "+Arrays.toString(A));
//        for(int i = 0; i <A.length; i++)
//        {
//
//
//            if(A[i]>0)
//            {
//                if(ran_once==true){
//                    if(A[i]!=pre_val && A[i]!=next_number) {
//                        System.out.println(next_number);
//                        System.exit(0);
//                    }
//                    if(i==A.length-1){
//                        conasiting_liast=true;
//
//                    }
//
//                }
//
//                next_number=A[i]+1;
//                pre_val=A[i];
//                ran_once=true;
//                if(conasiting_liast){
//                    System.out.println(next_number);
//                }
//            }
//            if(A[A.length-1]<0){
//                System.out.println("less than zero");
//                System.exit(0);
//            }
//        }
