public class Main {
    public static void main(String[] args){


        //1.replaceAll() with a literal
        System.out.println("\n\n 1 .replaceAll()  \n");
        String alphanumric="Yes you have right,Yes is the correct answer";
        System.out.println(alphanumric);

        //1 .replaceAll()
        //.replaceAll() METHOD OF A STRING CLASS
        String yourString = alphanumric.replaceAll("Yes","XXX");
        System.out.println(yourString);

        /******************************************************************************************************************************************************/

        //2 .matches()
        System.out.println("\n\n 2 .matches() \n");

        //2 .matches()
        //.matches METHOD OF THE STRING CLASS
        //THIS METH0D ACCEPTS A EXPRESSION AS A PARAMETER AND RETURN TRUE IF THE STRING MATCHES AND FALSE OTHERWISE
        //BUT BARE IN MIND ALL STRING DIGITS NEED TO MATCH OTHERWISE WILL RETURN FALSE
        alphanumric="Hello";
        System.out.println( alphanumric.matches("He"));//false
        System.out.println( alphanumric.matches("^He"));//false
        System.out.println( alphanumric.matches("^Hello"));//true

        /******************************************************************************************************************************************************/

        //3 .
        System.out.println("\n\n 3 . DOT \n");
        alphanumric="Yes you have right,Yes is the correct answer";
        System.out.println(alphanumric);

        //3 . DOT
        // . CHARACTER CLASS OF THE DOT(.)
        //CHARACTER CLASS DOT MATCHES  ANY CHARACTER FROM THE STRING
        //IS BASICALLY A WILD CARD FOR ANY CHARACTER
        System.out.println(alphanumric.replaceAll(".","X"));

        /******************************************************************************************************************************************************/

        //4 ^
        System.out.println("\n\n 4 ^ CARROT \n");
        alphanumric="Yes you have right,Yes is the correct answer";
        System.out.println(alphanumric);

        //4 ^ CARROT
        //^ CARROT BOUNDARY MATCHER(^)IS ALWAYS FOLLOWED BY PATTERN, WHICH COULD BE A STRING LITERAL OR SOMETHING MORE COMPLEX
        //CARROT BOUNDARY MATCHER MUST MATCH THE BEGINNING OF THE STRING
        //CARROT BOUNDARY MATCHER IS ONLY LOOKING FOT THE START OF THE STRING
        System.out.println(alphanumric.replaceAll("^Yes","XXX"));

        /******************************************************************************************************************************************************/

        //5 $
        System.out.println("\n\n 5 & DOLLAR SIGN \n");
        alphanumric="Yes you have right,Yes is the correct answer answer";
        System.out.println(alphanumric);

        //5 $ DOLLAR SIGN
        //DOLLAR SIGN BOUNDARY MATCHER($) WHICH IS THE BOUNDARY MATCHER THAT MATCHES THE END OF A STRING
        //DOLLAR SIGN MATCHER IS ONLY LOOKING FOT THE END OF THE STRING
        System.out.println(alphanumric.replaceAll("answer$","XXXXX"));

        /******************************************************************************************************************************************************/

        //6 []
        System.out.println("\n\n 6 [] SQUARE BRACKETS \n");
        alphanumric="Yes you have right,Yes is the correct answer";
        System.out.println(alphanumric);

        //6 [] SQUARE BRACKETS
        //MATCHING SPECIFIC LETTER OR SET OF LETTERS AND REPLACE THEM IF THE PATTERN MATCHES
        System.out.println(alphanumric.replaceAll("[abcde]","X"));

        /******************************************************************************************************************************************************/

        //7[][]
        System.out.println("\n\n 7 [][] DOUBLE SQUARE BARCKETS \n");
        alphanumric="My name is bobo and baba not bibi or bebe";
        System.out.println(alphanumric);

        //7 [][] DOUBLE SQUARE BRACKETS
        // SQUARE BRACKETS FOLLOWED BY SQUARE BRACKETS
        //PERFORM THE REPLACEMENT IF ONE OF THE LETTER WITHIN THE FIRST SQUARE BRACKETS IS FOLLOWED BY ANY OF THE LETTERS WITHIN THE SECOND SQUARE BRACKETS
        System.out.println( alphanumric.replaceAll("[b][oa]","XX"));

        /******************************************************************************************************************************************************/

        //8 []xxx
        System.out.println("\n\n 8 []xxx SQUARE BRACKET FOLLOWED BY LITERAL \n");
        alphanumric="Hello my name is Harry or harry is the same";
        System.out.println(alphanumric);

        //8 []xxx SQUARE BRACKET FOLLOWED BY LITERAL
        System.out.println(alphanumric.replaceAll("[Hh]arry","XXXXX"));

        /******************************************************************************************************************************************************/

        //9[^] CARROT
        System.out.println("\n\n 9 [^] CARROT WITH SQUARE BRACKETS \n ");
        alphanumric="Hello my name is Harry or harry is the same";
        System.out.println(alphanumric);

        //9[^]
        // SQUARE BRACKETS WITHIN CARROT (WHEN IS USED INSIDE THE SQUARE BRACKES ^ IS A CLASS CHRACATER NOT A BOUNDARY MATCHER)
        //REPACE EVERYTHING IN THE STRING OTHER THAN THE OCCURANCE OF THE CHARACTERS AFTER THE CARROT BOUNDARY MATCHER SIGN
        System.out.println(alphanumric.replaceAll("[^r]","X"));

        /******************************************************************************************************************************************************/

        //10 [a-f 1-2]
        System.out.println("\n\n 10[a-d] OR [a-d1-5] OR [A-D] DASH WITHN SQUARE BREAKETS \n");
        alphanumric="The following characters are a string sequence: 123456789";
        System.out.println(alphanumric);

        //10 [a-f A-F 1-2]
        // SQUARE BRACKETS WITH DAHSES(-) WHERE DAHSES SIGN SPECIFIES THE RANGE
        //INSTEAD [abcd] we can use a shoerter way [a-d]
        //System.out.println(alphanumric.replaceAll("[abcd567]","X"));
        System.out.println(alphanumric.replaceAll("[a-e1-4]","X"));

        /******************************************************************************************************************************************************/

        //11 (?i)
        System.out.println("\n\n 11 (?i)[a-d]  \n");
        alphanumric="Hello my name is harry! HELLO MY NAME IS HARRY";

        //11 (?i) SPECIAL CONSTRUCT PARENTHESIS, QUESTION MARK , i
        //THIS WORK WITH ASCII STRINGS
        // REGULAR EXPRESSIONS ARE CASE SENSITIVE THIS MATCHES THE lowercase and uppercase CHARACTERS
        System.out.println(alphanumric.replaceAll("(?i)[a-d]","X"));

        /******************************************************************************************************************************************************/

        //12 \\d
        System.out.println("\n\n 12 \\d \n");
        alphanumric="I am Harry i am 21 and  36 months";
        System.out.println(alphanumric);

        //12 \\d  DOUBLE  BACKSLASH d CHARACTER CLASS
        // MATCHES ANY DIGIT THE FIRST SLASH ESCAPES THE SECOND SLASH
        System.out.println(alphanumric.replaceAll("\\d","X"));

        /******************************************************************************************************************************************************/

        //13 \\D
        System.out.println("\n\n 13 \\D \n");
        alphanumric="I am Harry i am 21 and  36 months";

        //13 \\D //DOUBLE BACKSLASH AND UPPERCASE D
        //MATCHES ANY NON-DIGIT CHARACTERS
        System.out.println(alphanumric.replaceAll("\\D","X"));

        /******************************************************************************************************************************************************/

        //14 \\s
        System.out.println("\n\n 14 \\s \n");
        alphanumric="I have blanks \t a tab, and also a new line \n another row here";
        System.out.println(alphanumric);

        //14 \\s DOUBLE BACKSLASHE AND s CLASS CHARACATER IN LOWER CASSES
        // Completely removed all WHTTE SPACES
        System.out.println(alphanumric.replaceAll("\\s","X"));

        /******************************************************************************************************************************************************/

        //15 \\S
        System.out.println("\n\n 15 \\S \n");
        alphanumric="I have blanks \t a tab, and also a new line \n another row here";
        System.out.println(alphanumric);

        //15 \\S AND CLASS CHARACTER S IN UPPER CASSES
        //CHARACTER CLASS
        // Completely replace everything except WHTTE SPACES
        System.out.println(alphanumric.replaceAll("\\S","X"));

        /******************************************************************************************************************************************************/

        //16 \t,\n
        System.out.println("\n\n 16 \\n,\\t \n");
        alphanumric="I have blanks \t a tab, and also a new line \n another row here";
        System.out.println(alphanumric);

        //16 \t,\n BLACKSLASH TAB AND BACKSLASH NEW LINE
        //CHARACTER CLASS
        //REPLACE tab and new line
        System.out.println(alphanumric.replaceAll("\t","X"));
        System.out.println(alphanumric.replaceAll("\n","X"));

        /******************************************************************************************************************************************************/

        //17 \\w
        System.out.println("\n\n 17 \\w  \n");
        alphanumric="Yes you have right,Yes is the correct answer";
        System.out.println(alphanumric);

        //17 \\w DDOUBLE BACKSLAsh w
        //REPLACE EVERYTHING EXCEPT WHITESPACE CHARACTERS
        System.out.println(alphanumric.replaceAll("\\w","X"));

        /******************************************************************************************************************************************************/

        //18 \\W
        System.out.println("\n\n 18 \\W  \n");
        alphanumric="Yes you have right,Yes is the correct answer\n Hello";
        System.out.println(alphanumric);


        //18 DDOUBLE BACKSLASH W
        //REPLACE all WHITE SPACES EXCEPT WHITESPACE WITH A X CHARACTERS
        System.out.println(alphanumric.replaceAll("\\W","X"));

        /******************************************************************************************************************************************************/


        //19 \\b
        System.out.println("\n\n 19 \\b  \n");
        alphanumric="Yes you have right,Yes is the correct answer";
        System.out.println(alphanumric);

        //19 \\b
        //surroind each word with X
        System.out.println(alphanumric.replaceAll("\\b","X"));



    }
}
