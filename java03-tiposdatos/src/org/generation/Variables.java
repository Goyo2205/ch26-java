package org.generation;

public class Variables {

	public static void main(String[] args) {
		/*
		 * Reglas para el nombre de las variables:
		 * 
		 * 
		 * 
		 */
		
		
		// el tipo byte es de 8 bits y almacena solo enteros
		// 2^8
		byte myVarByte = 12;
		System.out.println("byte: " + myVarByte);
		//obtener el valor maximo y minimo del tipo byte, usando su 
		//wrapper (Clase envolvente) Byte
		
		System.out.println("Byte, Max value: " + Byte.MAX_VALUE );
		System.out.println("Byte, Min value: " + Byte.MIN_VALUE );
		
		// 2^16
		short myVarShort = 100;
		System.out.println("Short: " + myVarShort);
		System.out.println("Short, Max value: " + Short.MAX_VALUE );
		System.out.println("Short, Min value: " + Short.MIN_VALUE );
	
		// 2^32
		int myVarInt = 100;
		System.out.println("Int: " + myVarInt);
		System.out.println("Int, Max value: " + Integer.MAX_VALUE );
		System.out.println("Int, Min value: " + Integer.MIN_VALUE );
		
		// 2^64
		long myVarLong = 100;
		System.out.println("Long: " + myVarLong);
		System.out.println("Long, Max value: " + Long.MAX_VALUE );
		System.out.println("Long, Min value: " + Long.MIN_VALUE );
		
		//------------------------------------------------------------------
		// las literales numericas por default son integer*/
		// para indicar que es un long hay que ponerle una L al final
		//long myLiteralLongWrong = 2147483648; // el num maximo permitido por int es 2147483647
		long myLiteralLongCorrect = 2147483648L; // por lo que hay que especificar la literal numerica a long para que destine mas bytes para tratar el numero
		
		//EL tipo float es de 32 bits, almacena datos numericos de punto flotante (real)
		float myVarFloat =1500.6523F;
		System.out.println("float: " + myVarFloat);
		System.out.println("Float, Max value: " + Float.MAX_VALUE);
		System.out.println("Float, Min value: " + Float.MIN_VALUE);
		
		//EL tipo double es de 64 bits, para los decimales es la literal numerica por default
		double myVarDouble =1500.6523;
		System.out.println("Double: " + myVarDouble);
		System.out.println("Double, Max value: " + Double.MAX_VALUE);
		System.out.println("Double, Min value: " + Double.MIN_VALUE);
		
		//-----------------------------------------------------------------
		//El tipo boolean solo almacena valores true o false
		boolean myVarBoolean = true;
		
		
		//
		char losPandillerosDeLaTarde = 'I';
		System.out.println("Char: " + losPandillerosDeLaTarde);
		// se puede definir en el unicode
		char letraL = '\u004C'; //L
		System.out.println("La letra L: " + letraL);		
		char letraM = 77; //M
		System.out.println("La letra M: " + letraM);
		
		
		//-----------------------------------------------------------------
		//Formas de representar un numero Decimal
		//Formas de representar un numero HexaDecimal
		System.out.println("Representación decimal: " + 26);
		System.out.println("Representación hexadecimal: " + 0x1a);
		System.out.println("Representación binaria: " + 0b11010);
		
		
		//-----------------------------
		float numerosFloatSeparados = 12_345.456_36F;
		
		//---------------------------------------------------------------------
		// Conversion de tipos de datos
		byte coquita600ml = 60;
		// upcasting
		short coquita200ml = coquita600ml;
		
		//downcasting
		short pozoleGrande1L = 259;
		byte pozoleBurbuja = (byte) pozoleGrande1L;
		System.out.println("Pozole burbuja: " + pozoleBurbuja);
		
		//----------------------------------------------------------------------
		//Objetos de tipo string
		// se definen con comillas dobles, si quieres poner comillas dobles en tu string necesitas \"texto\"
		// \b (backspace), \' (single quote), \\ (backslash)
		// \t (tab) \n (line feed), \f (form feed), \r (carrige return)
		
		String myVarString = "Holi \"Crayoli\"";
		System.out.println("Mensaje String: " + myVarString);
		
		// convertir de string a double
		byte edadMascota = Byte.parseByte("10");
		double edadPlaneta = Double.parseDouble("456.8956");
		System.out.println(edadMascota + "," + edadPlaneta);
		
		//convertir numeros a string
		String edadString = String.valueOf(456);
		
		System.out.println("EL numero de digitos en edadString = " + edadString.length());
		//obteniendo el primer caracter
		System.out.println("EL numero de digitos en edadString = " + edadString + "es" + edadString.charAt(1));
		
		
		//-------------------------------------------------------------------------
		//Operadores numericos
		int opA = (int) 5.2;
		int opB = 6;
		int suma = opA + opB;
		int resta = opA - opB;
		int multiplica = (int)(opA*opB*1.01);
		double multiplicaDouble = (opA * opB * 1.01);
		int division = opA/opB;
		double divisionDouble = opA/opB;
		int residuo = opA % 2;
		
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplica);
		System.out.println(multiplicaDouble);
		System.out.println(division);
		System.out.println(divisionDouble);
		System.out.println("Residuo de 5%2: " + residuo);
		
		
		int valorInicial = 10;
		System.out.println("Preincremento " + ++valorInicial);
		System.out.println("Postincremento " + valorInicial++);
		System.out.println("Valor Final " + valorInicial);
		
		valorInicial = 33;
		System.out.println("Preincremento " + --valorInicial);
		System.out.println("Postincremento " + valorInicial--);
		System.out.println("Valor Final " + valorInicial);
		
		//operaciones con valores enteros
		byte edadGato = 10;
		short dobleDeEdad = (short)(edadGato * 2);//se pone ambos entre parentesis para el casteo
		
		//operadores comparativos
		//el resultado es boolean  <, <=, >. >=. ==, !=
		int numEmpleados = 1000;
		System.out.println("Empleados > a 1000 " + (numEmpleados > 1000));
		System.out.println("Empleados >= a 1000 " + (numEmpleados >= 1000));
		System.out.println("Empleados == a 1000 " + (numEmpleados == 1000));
		System.out.println("Empleados != a 1000 " + (numEmpleados != 1000));
		
		
		//Operadoese lógicos
		// &&    ||   !
		System.out.println("Empleados > 0 && Empleados < 2000: "+
							(numEmpleados > 0 && numEmpleados < 2000));
		
		boolean a = true;
		boolean b = true;
		boolean c = true;
		
		System.out.println( (a && b) || (a && c));  //ture
		System.out.println( a || b || c && a);	    //true
		System.out.println( !(a || b) && (!a || c));//flase
		System.out.println( a || b && c || a && b); //true
		
		
		//--------------------------------------------------------------------
		// Errores de ejecucion y compilacion
	}

}
