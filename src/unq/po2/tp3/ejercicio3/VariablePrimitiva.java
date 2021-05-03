package unq.po2.tp3.ejercicio3;

public class VariablePrimitiva {
	static int ejemplo;
	static Integer ejemplo2;

	public static void main(String[] args) {
		System.out.println(ejemplo);
		System.out.println(ejemplo2);
	}
	// 1 - Son datos que se almacenan su valor literal 
	 //en la memoria stack, existen los de tipo int, float, double, boolean, char
	// 2 - int es un dato primitivo y se aloja en la memoria stack, y Integer es una clase
	// que guarda su referencia en la memoria stack con su valor literal en la memoria heap
	//2- Un int es un numero, un dato primitivo, mientras que Integer, hace referencia
	// a la Clase/Objeto,esta ultima tiene distintos tipos de datos de numeros, entre ellos int
	//3- El valor predeterminado de una variable de instancia de tipo int es 0.Mientras
	// que el valor de una variable de instancia de un tipo Integer es null 
}


