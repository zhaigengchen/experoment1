# Java-
Java课程作业项目仓库

# 阅读程序

## 实验目的
用类描述计算机中的CPU的速度和硬盘的容量。要求Java的应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。


## 实验过程
一.CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed。  
所以定义一个整型变量speed，定义一个方法将m的值赋值给speed，再定义一个方法getSpeed返回speed的值。代码如下：  
class CPU{  
int speed;  
int getSpeed(){  
return speed;  
}  
void setSpeed(int m){  
speed=m;  
}  
}  

二.HardDisk 类 要求 getAmount()返回 amount 的值， 要求 setAmount(int m)方法将 参数 m 的值赋值给 amount。  
方法同一，定义一个整型变量amount，定义一个方法将m的值赋值给amount，再定义一个方法etAmount()返回 amount 的值。代码如下：  
class HardDisk{  
int amount;  
int getAmount(){  
return amount;  
}  
void setAmount(int m){  
amount=m;  
}  
}  

三.PC 类 要求 setCPU(CPU c)将参数 c 的值赋值给 cpu，要求 setHardDisk(HardDisk h)方法将参数 h 的值赋值给 HD， 要求 show()方法能显示 cpu 的速度和 硬盘的容量。  
分别定义一个HardDisk和CPU类型的变量HD和cpu，将CPU类返回的值c赋值给cup，将HaedDisk返回的的值h赋值给HD，定义一个方法show()显示cpu的速度和硬盘的容量。代码如下：  
class PC{  
HardDisk HD;  
CPU cpu;  
void setCPU(CPU c){  
cpu=c;  
}  
void setHardDisk(HardDisk h){  
HD=h;  
}  
void show(){  
System.out.println("CPU的速度是"+cpu.getSpeed());  
System.out.println("硬盘的容量是"+HD.getAmount());  
}  
}  

四.主类 Test 的要求 （1） main 方法中创建一个 CPU 对象 cpu，cpu 将自己的 speed 设置为 2200； （2） main 方法中创建一个 HardDisk 对象 disk，disk 将自己的 amount 设置为 200； （3） main 方法中创建一个 PC 对象 pc； （4） pc 调用 setCPU(CPU c)方法，调用时实参是 cpu； （5） pc 调用 setHardDisk(HardDisk h)方法，调用时实参是 disk; （6） pc 调用 show()方法。  
首先创建一个main方法，在main方法中创建一个 CPU 对象 cpu，并将cpu 将自己的 speed 设置为 2200，然后在main 方法中创建一个 HardDisk 对象 disk，并将disk 将自己的 amount 设置为 200，其次创建一个PC对象pc，用pc调用cpu和disk，最后用pc调用show()方法显示数据。代码如下：  
public class Test{  
public static void main(String args[]){  
CPU cpu=new CPU();  
HardDisk disk=new HardDisk();  
cpu.setSpeed(2200);  
disk.setAmount(200);  
PC pc=new PC();  
pc.setCPU(cpu);  
pc.setHardDisk(disk);  
pc.show();  
}   
}  




## 核心方法
1. 方法一  
int getSpeed(){
return speed;
}
2. 方法二  
void setSpeed(int m){
speed=m;
3. 方法三  
int getAmount(){
return amount;
}
4. 方法四  
void setAmount(int m){
amount=m;
}
}
5. 方法五  
void setCPU(CPU c){
cpu=c;
}
6. 方法六  
void setHardDisk(HardDisk h){
HD=h;
}
7. 方法七  
void show(){
System.out.println("CPU的速度是"+cpu.getSpeed());
System.out.println("硬盘的容量是"+HD.getAmount());
}
}
8. 方法八  
public static void main(String args[])




## 实验结果


CUP的速度是2200
硬盘的容量是200



## 实验感想
通过本次实验我更深刻的了解到类与方法的概念，并且了解了他们之间的关系，同时也学会了方法与方法之间的调用。
