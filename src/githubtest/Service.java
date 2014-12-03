/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package githubtest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dave Hendy
 */
public class Service {
    
    public String getDateAndTime() {
         SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd:HH.mm.ss");
         return dateformat.format(new Date());

    }
    
}
