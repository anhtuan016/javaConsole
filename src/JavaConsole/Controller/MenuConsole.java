/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaConsole.Controller;

import java.util.Scanner;

/**
 *
 * @author ADMIN-PC
 */
public class MenuConsole {

    public void createMenu() {
        while (true) {
            System.out.println("==========Student Manager================");
            System.out.println("1.Student List");
            System.out.println("2.Add student");
            System.out.println("3.Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("Exit");
            System.out.println("===========================================");
            Scanner scanner = new Scanner(System.in);
            String strChoice = scanner.nextLine();
            System.out.println(strChoice);
            int choice = 0;
            try {
                choice = Integer.parseInt(strChoice);
                System.out.println("Choice" + choice);
            } catch (java.lang.NumberFormatException e) {
                //Can co phan luu Log loi.
                System.err.println(e.getMessage());
                continue;
            }
            if(choice==5){
                break;
            }else{
                switch(choice){
                    case 1:
                        System.out.println("In danh sach");
                        break;
                    case 2:
                        System.out.println("Them");
                        break;
                    case 3:
                        System.out.println("Sua");
                        break;
                    case 4:
                        System.out.println("Xoa");
                        break;
                    default:
                        System.out.println("");
                }
            }
        }
    }

    public static void main(String[] args) {
        MenuConsole menu = new MenuConsole();
        menu.createMenu();

    }

}
