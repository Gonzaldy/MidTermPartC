/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author dylan
 */
import java.util.Scanner;
public class TestUserprofile {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter UserID/Name: ");
       
        userID newUserId = new userID();
        String userID = scan.nextLine();
        
        System.out.println("Choose your favourite genre from the following: ");
        genre genre = new genre();
        System.out.println(getGenre.genres);
        
        System.out.println("User profile created.");
          
    }   
}
