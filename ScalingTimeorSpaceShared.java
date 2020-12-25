/**
 * 
 */
package org.cloudbus.cloudsim.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.CloudletSchedulerSpaceShared;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.UtilizationModelFull;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicySimple;
import org.cloudbus.cloudsim.VmSchedulerTimeShared;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisioner;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

/**
 * @author Lakshmi
 *
 */
public class ScalingTimeorSpaceShared {

	/**
	 * @param args
	 */
	private static List<Cloudlet> cloudletlist;
	
	private static List<Vm> vmList;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	int op = 0;
		String fname;
	//	System.out.println("Input the output file name(1..n): ");
	//	op = System.in.read();
	//System.out.println(op);
		final String dir = System.getProperty("user.dir");
	
		System.out.println("Input the No.ofCores(2,4,6,..12): ");
		//int ncores = System.in.read();
	    int ncores = ThreadLocalRandom.current().nextInt(2, 12 + 1);
		System.out.println(ncores);
		
		System.out.println("Input the No.of Hosts(1,2..4): ");
		//int nhosts = System.in.read();
		int nhosts = ThreadLocalRandom.current().nextInt(1, 4 + 1);
		System.out.println(nhosts);
				
		System.out.println("Input the No.of VMs(1,2..10): ");
		//int nvms = System.in.read();
		int nvms = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		System.out.println(nvms);
		
		System.out.println("Input the No.of CloudLets(1,2..10): ");
		//int nclds = System.in.read();
		int nclds = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		System.out.println(nclds);
		String indent = "_";
		fname = dir + "\\OutC_H_VMs_Clds"+ indent + ncores + indent + nhosts + indent + nvms + indent + nclds + ".xls";
		System.out.println("Ouput is in file fname:");
		System.out.println(fname);
		System.out.println("\n");
		
		File file = new File(fname);
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		//time&space share tried for Cloudlet only..VM stayed Timeshared
		for(int timeorspace=0;timeorspace<=1;timeorspace++) {
		Log.printLine("Simulation started...");
		try {		
		//Step : 1 Initalize the cloudsim package
		int init_user = 1;
		Calendar calendar = Calendar.getInstance();
		boolean traceFlag = false;
		//Step : 1.a Init cloudsim library
		
		CloudSim.init(init_user, calendar , traceFlag);		
		//Step : 2 Create DC
		@SuppressWarnings("unused") //why datacenter0 unused??
		Datacenter datacenter0 = createDatacenter("Datacenter_0", ncores, nhosts, nvms, nclds);
		
		//Step : 3 Create DC broker
		
		DatacenterBroker broker = createBroker();
		int brokerId = broker.getId();
		//Step : 4 Create Vm, add & submit to the DC
		vmList = new ArrayList<Vm>();
		//VM Description
		//2 vms
		for(int vmid=0;vmid<nvms;vmid++) {
		//int vmid = 0;
		int mips = 1000;
		long size = 6250; //image size (MB)
		int ram = 2000; // 2GB vm memory (MB)
		long bw = 2000; //bandwidth in kbits.s
		int pesNumber = 1; // number of cpus
		String vmm = "Xen"; // VMM name
		Vm vm;
		// create VM
		if (timeorspace == 0) { //then timeshared
			
			vm = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerTimeShared());
		}
			else //then spaceshared
		{
			vm = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerSpaceShared());
		}

		// add the VM to the vmList
		vmList.add(vm);

		// submit vm list to the broker
		broker.submitVmList(vmList);
		
		//Step : 5 Create cloudlet, add & submit to the DC
		//4 cloudlets
		
		cloudletlist = new ArrayList<Cloudlet>();

		// Cloudlet properties
		for(int id=0;id<nclds;id++) {
		//int id = 0;
		long length = 20000;
		long fileSize = 400;
		long outputSize = 200;
		UtilizationModel utilizationModel = new UtilizationModelFull();

		Cloudlet cloudlet = new Cloudlet(id, length, pesNumber, fileSize, outputSize, utilizationModel, utilizationModel, utilizationModel);
		cloudlet.setUserId(brokerId);
		cloudlet.setVmId(vmid);

		// add the cloudlet to the list
		cloudletlist.add(cloudlet);
		} //end for cloudlet

		// submit cloudlet list to the broker
		broker.submitCloudletList(cloudletlist);
		} //for loop for VMs		
		
