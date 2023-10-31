package jsp;

public class Parts {
    private int pid;
    private String pname;
    private String color;

    public Parts(int pid, String pname, String color) {
        this.pid = pid;
        this.pname = pname;
        this.color = color;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public String getColor() {
        return color;
    }
    public void setpid(int pid) {
		this.pid = pid;
	}
    public void setpname(String pname) {
    	this.pname=pname;
    }
	public void setcolor(String color) {
		this.color = color;
	}
}
