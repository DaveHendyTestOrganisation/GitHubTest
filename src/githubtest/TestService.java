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
public interface TestService {
    
    String getTestData();
    
    /**
     * Added to branch davetest
     * @param testData 
     */
    void setTestData(String testData, boolean flag);
    
}
