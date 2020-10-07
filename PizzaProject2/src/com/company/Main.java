package com.company;

import java.util.Scanner;

public class Main {
    /**
     * @Author Nicolaj Hansen
     * @Since 30/09-2020
     * Tested by: Fei and Niels
     *
     * Programmet er fuldt funktionsdygtigt, og det burde efter alle test ikke være muligt at skabe en run-time-error.
     * Der er dog enkelte steder nede ved kvitteringen, hvor boksen omkring ikke er helt lukket, da de forskellige længder vil ødelægge boksen.
     *
     * @param args
     */

    public static void main(String[] args) {


        //Declaration
        int menuCart = 0; // Is used to open the menuCart.
        int pizzaOrder = 0; // Is used to remember the pizza the ordered.
        String finalPizza = ""; // Is used to save the name of the pizza.
        int counter = 0; // Is used to count how many toppings they choose.
        int toppings = 0; // Is which toppings they choose.
        int sentinel = 0; //This will stop the order.
        int size = 0; // Is the price for the size they choose.
        int toppingChosen = 0; // Is the price for the topping.
        String toppingBought = ""; // Is used for the toppings.
        double pizzaPrice = 0; // Is the pizza price.
        String totalToppings = ""; // Is used to save all the toppings names, not only one.
        String toppingName = ""; // Is used to save the topping names.
        boolean done = false; //Is used to break the loop in every loop.


        //This part is choosing to open the menu cart or not. You can press 0 to exit or 1 to start, all others input will terminate the program.
        System.out.println("*--------------------------------------------*");
        System.out.println("|                 Milano Pizza               |");
        System.out.println("|     Would you like to see the menu cart?   |");
        System.out.println("*--------------------------------------------*");
        System.out.println("|              For yes press \"1\".            |");
        System.out.println("|              For no press  \"0\".            |");
        System.out.println("*--------------------------------------------*");

        Scanner in = new Scanner(System.in);
        while (!done) {

            if (in.hasNextInt()) {
                menuCart = in.nextInt();
            } else {
                System.out.println("The input you used is not valid.\nPlease try again!");
                in.next();
                continue;
            }
            if (menuCart < 2 && menuCart >= 0) {

                if (menuCart == sentinel) {
                    System.out.print("You did exit the menu cart \n   See you next time.");
                    done = true;
                }

                //If you enter 1, the menu cart will open, and you can start your order.
                else if (menuCart == 1) {
                    System.out.println("*-----------------------------------------------------------------------------------*");
                    System.out.println("|                                     Menu cart                                     |");
                    System.out.println("| ----------------------------------------------------------------------------------|");
                    System.out.println("|1. Margherita: Tomato, cheese                                       Price DKK 60.00|");
                    System.out.println("|2. Hawaii: Tomato, cheese, ham, pineapple                           Price DKK 75.00|");
                    System.out.println("|3. Italiano: Tomato, pepperoni                                      Price DKK 70.00|");
                    System.out.println("|4. Milano: Tomato, cheese, ham, broccoli                            Price DKK 75.00|");
                    System.out.println("|5. Valentino: Tomato, cheese, ham, pepperoni, beef                  Price DKK 70.00|");
                    System.out.println("|6. Mama Rosa: Tomato, cheese, ham, beef                             Price DKK 70.00|");
                    System.out.println("|7. Solo Mio: Tomato, cheese, beef, onion, chili, garlic             Price DKK 70.00|");
                    System.out.println("|8. Roma: Tomato, cheese, pepperoni, chicken, kebab, bacon           Price DKK 85.00|");
                    System.out.println("|9. Polio: Tomato, cheese, ham, beef, onion, bearnaise               Price DKK 80.00|");
                    System.out.println("|10. Salad: Tomato, cheese, kebab, salad, dressing                   Price DKK 75.00|");
                    System.out.println("*-----------------------------------------------------------------------------------*");
                    System.out.println("\nWrite the number of the pizza you want to order.");

                    done = true;
                }

            } else {
                System.out.println("The input you used is not valid.\nPlease try again!");
            }

        }
        while (done) {
            if (in.hasNextInt()) {
                pizzaOrder = in.nextInt();
            } else {
                System.out.println("The input you used is not valid.\nPlease try again!");
                in.next();
                continue;
            }


            //Here it will print out which pizza is ordered.
            switch (pizzaOrder) {
                case 1:
                    System.out.println("*--------------------------*");
                    System.out.println("|You did order a Margherita|");
                    System.out.println("*--------------------------*");
                    break;

                case 2:
                    System.out.println("*----------------------*");
                    System.out.println("|You did order a Hawaii|");
                    System.out.println("*----------------------*");
                    break;

                case 3:
                    System.out.println("*------------------------*");
                    System.out.println("|You did order a Italiano|");
                    System.out.println("*------------------------*");
                    break;

                case 4:
                    System.out.println("*----------------------*");
                    System.out.println("|You did order a Milano|");
                    System.out.println("*----------------------*");
                    break;

                case 5:
                    System.out.println("*------------------------ *");
                    System.out.println("|You did order a Valentino|");
                    System.out.println("*-------------------------*");
                    break;

                case 6:
                    System.out.println("*-------------------------*");
                    System.out.println("|You did order a Mama Rosa|");
                    System.out.println("*-------------------------*");
                    break;

                case 7:
                    System.out.println("*------------------------*");
                    System.out.println("|You did order a Solo Mio|");
                    System.out.println("*------------------------*");
                    break;

                case 8:
                    System.out.println("*--------------------*");
                    System.out.println("|You did order a Roma|");
                    System.out.println("*--------------------*");
                    break;

                case 9:
                    System.out.println("*---------------------*");
                    System.out.println("|You did order a Polio|");
                    System.out.println("*---------------------*");
                    break;

                case 10:
                    System.out.println("*---------------------*");
                    System.out.println("|You did order a Salad|");
                    System.out.println("*---------------------*");
                    break;

            }

            //Here it will make a variable finalPizza, which will be used later to tell which pizza is chosen, and also the price.
            if (pizzaOrder == 1) {
                finalPizza = "Margherita";
                pizzaPrice = 60;
                done = false;
            } else if (pizzaOrder == 2) {
                finalPizza = "Hawaii";
                pizzaPrice = 75;
                done = false;
            } else if (pizzaOrder == 3) {
                finalPizza = "Italiano";
                pizzaPrice = 70;
                done = false;
            } else if (pizzaOrder == 4) {
                finalPizza = "Milano";
                pizzaPrice = 75;
                done = false;
            } else if (pizzaOrder == 5) {
                finalPizza = "Valentino";
                pizzaPrice = 70;
                done = false;
            } else if (pizzaOrder == 6) {
                finalPizza = "Mama Rosa";
                pizzaPrice = 70;
                done = false;
            } else if (pizzaOrder == 7) {
                finalPizza = "Solo Mio";
                pizzaPrice = 70;
                done = false;
            } else if (pizzaOrder == 8) {
                finalPizza = "Roma";
                pizzaPrice = 85;
                done = false;
            } else if (pizzaOrder == 9) {
                finalPizza = "Polio";
                pizzaPrice = 80;
                done = false;
            } else if (pizzaOrder == 10) {
                finalPizza = "Salad";
                pizzaPrice = 75;
                done = false;
            } else {
                System.out.println("The input you used is not valid.\nPlease try again!");
            }
        }

        //Here the order of the pizza is done, now this part will add toppings.
        System.out.println("*----------------------------------------------------------------------------------*");
        System.out.println("|Do you want any toppings? Press 1 to see the list and choose, or 0 for no toppings|");
        System.out.println("*----------------------------------------------------------------------------------*");
        while (!done) {
            if (in.hasNextInt()) {
                toppings = in.nextInt();
                done = true;
            } else {
                System.out.println("The input you used is not valid.\nPlease try again!");
                in.next();
                continue;
            }
        }
        while (toppings < 0 || toppings > 1) {
            System.out.println("The input you used is not valid.\nPlease try again!");

            if (in.hasNextInt()) {
                if (toppings == 0 || toppings == 1) {
                    break;
                }
                toppings = in.nextInt();
            } else {
                in.next();
                continue;
            }
        }

        // If you say no to toppings, this part will take over, and you gonna choose the size, and it will print the recipe.
        if (toppings == 0) {
            System.out.println("You did not choose any toppings.");
            System.out.println("*------------------------------------------------------*");
            System.out.println("|                     Size                             |");
            System.out.println("|                Choose your size                      |");
            System.out.println("*------------------------------------------------------*");
            System.out.printf("|1. Child size                      Price is  %.2f", pizzaPrice * 0.75); System.out.print(" DKK|\n");
            System.out.printf("|2. Normal size                     Price is  %.2f",  pizzaPrice); System.out.print(" DKK|\n");
            System.out.printf("|3. Family size                     Price is %.2f", pizzaPrice * 1.50); System.out.print(" DKK|\n");
            System.out.println("*------------------------------------------------------*");
            System.out.println("Enter the number of the size you want.");
            while (done) {
                if (in.hasNextInt()) {
                    size = in.nextInt();
                } else {
                    System.out.println("The input you used is not valid.\nPlease try again!");
                    in.next();
                    continue;
                }


                if (size == 1) {
                    double smallPizzaNoTopping = pizzaPrice * 0.75;
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|                                      Receipt                                                  |");
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|Your ordered " + finalPizza + " with no extra topping and in small size.");
                    System.out.println("|                                                                                               |");
                    System.out.printf("|Total                                                                           Price DKK %.2f", smallPizzaNoTopping);
                    System.out.println("\n*-----------------------------------------------------------------------------------------------*");
                    done = false;
                } else if (size == 2) {
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|                                      Receipt                                                  |");
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|Your ordered " + finalPizza + " with no extra topping and in normal size.");
                    System.out.println("|                                                                                               |");
                    System.out.printf("|Total                                                                           Price DKK %.2f", pizzaPrice);
                    System.out.println("\n*-----------------------------------------------------------------------------------------------*");
                    done = false;
                } else if (size == 3) {
                    double familyPizzaNoTopping = pizzaPrice * 1.50;
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|                                      Receipt                                                  |");
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|Your ordered " + finalPizza + " with no extra topping and in family size.");
                    System.out.println("|                                                                                               |");
                    System.out.printf("|Total                                                                           Price DKK %.2f", familyPizzaNoTopping);
                    System.out.println("\n*-----------------------------------------------------------------------------------------------*");
                    done = false;



                } else {
                    System.out.println("The input you used is not valid.\nPlease try again!");
                }


            }
            //If you want toppings, this part will take the toppings and save them for the receipt.
        } else if (toppings == 1) {

            System.out.println("*-----------------------------------------------------------------------------------------*");
            System.out.println("|                                        Toppings                                         |");
            System.out.println("|                                  Order as many as you want                              |");
            System.out.println("*-----------------------------------------------------------------------------------------*");
            System.out.println("|1. Pineapple                                                               Price  10 DKK |");
            System.out.println("|2. Broccoli                                                                Price  10 DKK |");
            System.out.println("|3. Beef                                                                    Price  10 DKK |");
            System.out.println("|4. Mushrooms                                                               Price  10 DKK |");
            System.out.println("|5. Garlic                                                                  Price  10 DKK |");
            System.out.println("|6. Ham                                                                     Price  10 DKK |");
            System.out.println("|7. Onion                                                                   Price  10 DKK |");
            System.out.println("|8. Chili                                                                   Price  10 DKK |");
            System.out.println("*-----------------------------------------------------------------------------------------*");
            System.out.println("Enter the number of the topping you want. One at a time.");


            while (done) {

                if (in.hasNextInt()) {
                    toppingChosen = in.nextInt();
                } else {
                    System.out.println("The input you used is not valid.\nPlease try again!");
                    in.next();
                    continue;
                }
                if (toppingChosen == sentinel) {
                    done = false;
                } else {
                    if (toppingChosen == 1) {
                        toppingName = "Pineapple";
                        counter++;
                        System.out.println("You did choose " + counter + " toppings. Write \"0\" to stop choosing toppings or keep choosing.");
                    } else if (toppingChosen == 2) {
                        toppingName = "Broccoli";
                        counter++;
                        System.out.println("You did choose " + counter + " toppings. Write \"0\" to stop choosing toppings or keep choosing.");
                    } else if (toppingChosen == 3) {
                        toppingName = "Beef";
                        counter++;
                        System.out.println("You did choose " + counter + " toppings. Write \"0\" to stop choosing toppings or keep choosing.");
                    } else if (toppingChosen == 4) {
                        toppingName = "Mushrooms";
                        counter++;
                        System.out.println("You did choose " + counter + " toppings. Write \"0\" to stop choosing toppings or keep choosing.");
                    } else if (toppingChosen == 5) {
                        toppingName = "Garlic";
                        counter++;
                        System.out.println("You did choose " + counter + " toppings. Write \"0\" to stop choosing toppings or keep choosing.");
                    } else if (toppingChosen == 6) {
                        toppingName = "Ham";
                        counter++;
                        System.out.println("You did choose " + counter + " toppings. Write \"0\" to stop choosing toppings or keep choosing.");
                    } else if (toppingChosen == 7) {
                        toppingName = "Onion";
                        counter++;
                        System.out.println("You did choose " + counter + " toppings. Write \"0\" to stop choosing toppings or keep choosing.");
                    } else if (toppingChosen == 8) {
                        toppingName = "Chili";
                        counter++;
                        System.out.println("You did choose " + counter + " toppings. Write \"0\" to stop choosing toppings or keep choosing.");
                    } else if (toppingChosen < 1 || toppingChosen >= 8) {
                        System.out.println("The input you used is not valid.\nPlease try again!");
                    }

                    //This will save all the toppings and convert them to one String and use , between every topping.
                    totalToppings = totalToppings.concat(toppingName + " ");
                    toppingBought = toppingBought.concat(toppingName + ", ");
                }
            }
            //This part is going to print the different toppings that is chosen on a new line.
            System.out.println("\nYou did choose following toppings: \n");
            int currentIndex;
            for (int i = 0; i < counter; i++) {
                currentIndex = totalToppings.indexOf(" ");
                System.out.println("" + totalToppings.substring(0, currentIndex));
                totalToppings = totalToppings.substring(currentIndex + 1);
            }

            //This part is choosing the size, and it will print the receipt.
            System.out.println("*------------------------------------------------------*");
            System.out.println("|                     Size                             |");
            System.out.println("|                Choose your size                      |");
            System.out.println("*------------------------------------------------------*");
            System.out.printf("|1. Child size                      Price is  %.2f", pizzaPrice * 0.75); System.out.print(" DKK|\n");
            System.out.printf("|2. Normal size                     Price is  %.2f",  pizzaPrice); System.out.print(" DKK|\n");
            System.out.printf("|3. Family size                     Price is %.2f", pizzaPrice * 1.50); System.out.print(" DKK|\n");
            System.out.println("*------------------------------------------------------*");
            System.out.println("Enter the number of the size you want.");

            while (!done) {
                if (in.hasNextInt()) {
                    size = in.nextInt();
                } else {
                    System.out.println("The input you used is not valid.\nPlease try again!");
                    in.next();
                    continue;
                }

                if (size == 1) {
                    double smallPizzaWithTopping = pizzaPrice * 0.75 + counter * 10;
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|                                      Receipt                                                  |");
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|Your ordered " + finalPizza + " with following toppings: " + toppingBought + "and in child size ");
                    System.out.println("|                                                                                               |");
                    System.out.println("|Child size " + (finalPizza) + "                                                               Price DKK " + pizzaPrice * 0.75);
                    System.out.println("|" + counter + " toppings                                                                      Price DKK " + (counter * 10) + ".00|");
                    System.out.printf("|Total                                                                           Price DKK %.2f", smallPizzaWithTopping);
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    done = true;
                }

                if (size == 2) {
                    double normalPizzaWithTopping = pizzaPrice + counter * 10;
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|                                      Receipt                                                  |");
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|Your ordered " + finalPizza + " with following toppings: " + toppingBought + "and in normal size ");
                    System.out.println("|                                                                                               |");
                    System.out.println("|Normal size " + (finalPizza) + "                                                              Price DKK " + pizzaPrice);
                    System.out.println("|" + counter + " toppings                                                                      Price DKK " + (counter * 10) + ".00|");
                    System.out.printf("|Total                                                                           Price DKK %.2f", normalPizzaWithTopping);
                    System.out.println("\n*-----------------------------------------------------------------------------------------------*");
                    done = true;
                }

                if (size == 3) {
                    double familyPizzaWithTopping = pizzaPrice * 1.50 + counter * 10;
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|                                      Receipt                                                  |");
                    System.out.println("*-----------------------------------------------------------------------------------------------*");
                    System.out.println("|Your ordered " + finalPizza + " with following toppings: " + toppingBought + "and in normal size ");
                    System.out.println("|                                                                                               |");
                    System.out.println("|Family size " + (finalPizza) + "                                                              Price DKK " + pizzaPrice);
                    System.out.println("|" + counter + " toppings                                                                      Price DKK " + (counter * 10) + ".00|");
                    System.out.printf("|Total                                                                           Price DKK %.2f", familyPizzaWithTopping);
                    System.out.println("\n*-----------------------------------------------------------------------------------------------*");
                    done = true;
                } else if (size < 1 || size >= 3) {
                    System.out.println("The input you used is not valid.\nPlease try again!");
                }

            }

        }
    }
}
















