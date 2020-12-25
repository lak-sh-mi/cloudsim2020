import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.Storage;
import org.cloudbus.cloudsim.UtilizationModelFull;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicySimple;
import org.cloudbus.cloudsim.VmSchedulerSpaceShared;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

import com.opencsv.CSVWriter;

/**
 * 
 */

/**
 * @author Lakshmi
 *
 */
public class CloudsimSimulationExample {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Intialize the cloud sim package
			int numUser=1;
			Calendar cal = Calendar.getInstance();
			boolean traceFlag = false;
			CloudSim.init(numUser, cal, traceFlag);
		//2.Create Datacenter 
			//(DC->DCChars->HostList->Processing element list)
			Datacenter dc= CreateDataCenter();
		//3.Create Broker
			
		DatacenterBroker dcb = null;
		try {
		dcb = new DatacenterBroker("DatacenterBroker1");
		} catch (Exception e) {
			//TODO Auto generated catch block
			e.printStackTrace();
		}
		//4.Create Cloudlets (Define the workload with 40 cloudlets)
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter no of cloudlets- ");  
		int a= sc.nextInt();
		List<Cloudlet> cloudletList = new ArrayList<Cloudlet>();
		

		long cloudletLength = 40000; 
		int pesNumber = 1; 
		long cloudletFileSize = 300;  
		long cloudletOutputSize = 400;
		UtilizationModelFull fullUtilize = new UtilizationModelFull(); 
		Random r = new Random();
		
		for(int cloudletId=0; cloudletId < a ; cloudletId++) {
		Cloudlet newCloudlet = new Cloudlet(cloudletId,(cloudletLength+ r.nextInt(1000)),pesNumber,cloudletFileSize,cloudletOutputSize, 
				fullUtilize, fullUtilize, fullUtilize);
		newCloudlet.setUserId(dcb.getId());
		cloudletList.add(newCloudlet);
		}
		
		//5.Create VMs
		List<Vm> vmList = new ArrayList<Vm>();
		
		long diskSize = 20000;
		int ram = 2000;
		int mips = 1000;
		int bandwidth = 1000;
		int vCPU = 1;
		String VMM = "XEN";
		
		//how to create instance of a VM
		for (int vmId = 0; vmId < a; vmId++) {
		
		Vm virtualMachine= new Vm(vmId, dcb.getId(), mips, vCPU, ram, bandwidth, diskSize, VMM, 
				new CloudletSchedulerTimeShared());
		vmList.add(virtualMachine);
		}
		
		dcb.submitCloudletList(cloudletList);
		dcb.submitVmList(vmList);
		
		//6.Start Simulation
		CloudSim.startSimulation();
		
		List<Cloudlet> finalCloudletExecutionResults = dcb.getCloudletReceivedList();
		
		CloudSim.stopSimulation();
		
		//7.Print Results
		int cloudletNo=0;
		Log.printLine("*************************");
		
		/*CSVWriter writer = new CSVWriter(new FileWriter("D://output.csv"));*/
		String line1[] = {"Cloudletno", "ID", "VM:", "status", "Execution"};
		List list = new ArrayList();
		list.add(line1);
		for(Cloudlet c : finalCloudletExecutionResults)
		{
			/*Log.printLine("Result of cloudlet No " + ++cloudletNo);
			Log.printLine("*************************");*/
			Log.printLine("Cloudletno:" + ++cloudletNo+ ",ID"+ c.getCloudletId() + ",VM:" + c.getVmId() + ",status:" + c.getStatus() + ",Execution:" + (String.format("%.2f", c.getActualCPUTime())) + ", Start: " + c.getExecStartTime() + " , Finish::" + c.getFinishTime() );
			//line1[] = {cloudletNo, c.getCloudletId(), c.getVmId() , c.getStatus(), String.format("%.2f", c.getActualCPUTime());
			list.add(line1);
			//Log.printLine("*************************");
		}
		 //Instantiating the List Object
	      
	      
	      
	      //Writing data to the csv file
	      /*writer.writeAll(list);*/
	     /* writer.flush();*/
	      System.out.println("Data entered");
		Log.printLine("*************************");
	}
			private static Datacenter CreateDataCenter()  {
				List<Pe> pelist = new ArrayList<Pe>();
				//List<Pe> peList = new ArrayList<Pe>();
				
				PeProvisionerSimple pProvisioner = new PeProvisionerSimple(1000);
				
				Pe core1 = new Pe(0, pProvisioner);
				pelist.add(core1);
				Pe core2 = new Pe(1, pProvisioner);
				pelist.add(core2);
				Pe core3 = new Pe(2, pProvisioner);
				pelist.add(core3);
				Pe core4 = new Pe(3, pProvisioner);
				pelist.add(core4);
				
				List<Host> hostlist = new ArrayList<Host>();
				
				int ram1 = 8000;
				int bw = 8000;
				long storage = 100000; 
				Host host1 = new Host(0, new RamProvisionerSimple(ram1), new BwProvisionerSimple(bw), storage, pelist, new VmSchedulerSpaceShared(pelist));
				hostlist.add(host1);
				Host host2 = new Host(1, new RamProvisionerSimple(ram1), new BwProvisionerSimple(bw), storage, pelist, new VmSchedulerSpaceShared(pelist));
				hostlist.add(host2);
				Host host3 = new Host(2, new RamProvisionerSimple(ram1), new BwProvisionerSimple(bw), storage, pelist, new VmSchedulerSpaceShared(pelist));
				hostlist.add(host3);
				Host host4 = new Host(3, new RamProvisionerSimple(ram1), new BwProvisionerSimple(bw), storage, pelist, new VmSchedulerSpaceShared(pelist));
				hostlist.add(host4);
				
				String architecture="x86";
				String os ="Linux";
				String vmm = "XEN";
				double timeZone  = 5.5;
				double ComputecostPerSec = 3.0;
				double costPerMem = 1.0;
				double costPerStorage = 0.05;
				double costPerBw = 0.10;

				DatacenterCharacteristics dcCharateristics = new DatacenterCharacteristics(architecture, os, vmm, hostlist, timeZone, ComputecostPerSec, costPerMem, costPerStorage, costPerBw);
				
				LinkedList<Storage> SANstorage = new LinkedList<Storage>();
				Datacenter dc= null;
				try {
				   dc= new Datacenter("Datacenter1", dcCharateristics, new VmAllocationPolicySimple(hostlist), SANstorage, 1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return dc;
			}


/*	private static Datacenter CreateDataCenter() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
