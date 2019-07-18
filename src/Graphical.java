package ASCII;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

public class Graphical extends JFrame{

    public static String text_to_draw;
    public static String final_text;

    public Graphical() {

        initUI();
    }
    private void initUI() {



        JButton  Style_1_button = new JButton("Style 1");

        JButton Style_2_button = new JButton("Style 2");

        JButton Style_3_button = new JButton("Style 3");

        JButton Style_4_button = new JButton("Style 4");

        JButton Style_5_button = new JButton("Style 5");

        JButton Random_button = new JButton("random");

        JLabel label = new JLabel("Wpisz tekst do narysowania i wciśnij enter  (Styl 1 i 4 nie obsluguje cyfr)");

        JTextField TextField = new JTextField();


        TextField.addActionListener((ActionEvent event) -> {


            TextField.selectAll();

            text_to_draw=TextField.getText();

            Style_1_button.addActionListener((ActionEvent event2) -> {

                ASCII.Style_1 text_to_translate = new ASCII.Style_1();
                text_to_translate.text=text_to_draw;
                final_text=text_to_translate.Print();

                this.initFinal();

            });

            Style_2_button.addActionListener((ActionEvent event2) -> {

                ASCII.Style_2 text_to_translate = new ASCII.Style_2();
                text_to_translate.text=text_to_draw;
                final_text=text_to_translate.Print();

                this.initFinal();
            });

            Style_3_button.addActionListener((ActionEvent event2) -> {

                ASCII.Style_3 text_to_translate = new ASCII.Style_3();
                text_to_translate.text=text_to_draw;
                final_text=text_to_translate.Print();

                this.initFinal();
            });

            Style_4_button.addActionListener((ActionEvent event2) -> {

                ASCII.Style_4 text_to_translate = new ASCII.Style_4();
                text_to_translate.text=text_to_draw;
                final_text=text_to_translate.Print();

                this.initFinal();
            });

            Style_5_button.addActionListener((ActionEvent event2) -> {

                ASCII.Style_5 text_to_translate = new ASCII.Style_5();
                text_to_translate.text=text_to_draw;
                final_text=text_to_translate.Print();

                this.initFinal();
            });

            Random_button.addActionListener((ActionEvent event2) -> {

                ASCII.Random text_to_translate = new ASCII.Random(text_to_draw);
                final_text=text_to_translate.Print();

                this.initFinal();
            });

        });



        Style_1_button.setBounds(10,250,80,50);
        Style_2_button.setBounds(130,250,80,50);
        Style_3_button.setBounds(250,250,80,50);
        Style_4_button.setBounds(370,250,80,50);
        Style_5_button.setBounds(490,250,80,50);
        Random_button.setBounds (610,250,80,50);
        label.setBounds(25, 25, 1500, 50);
        TextField.setBounds(25,85,1500,100);


        createLayout(Style_1_button);
        createLayout(Style_2_button);
        createLayout(Style_3_button);
        createLayout(Style_4_button);
        createLayout(Style_5_button);
        createLayout(Random_button);
        createLayout(TextField);
        createLayout(label);


        setTitle("ASCII ART");
        setSize(1565, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );
    }

    private void initFinal() {
        getContentPane().removeAll();

        if (final_text.substring(0, final_text.length() - 1).equals("Niepoprawny znak :    "))
        {
            JLabel label = new JLabel(final_text);
            label.setBounds(25, 25, 1500, 50);
            createLayout(label);

            JButton Again = new JButton("Try Again");

            JButton Exit = new JButton("Exit");

            Again.setBounds(10, 180, 180, 50);
            Exit.setBounds(230, 180, 80, 50);

            createLayout(Again);
            createLayout(Exit);

            Again.addActionListener((ActionEvent event2) -> {

                getContentPane().removeAll();
                EventQueue.invokeLater(() -> {
                    this.initUI();
                });

            });

            Exit.addActionListener((ActionEvent event2) -> {
                System.exit(0);
            });

            setTitle("ASCII ART");
            setSize(350, 300);
            setLocationRelativeTo(null);
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
        else {
            JLabel label = new JLabel("Zapisać?");
            System.out.print(final_text);
            label.setBounds(25, 25, 1500, 50);
            createLayout(label);


            JButton Save = new JButton("Save");

            JButton Exit = new JButton("Exit");

            Save.setBounds(10, 180, 80, 50);
            Exit.setBounds(230, 180, 80, 50);

            createLayout(Save);
            createLayout(Exit);

            Save.addActionListener((ActionEvent event2) -> {

                ASCII.Mother text_to_save = new ASCII.Mother();
                text_to_save.text = final_text;
                text_to_save.Save();
                label.setText("Zapisano do pliku ASCII_ART_text!");
                label.repaint();

            });

            Exit.addActionListener((ActionEvent event2) -> {
                System.exit(0);
            });

            setTitle("ASCII ART");
            setSize(350, 300);
            setLocationRelativeTo(null);
            setLayout(null);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    }


}
