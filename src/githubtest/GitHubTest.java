/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package githubtest;

/**
 *
 * @author Dave
 */
public class GitHubTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Running GitHubTest");
        System.out.println("VERSION=" + Constants.VERSION);
        Service service = new Service();
        System.out.println("Date=" + service.getDateAndTime());
    }
    
}
