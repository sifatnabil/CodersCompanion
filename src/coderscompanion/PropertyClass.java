/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderscompanion;

import java.io.File;
import java.lang.management.ManagementFactory;

/**
 *
 * @author user
 */
public class PropertyClass {
    static String userName = System.getProperty("user.name");
    static String osName = System.getProperty("os.name");
    static String jvmVersion = System.getProperty("sun.arch.data.model");
    static String archi = System.getProperty("os.archi");
    static long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory
        .getOperatingSystemMXBean()).getTotalPhysicalMemorySize() / 1000000000;
    static long diskSize = new File("/").getTotalSpace() / 1000000000;
  
    
}
