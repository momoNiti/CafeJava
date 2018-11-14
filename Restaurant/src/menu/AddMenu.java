/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author STUDY fuckin HARD
 */
public class MyMenu {
    ArrayList<Menu> menu = new ArrayList<Menu>();
    public void addMenu(Menu menu){
       this.menu.add(menu);
    }
    public MyMenu(){
        addMenu(new Menu("Google", 50));
        addMenu(new Menu("Facebook", 2));
    }
    public static void main(String[] args) {
        MyMenu run = new MyMenu();
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        
        run.addMenu(new Menu(name, price));
        
        for(int i=0; i<run.menu.size(); i++){
            System.out.println(run.menu.get(i).getName() + " : " + run.menu.get(i).getPrice());
        }
               
    }
}
