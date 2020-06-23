package observer;


public aspect Connector {
	int pasos = 1;
	
	pointcut register() : call(void setColor(String)) || call (void createRoot()) || 
						  call (void createButtonPanel()) || call (* createButton(String));
	after() : register(){
		System.out.print("Paso "+pasos+": ");
		pasos++;
	}
	
	pointcut cambiarColor(String color) : call(* setColor(String)) && args(color);
	after(String color) : cambiarColor(color){
		switch(color) {
			case "negro":
				System.out.println("El color es NEGRO");
				break;
			case "azul":
				System.out.println("El color es AZUL");
				break;
			case "rojo":
				System.out.println("El color es ROJO");
				break;
		}
	}
	
	pointcut root() : call (void createRoot());
	after() : root(){
		System.out.println("Root principal de la ventana creado.");
	}
	
	pointcut buttonPanel() : call (void createButtonPanel());
	after() : buttonPanel(){
		System.out.println("Creado el panel de botones");
	}
	
	pointcut button() : call (* createButton(String));
	after() : button(){
		System.out.println("Creado un nuevo botón.");
	}

}	

