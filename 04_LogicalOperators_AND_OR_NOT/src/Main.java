import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String alphaNumerc = "Harry abcd";
        //OR
        //[Hh]
        System.out.println(alphaNumerc.replaceAll("[H|h]arry", "Larry"));

        //NOT
        //[^abc]
        //WE ARE SAYING THAT B MUST BE FOLLOWED BY ANY CHARACTER OTHER THATN O
        //BUT IN THIS CASE FOR THE LAST LETTER B, THERE"S NO CHARACTER FOLLOWING THE FINAL T SO OUR CARROT V IN RACKETS DOESN"T
        //ACTUALLY MATCH ANYTHING
        //RIGHT SQUARE BRACKETS AND CARROT CHARACTER COSUMES A CHARACTER< IN OTHER WORDS REQUIRESA CHARACTER TO BE THERE
        String myName = "tstvtkt";
        String noBobo = "t[^v]";
        Pattern pattern = Pattern.compile(noBobo);
        Matcher matcher = pattern.matcher(myName);

        int count = 0;

        while (matcher.find()) {
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());

        }

        //NEGATIVE LOOK AHEAD EXORESSION
        //NOT OPERATOR
        //[!]
        //LOOK AHEAD EXPRESSION, EXCLAMATION MARK DOESEN'T CONSUME CHARACTERS IT CAN ACTUALLY MATCH NOTHING
        //SO WILL MATCH INSTANCES OF THE AT THE END OF THE STRING
        //WHEN WEUSE A LOOK AHEAD THE CHARACTER IN THE LOOK AHEAD AREN'T PART OF THE MATCH
        myName = "tstvtkt";
        noBobo = "t(?!v)";
        pattern = Pattern.compile(noBobo);
        matcher = pattern.matcher(myName);

        count = 0;

        while (matcher.find()) {
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());

        }


        //POSITIVE LOOK aheads expressions
        //t(?=v)
        //ALL MATCH OF T FOLLOWED BY V BUTWE DON"T WANT TO INCLDUE THE V IN THE MATCH

        myName = "tstvtkt";
        myName = "tstvtkt";
        noBobo = "t(?=v)";
        pattern = Pattern.compile(noBobo);
        matcher = pattern.matcher(myName);

        count = 0;



    }
}
