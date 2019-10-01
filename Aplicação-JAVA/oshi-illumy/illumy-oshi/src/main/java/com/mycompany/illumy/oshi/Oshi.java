
package com.mycompany.illumy.oshi;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.util.FormatUtil;

public class Oshi {
   private SystemInfo systemInfo;
   private OperatingSystem operatingSystem;
   private HardwareAbstractionLayer hardware;
   
   public Oshi(){
       systemInfo = new SystemInfo();
       operatingSystem = systemInfo.getOperatingSystem();
       hardware = systemInfo.getHardware();
   }
   
   public String recebeMemoria(GlobalMemory memoria){
       var memoriaDisponivel = memoria.getAvailable();
       String memoriaDisp = FormatUtil.formatBytes(memoriaDisponivel);
       return memoriaDisp;
       
   }
}
