package ASCII;

public class Random extends ASCII.Mother
{
    public Random (String text)
    {
        this.text=text;
    }
    private int Maks = this.all_styles;
    private int Min = 1;
    private int rand = Min + (int)(Math.random() * Maks);

    public String random_style (String text)
    {
        switch (rand)
        {
            case 1:
            {
                ASCII.Style_1 stylazer = new ASCII.Style_1();
                stylazer.text=this.text;
                return stylazer.Print();
            }

            case 2:
            {
                ASCII.Style_2 stylazer = new ASCII.Style_2();
                stylazer.text=this.text;
                return stylazer.Print();
            }

            case 3:
            {
                ASCII.Style_3 stylazer = new ASCII.Style_3();
                stylazer.text=this.text;
                return stylazer.Print();
            }

            case 4:
            {
                ASCII.Style_4 stylazer = new ASCII.Style_4();
                stylazer.text=this.text;
                return stylazer.Print();
            }

            case 5:
            {
                ASCII.Style_5 stylazer = new ASCII.Style_5();
                stylazer.text=this.text;
                return stylazer.Print();
            }
        }
        return this.random_style(text);
    }

    public String Print()
    {
        return random_style(text);
    }

}
