import java.util.HashMap;

public class Decoder {

    public static String decode (String encoded) {
        StringBuilder temp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        Letters letters = new Letters();
        letters.xoMethod(encoded);



        for (int i = 0; i <encoded.length() ; i++) {
            if (encoded.charAt(i) != 'X'){
                if (i > encoded.length()-1 && encoded.charAt(i + 1) != 'X'){

                  result.append(letters.letters.get(temp.toString()));
                  temp = new StringBuilder();
                  continue;
                }
            }

            temp.append(encoded.charAt(i));
        }




        return result.toString();
    }


}
