package taller3.televisores;

public class TV {

	Marca marca;
	int canal = 1;
	int precio = 500;
	public boolean estado;
	int volumen = 1;
	Control control;
	static int numTV ;//Atributo de clase
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++ ;
	}
	
	

	public static int getNumTV() {
		return numTV;//Metodo obtener numTV
	}
	
	public static void setNumTV(int numTv) {
		TV.numTV = numTv;
	}
	
	public void turnOn(){ // 
		this.estado = true;
	}
	
	public void turnOff(){
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}

	public void canalUp(){ // 
		if (estado && canal<120) {
			canal++;
		}		
	}
	
	public void canalDown(){ // 
		if (estado && canal>1) {
			canal--;
		}		
	}
	
	public void volumenUp(){ // 
		if (estado && volumen<7) {
			volumen++;
		}		
	}
	
	public void volumenDown(){ // 
		if (estado && volumen>0) {
			volumen--;
		}		
	}


	public boolean isEstado() {
		return estado;
	}



	public void setEstado(boolean estado) {
		this.estado = estado;
	}



	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if(estado==true && canal<=120 && canal>=1){
			this.canal = canal;
		}
		
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	
	
	

}