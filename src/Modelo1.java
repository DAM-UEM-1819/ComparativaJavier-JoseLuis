import java.util.Arrays;

public class Modelo1 {
	public String suma1(String num) {
		int numero=Integer.parseInt(num);
		numero++;
		int decimal=Integer.parseInt(num,16);  
		decimal++;
		String letra="";
		if(numero<10) {
			return num;
		}else {
			if(numero==10) {
				letra="a";
			}else if(numero==11) {
				letra="b";
			}else if(numero==12) {
				letra="c";
			}else if(numero==13) {
				letra="d";
			}else if(numero==14) {
				letra="e";
			}
			else if(numero==15) {
				letra="f";
			}
		}
			return letra;
		}  

	public int comprobarCP(String cp) {
		if (cp.length() != 5) {
			return 2;
		} else {
			for (int j = 0; j < cp.length(); j++) {
				int valorascii = (int) cp.charAt(j);
				if (valorascii > 47 && valorascii < 58) {
				} else {
					return 3;
				}
			}
		}
		return 1;
	}

	public String mayusculas(String palabra) {
		String aux = "";
		char[] letraarray = palabra.toCharArray();
		for (int i = 0; i < palabra.length(); i++) {
			int valorascii = (int) palabra.charAt(i);
			if (valorascii == 97 || valorascii == 101 || valorascii == 105 || valorascii == 111 || valorascii == 117) {
				letraarray[i] = Character.toUpperCase(letraarray[i]);
			}
			aux = aux + letraarray[i];
		}
		return aux;
	}

	public String orden(String[] nums) {
		String pares = "";
		String ordenados = "";
		int[] aux = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			aux[i] = Integer.parseInt(nums[i]);
		}
		Arrays.sort(aux);
		for (int i : aux) {
			System.out.println(i);
		}
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] % 2 != 0) {
				ordenados += Integer.toString(aux[i]);
			} else {
				pares += Integer.toString(aux[i]);
			}
		}
		ordenados += pares;
		return ordenados;
	}
}
