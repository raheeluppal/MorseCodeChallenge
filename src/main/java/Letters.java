import java.util.HashMap;
import java.util.Map;

public class Letters {
    HashMap<String, String> letters = new HashMap<>();

    public Letters(){

            letters.put(".-", "A");
            letters.put("-...", "B");
            letters.put("-.-.", "C");
            letters.put("-..", "D");
            letters.put(".", "E");
            letters.put("..-.", "F");
            letters.put("--.", "G");
            letters.put("....", "H");
            letters.put("..", "I");
            letters.put(".---", "J");
            letters.put("-.-", "K");
            letters.put(".-..", "L");
            letters.put("--", "M");
            letters.put("-.", "N");
            letters.put("---", "O");
            letters.put(".--.", "P");
            letters.put("--.-", "Q");
            letters.put(".-.", "R");
            letters.put("...", "S");
            letters.put("-", "T");
            letters.put("..-", "U");
            letters.put("...-", "V");
            letters.put(".--", "W");
            letters.put("-..-", "X");
            letters.put("-.--", "Y");
            letters.put("--..", "Z");
    }

    public void xoMethod(String decoder){

        HashMap<String,String> tempMap = new HashMap<>();

        for(Map.Entry<String, String> i : letters.entrySet()){
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j <i.getKey().length() ; j++) {
                if(j < i.getKey().length()-1) {
                    if (i.getKey().charAt(j) == '.') {
                        temp.append("XO");
                    } else if (i.getKey().charAt(j) == '-') {
                        temp.append("XXXO");
                    }
                }
                else{
                    if (i.getKey().charAt(j) == '.') {
                        temp.append("X");
                    } else if (i.getKey().charAt(j) == '-') {
                        temp.append("XXX");
                    }
                }
            }
            tempMap.put(temp.toString(),i.getValue());
        }

        letters.putAll(tempMap);


    }

}
