package ASCII;


import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);

        System.out.print("Otworzyc menu okienkowe? (y / n) ");
        String choose = scanInput.nextLine();

        if (choose.equals("y")) {
            EventQueue.invokeLater(() -> {
                ASCII.Graphical Graph = new ASCII.Graphical();
                Graph.setVisible(true);
            });
        }

        else {

            System.out.print("Wpisz tekst do narysowania: ");

            String text_from_user = scanInput.nextLine();

            System.out.print("Podaj styl: 1 (tylko litery), 2, 3, 4 (tylko litery), 5 lub random: ");

            String style = scanInput.nextLine();


            switch (style) {
                case ("1"): {
                    ASCII.Style_1 text_to_translate = new ASCII.Style_1();
                    text_to_translate.text = text_from_user;
                    text_to_translate.text = text_to_translate.Print();
                    System.out.print(text_to_translate.text);

                    System.out.print("\n\nZapisac? (y / n) ");
                    String answer = scanInput.nextLine();
                    scanInput.close();
                    if (answer.equals("y")) {
                        text_to_translate.Save();
                        System.out.print("\nZapisano do pliku ASCII_ART_text!");
                    }

                    break;
                }
                case ("2"): {
                    ASCII.Style_2 text_to_translate = new ASCII.Style_2();
                    text_to_translate.text = text_from_user;
                    text_to_translate.text = text_to_translate.Print();
                    System.out.print(text_to_translate.text);

                    System.out.print("\n\nZapisac? (y / n) ");
                    String answer = scanInput.nextLine();
                    scanInput.close();
                    if (answer.equals("y")) {
                        text_to_translate.Save();
                        System.out.print("Zapisano do pliku ASCII_ART_text!");
                    }

                    break;

                }
                case ("3"): {
                    ASCII.Style_3 text_to_translate = new ASCII.Style_3();
                    text_to_translate.text = text_from_user;
                    text_to_translate.text = text_to_translate.Print();
                    System.out.print(text_to_translate.text);

                    System.out.print("\n\nZapisac? (y / n) ");
                    String answer = scanInput.nextLine();
                    scanInput.close();
                    if (answer.equals("y")) {
                        text_to_translate.Save();
                        System.out.print("Zapisano do pliku ASCII_ART_text!");
                    }

                    break;

                }
                case ("4"): {
                    ASCII.Style_4 text_to_translate = new ASCII.Style_4();
                    text_to_translate.text = text_from_user;
                    text_to_translate.text = text_to_translate.Print();
                    System.out.print(text_to_translate.text);

                    System.out.print("\n\nZapisac? (y / n) ");
                    String answer = scanInput.nextLine();
                    scanInput.close();
                    if (answer.equals("y")) {
                        text_to_translate.Save();
                        System.out.print("Zapisano do pliku ASCII_ART_text!");
                    }

                    break;

                }
                case ("5"): {
                    ASCII.Style_5 text_to_translate = new ASCII.Style_5();
                    text_to_translate.text = text_from_user;
                    text_to_translate.text = text_to_translate.Print();
                    System.out.print(text_to_translate.text);

                    System.out.print("\n\nZapisac? (y / n) ");
                    String answer = scanInput.nextLine();
                    scanInput.close();
                    if (answer.equals("y")) {
                        text_to_translate.Save();
                        System.out.print("Zapisano do pliku ASCII_ART_text!");
                    }

                    break;

                }
                case ("random"): {
                    ASCII.Random text_to_translate = new ASCII.Random(text_from_user);
                    text_to_translate.text = text_to_translate.Print();
                    System.out.print(text_to_translate.text);

                    System.out.print("\n\nZapisac? (y / n) ");
                    String answer = scanInput.nextLine();
                    scanInput.close();
                    if (answer.equals("y")) {
                        text_to_translate.Save();
                        System.out.print("Zapisano do pliku ASCII_ART_text!");
                    }

                    break;

                }

                default: {
                    System.out.print("Nie ma takiego stylu.");
                }

            }

        }

    }


    }
