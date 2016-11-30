package bg.elsys.ip.rest;

public class Laptop {
	String name;
	String cpuModel;
	String display;
	String res;
	String gpuModel;
	double cpuFrequency;
	int ram;
	int gpuMemory;

	public Laptop() {
	}

	public Laptop(String name, String cpuModel, double cpuFrequency, String display, String res, int ram, String gpuModel, int gpuMemory) {
		super();
		this.name = name;
		this.cpuModel = cpuModel;
		this.cpuFrequency = cpuFrequency;
		this.display = display;
		this.res = res;
		this.ram = ram;
		this.gpuModel = gpuModel;
		this.gpuMemory = gpuMemory;
	}

	public String getCpuModel() {
		return cpuModel;
	}

	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}

	public double getCpuFrequency() {
		return cpuFrequency;
	}

	public void setCpuFrequency(double cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getGpuModel() {
		return gpuModel;
	}

	public void setGpuModel(String gpuModel) {
		this.gpuModel = gpuModel;
	}

	public int getGpuMemory() {
		return gpuMemory;
	}

	public void setGpuMemory(int gpuMemory) {
		this.gpuMemory = gpuMemory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
