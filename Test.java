package pack1;

public class Test {
	public static void main(String[]args){
		//TODO aUTO-generated method stub
		CPU cpu=new CPU();
		cpu.speed=100;
		HardDisk hardDisk=new HardDisk();
		hardDisk.amount=100000;
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(hardDisk);
		pc.show();	
	}

}