		//Step : 6 Start simulation
		CloudSim.startSimulation();

		//Step : 7 Stop Simulation
		CloudSim.stopSimulation();

		//Step : 9 PRint results		
		List<Cloudlet> newList = broker.getCloudletReceivedList();
		try {
		printCloudletList(newList, ncores, nhosts, nvms, nclds, timeorspace);
		} catch (Exception e) {
			e.printStackTrace();
			Log.printLine(newList);
		}
		Log.printLine("CodeBasicSimulation finished!");
	} catch (Exception e) {
		e.printStackTrace();
		Log.printLine("Unwanted errors happen");
	}
} //for timeorspace	
				
	}

	private static Datacenter createDatacenter(String name, int ncores, int nhosts, int nvms, int nclds) throws IOException {
		// TODO Auto-generated method stub
		//1: Create Host list
		List<Host> hostList = new ArrayList<Host>();
		//2: Create PE list
		List<Pe> peList = new ArrayList<Pe>();
		
		int mips = 1000;
		//3: create Pe&Add PE characteristics ie no of cores.
		for(int i=0;i<ncores;i++) {
		peList.add(new Pe(i, new PeProvisionerSimple(mips)));
		}
		//peList.add(new Pe(1, new PeProvisionerSimple(mips)));
		
	
		//4: create host & Add characteristics
		for(int i=0;i<nhosts;i++) {
		int hostId = i;
		long storage = 100000; //	100 GB Storage(100000 MB)
		int ram = 4096; // ram is 4GB = 4096 MB
		int bw = 4000; // Kbits/s bandwidth
		hostList.add(
				new Host(
					hostId,
					new RamProvisionerSimple(ram),
					new BwProvisionerSimple(bw),
					storage,
					peList,
					new VmSchedulerTimeShared(peList)));
		//there my several host machine
		}
		//5. Create DC object that stores properties of a DC
		
		String arch = "x86";
		String os = "Linux";
		String vmm = "xen";
		double time_zone = 10;
		double cost = 3.0;
		double costPerMem = 0.05;
		double costPerStorage = 0.001;
		double costPerBw = 0.0;
//		LinkedList<Storage> storagelist = new LinkedList<Storage>;
		
	    DatacenterCharacteristics characteristics = new DatacenterCharacteristics(arch, os, vmm,
							hostList,
							time_zone,
							cost,
							costPerMem,
							costPerStorage,
							costPerBw);
		
		//6. Finally we need to create a power DC object.
		Datacenter datacenter = null;
		
		//8: Create DC
		try {
			datacenter = new Datacenter(name, characteristics, new VmAllocationPolicySimple(hostList));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return datacenter;
	}
private static DatacenterBroker createBroker() {
		DatacenterBroker broker = null;
		try {
			broker = new DatacenterBroker("Broker");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return broker;
		}
private static void printCloudletList(List<Cloudlet> list, int ncores, int nhosts, int nvms, int nclds, int timeorspace) {
	//int size = list.size();
	int size = nvms * nclds ;
	Cloudlet cloudlet;
    
    String ss = "";
    if(timeorspace == 0) ss = "T";
    else ss = "S";
    
	String indent = "    ";
	Log.printLine("Cores,hosts, nvms, nclds, timeorspace, clsize: " + ncores + indent + nhosts + indent + nvms + indent + nclds + indent + ss + indent + size);
	Log.printLine();
	Log.printLine("========== OUTPUT ==========");
	Log.printLine("Cloudlet ID" + indent + "STATUS" + indent
			+ "Data center ID" + indent + "VM ID" + indent + "ExecutionTime" + indent
			+ "Start" + indent + "Finish" + indent + "TimeOrSpace" );

	DecimalFormat dft = new DecimalFormat("###.##");
	for (int i = 0; i < size; i++) {
		cloudlet = list.get(i);
		Log.print(indent + cloudlet.getCloudletId() + indent + indent);

		if (cloudlet.getCloudletStatus() == Cloudlet.SUCCESS) {
			Log.print("SUCCESS");

			Log.printLine(indent + indent + cloudlet.getResourceId()
					+ indent + indent + indent + cloudlet.getVmId()
					+ indent + indent
					+ dft.format(cloudlet.getActualCPUTime()) + indent
					+ indent + dft.format(cloudlet.getExecStartTime())
					+ indent + indent
					+ dft.format(cloudlet.getFinishTime()));
		}
	}
}


}

