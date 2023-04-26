package practicasObjetos;
import utilidades.Teclado;

public class Date {
	//v instancia
	private int d, m, y;
	
	//constructores
	public Date() {
		d=m=y=0;
	}
	public Date (int d, int m, int y) {
		this.d=d;
		this.m=m;
		this.y=y;
	}
	//get
	public int getDay() {
		return d;
	}
	public int getMonth() {
		return m;
	}
	public int getYear() {
		return y;
	}
	public void setDay(int d) {
		this.d=d;
	}
	public void setMonth(int m) {
		this.m=m;
	}
	public void setYear(int y) {
		this.y=y;
	}
	public void setDate(int d,int m,int y) {
		if (checkDate()==true) {
			this.d=d;
			this.m=m;
			this.y=y;
		}
		else {
			System.out.println("Fecha no válida.");
		}
		
	}
	//comprobar
	public boolean checkDate () {
		if (checkDays(d,m,y)==false) return false;
		if (checkMonth(m)==false) return false;
		return true;
	}	
	public boolean lapYear (int y) {
		if (y%4==0) {
			return true;
		}
		return false;
	}
	public boolean checkDays (int d, int m, int y) {
		if (d<1 || d>31) return false;
		switch (m) {
		case 4,6,9,11:
			if (d>30) return false;
			break;
		case 1,3,5,7,8,10,12:
			if (d>31) return false;
			break;
		case 2:
			if (lapYear(y)==false && d>28) return false;
			if (lapYear(y)==true && d>29) return false;
		}
		return true;
	}
	public boolean checkMonth (int m) {
		if (m<1 || m>12) return false;
		return true;
	}
	//métodos 
	public String toString() {
		return "["+d+"/"+m+"/"+y+"]";
	}
}
