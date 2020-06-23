package observer;


public aspect Connector {
	int pasos = 1;
	
	pointcut register() : call(void setBlack()) || call(void setBlue()) || call(void setRed()) ||
	   call (void createRoot()) || call (void createButtonPanel()) || call (* createButton());
	after() : register(){
		System.out.print("Paso "+pasos+": ");
		pasos++;
	}
	
	pointcut black() : call(void setBlack());
	after() : black(){
		System.out.println("Color Cambiado a NEGRO");
	}
	
	pointcut blue() : call(void setBlue());
	after() : blue(){
		System.out.println("Color Cambiado a AZUL");
	}
	
	pointcut red() : call(void setRed());
	after() : red(){
		System.out.println("Color Cambiado a ROJO");
	}
	
	pointcut root() : call (void createRoot());
	after() : root(){
		System.out.println("Root principal de la ventana creado.");
	}
	
	pointcut buttonPanel() : call (void createButtonPanel());
	after() : buttonPanel(){
		System.out.println("Creado el panel de botones");
	}
	
	pointcut button() : call (* createButton());
	after() : button(){
		System.out.println("Creado un nuevo botón.");
	}

}	

