package Run;

import Information.CPU;
import Information.HardDisk;

public class Test {

   public static void main(String args[]) {

       CPU cpu = new CPU(20,"Intel",3.8);

       HardDisk HD=new HardDisk(200,240);

       PC pc =new PC(cpu,HD);

       pc.show();

    }

}