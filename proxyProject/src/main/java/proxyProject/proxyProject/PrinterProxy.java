package proxyProject.proxyProject;

public class PrinterProxy implements Printable{
	
	private String name;//이름
	private Printer real;//본인
	
	public PrinterProxy() {
		
	}

	
	public PrinterProxy(String name) {//생성자
		this.name = name;
	}
	
	public synchronized void setPrinterName(String name) {//이름의 설정
		if(real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}
	
	public String getPrinterName() { // 이름의 설정
		return name;
	}

	public void print(String string) { // 표시
		realize();
		real.print(string);
	}


	private synchronized void realize() { //본인을 생성
		if(real == null) {
			real = new Printer(name);
		}
		
	}

}
