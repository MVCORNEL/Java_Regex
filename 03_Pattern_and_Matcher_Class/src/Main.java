import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        StringBuilder htmlText = new StringBuilder("<h1> My Heading </h1>");
        htmlText.append("<h2>Sub Heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");

        /****************************************************************************************************************************/

        //1 .matches() method

        System.out.println("\\n 1 .matches() \n");
        String h2Pattern=".*<h2>.*";
        //PATTERN CASE INSENSITIVE STRAIGHTFORWARD AND ALSO PATTERN .UNICODE_CASE
        //BARE IN MIND TAHT POSSIBLE BUT WE'll USE THE OTHER APOACH OF CASE INSENSTITIVE,
        //Pattern pattern=Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Pattern pattern=Pattern.compile(h2Pattern);
        Matcher matcher=pattern.matcher(htmlText);
        //OUR PATTERN MATCHES WITH THE MATCHER
        System.out.println(matcher.matches());

        /****************************************************************************************************************************/


       //2 .find() method

        System.out.println("\n 2 .find() \n");
        // matcher.end is the index of first character which come after a match
        //A MATCHER CAN BE USED ONLY ONCE THAT WHY WE NEED TO RESET ITS INTERNAT STATE CALL METHOD matecher.reset
        matcher.reset();
        h2Pattern="<h2>";
        int count= 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurence +" + count + ": "+ matcher.start() + " to " + matcher.end());
        }

        /****************************************************************************************************************************/


        //3  GROUP METHODS
        System.out.println("\n 3 .group() \n");
        //GROUP 0 is the entire character sequence

        String h2GroupPattern= "(<h2>)";
        Pattern groupPattern= Pattern.compile(h2GroupPattern);
        Matcher groupMatcher= groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());

        groupMatcher.reset();
        while (groupMatcher.find()){
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        /****************************************************************************************************************************/


        //4 *
        //  *  GREEDY QUANTIFIER
        System.out.println("\n 4 GREEDY QUANTIFIER \n");
        // EVERYTHING INCLUDING <h2> TAGS AND EVERYTHING INBETWEEN
        //WHEN FIND AN OCCURENCE WILL KEEP LOOK FOR MORE AND WILL TRY TO GRAB THE BIGGEST AMOUNT OF TEXT POSSIBLE

        h2GroupPattern="(<h2>.*</h2>)";
        groupPattern=Pattern.compile(h2GroupPattern);
        groupMatcher=groupPattern.matcher(htmlText);

        while (groupMatcher.find()){
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        //THE RESULT ISN"T WHAT WERE EXPECTING AND THE REASPN THAT IS HAPPENING IS DUE TO A CONCEPT TAT I HAVEN'T DISCUSSED
        //GREEDY QUANTIFIER VS (RELUCTANT OR LAZU QUANTIFIERS
        //* IS CALLED A GREEDY QUANTIFIER IT WILL GRAB AS MUCH TEXT AS IT CAN


        //5 ?
        // ?  LAZY QUANTIFIER
        System.out.println("\n 5 LAZY QUANTIFIER \n");
        // WHEN WILL FIND A MATCH WILL STOP GRABBING TEXT
        //AND THE REASON BEHIND STOP AT THAT POINT IS THE QUESTION MARK QUATIFIER WILL BE SATISFIED


        h2GroupPattern="(<h2>.*?</h2>)";
        groupPattern=Pattern.compile(h2GroupPattern);
        groupMatcher=groupPattern.matcher(htmlText);
        while (groupMatcher.find()){
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }


        // 6 TEXT GROUPS EXACTLY THE ONE WHICH I NEED TO MY APPLICATION
        //IN CASE WE NEED ONLY THE GROUP INBETWEEN THE OPENING AND CLOSING TAGS
        System.out.println("\n 6 EXACTYLT THE ONE WHICH I WAS LOOKING FOR THE TEXTGROUPS WHICH ALLOWS YOU TO SELECT WHAT GOUP YOU WANT TO SELECT FROM THE OCCURENCE \n");
        String h2TextGroups= "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern=Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher= h2TextPattern.matcher(htmlText);


        while(h2TextMatcher.find()){
            System.out.println("Occurrence" +h2TextMatcher.group(2));

        }


    }
}
