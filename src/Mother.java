
package ASCII;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Mother
{
    protected int all_styles = 5;

    public String text;

    public String Print()
    {
        return "";
    }
    protected void Save()
    {
        String home_directory = System.getProperty("user.home");
        try (PrintWriter out = new PrintWriter(home_directory+"\\Desktop\\ASCII_ART_Saves\\ASCII_ART_text.txt")) {
            out.println(this.text);
        } catch (FileNotFoundException e)
        {
            (new File(home_directory+"\\Desktop\\ASCII_ART_Saves")).mkdirs();
            try (PrintWriter out = new PrintWriter(home_directory+"\\Desktop\\ASCII_ART_Saves\\ASCII_ART_text.txt")) {
                out.println(this.text);
            }catch (FileNotFoundException e2){
                System.out.print("Nie mozna utworzyc folderu");
            }

        }
    }

    protected String number_to_word(String numb)
    {
        Map<String,String> dict = new HashMap<String, String>();
        dict.put("0","zero");
        dict.put("1","one");
        dict.put("2","two");
        dict.put("3","three");
        dict.put("4","four");
        dict.put("5","five");
        dict.put("6","six");
        dict.put("7","seven");
        dict.put("8","eight");
        dict.put("9","nine");

        return dict.get(numb);
    }

    protected String[] letter_to_array(String letter)
    {
        int endls_counter = 0;
        int n=0;
        int tmp_length = letter.length()-1;
        int text_length = letter.length()-1;

        while(n<=tmp_length)
        {
            if ((""+letter.charAt(n)).equals("\n"))
            {
                endls_counter++;
            }
            n++;
        }
        String[] text_tab= new String[endls_counter+1];
        n=0;
        int n_2=0;
        while(n<=endls_counter)
        {
            text_tab[n] = "";
            n++;
        }
        n=0;

        while(n_2<text_length)
        {
            text_tab[n]=text_tab[n] + letter.charAt(n_2);
            n_2++;
            if ((""+letter.charAt(n_2)).equals("\n"))
            {
                n++;
                n_2++;
            }
        }

        return text_tab;
    }

}
