import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args){

        //t(?=v)
        //LOOK AHEAD
        //LOOK AHEAD EXPRESSION, EQUALS SIGN DOESEN'T CONSUME CHARACTERS IT CAN ACTUALLY MATCH NOTHING
        System.out.println("LOOK AHEAD\n");
        String tv="tstvtkt";
        String regex="t(?=v)";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(tv);

        int count=0;
        while(matcher.find()){
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        // *********************************************************************************************//

        //NEGATIVE LOOK AHEAD
        //LOOK AHEAD EXPRESSION, EXCLAMATION MARK DOESEN'T CONSUME CHARACTERS IT CAN ACTUALLY MATCH NOTHING
        //t(?!v)
        //LOOK AHEAD
        System.out.println( " *********************************************************************************************");
        System.out.println("\nNEGATIVE LOOK AHEAD \n");
        tv="tstvtkt";
        regex="t(?!v)";

         pattern=Pattern.compile(regex);
         matcher=pattern.matcher(tv);

         count=0;
        while(matcher.find()){
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }


        // *********************************************************************************************//


        //LOOKBEHIND
        //(?<=t)s
        System.out.println( " *********************************************************************************************");
        System.out.println("\nLOOK BEHIND \n");
        tv="tstvtkt";
        regex="(?<=v)t";

        pattern=Pattern.compile(regex);
        matcher=pattern.matcher(tv);

        count=0;
        while(matcher.find()){
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }


        //NEGATIVE LOOKBEHIND
        //(?<!t)s
        System.out.println( " *********************************************************************************************");
        System.out.println("\n NEGATIVE LOOK BEHIND \n");
        tv="tstvtkt";
        regex="(?<!v)t";

        pattern=Pattern.compile(regex);
        matcher=pattern.matcher(tv);

        count=0;
        while(matcher.find()){
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }


    }

}
