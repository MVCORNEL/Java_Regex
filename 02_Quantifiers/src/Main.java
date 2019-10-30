public class Main {
    public static void main(String[] args) {

        //QUANTIFIER ALWAYWS COME AFTER THE CHARACTER THAT IT APPLIES TO


        //1 {}
        System.out.println("\n 1 {} CURLY BRACKETS QUANTIFIER \n ");
        String alphaNumericString = "Currently year is 2000000";
        System.out.println(alphaNumericString);

        //1 {} CURLY BREACKETS QUANTIFIER
        //NUMBER WITHIN THE CURLY BRACES INDICATE THE NUMBER OF PRECEDING CHARACTER THAT MUST TO OCCUR IN ORDER FOR THERE TO BE A MATCH
        System.out.println(alphaNumericString.replaceAll("20{3}", "X"));

        /*********************************************************************************************************************************/

        //2 +
        System.out.println("\n 2 + PLUS QUANTIFIER \n ");
        alphaNumericString = "Currently year is 2000000";
        System.out.println(alphaNumericString);

        //2 + PlUS QUANTIFIER
        //+ QUANTIFIER DOESENT NEED A PROVIDED VALUE ,BASICALLY SPECIFYING ONE OR MORE CHARACTERS
        System.out.println(alphaNumericString.replaceAll("20+", "X"));


        //3 *
        System.out.println("\n 3 * ASTRIX QUANTIFIER \n ");
        alphaNumericString = "Currently year is 2 ";
        System.out.println(alphaNumericString);

        //3 * ASTRIX QUANTIFIER
        //+ QUANTIFIER DOESENT NEED A PROVIDED VALUE ,BASICALLY SPECIFYING ZERO OR MORE CHARACTERS OF THE DIGIT WHICH IS PRECEDING
        //THIS WILL WORK EVEN IS THEREIS ONLY 2 INSTEAD OD 2123 or
        System.out.println(alphaNumericString.replaceAll("20*", "X"));

        /*********************************************************************************************************************************/


        //4 {2,5}
        System.out.println("\n 4 {} QUANTIFIER RANGE \n ");
        alphaNumericString = "Currently year is 200000";
        System.out.println(alphaNumericString);

        //4 {2,5} RANGE QUATIFIER
        //STRING FOLLOWED BY SPECIFIEND AMOUNT OF 0's
        System.out.println(alphaNumericString.replaceAll("20{2,5}", "X"));

    }
}
