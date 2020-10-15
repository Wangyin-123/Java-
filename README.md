# Java-
Java课程作业项目仓库
#阅读程序
用类描述计算机中CPU的速度和硬盘的容量，要求Java应用程序有4个类，名字分别为：pc CPU harddisk 和Test ，其中TEST是主类。cpu类要求getSpeed()返回speed的值，
要求setSpeed(int m)方法将参数m的值赋给speed，HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数 m 的值赋值给 amount；PC 类要求
setCPU(CPU c)将参数c的值赋值给 cpu，要求setHardDisk (HardDisk h)方法将参数 h 的值赋值给 HD，要求 show()方法能显示 cpu 的速度和硬盘的容量。
•主类 Test 的要求
(1)main方法中创建一个CPU 对象 cpu，cpu将自己的speed设置为100。(自定义)
(2)main方法中创建一个HardDisk对象disk，disk将自己的amount设置为100000000.(自定义)
(3)main方法中创建一个PC对象pc。
(4)pc调用setCPU(CPU c)方法，调用时实参是 cpu。
(5)pc调用setHardDisk(HardDisk h)方法，调用时实参是 disk。
(6)pc调用show()方法。

#CPU类：
public class CPU {
int speed;
void setSpeed(int m) {
speed=m;
}
public int getSpeed() {
return speed;
}
}
#pc类：
public class PC {
CPU cpu;
HardDisk HD;
public void setCPU(CPU c) {
cpu =c;
}
public void setHardDisk(HardDisk h) {
HD=h;
}
public void show() {
System.out.println("cpu的速度："+cpu.getSpeed()+
"硬盘的容量："+HD.getAmount());
}
}
#HardDISK类
public class HardDisk {
int amount;
void setAmount(int m) {
amount=m;
}
public int getAmount() {
return amount;
}
}
#Test类：
public class TestComputer {
public static void main(String[] args) {
// TODO Auto-generated method stub
CPU cpu =new CPU ();
cpu.speed=100;
HardDisk hardDisk =new HardDisk();
hardDisk.amount=100000000;
PC pc=new PC();
pc.setCPU(cpu);
pc.setHardDisk(hardDisk);
pc.show();
}
}
  
##实验过程
  首先程序开发中，基本按照先建立Project，命名为SsecondJava，然后建立Package，pack1，再在包中新建4个Class，分别为CPU,HardDisk，PC,Test。
 在包中建立Class编写程序代码：

##核心方法

##实验结果
   cpu的速度：100硬盘的容量：100000000

##实验感想

