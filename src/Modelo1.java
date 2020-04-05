import java.util.Arrays;

public class Modelo1 {
	public String suma1(String num) {
		return "Sin hacer";
	}

	public int comprobarCP(String cp) {
		int con = 0;
		if (cp.length() != 5) {
			return 2;
		} else {
			for (int i = 0; i < cp.length(); i++) {
				int tabla_ascii = cp.charAt(i);
				if (tabla_ascii > 47 && tabla_ascii < 58) {
					con++;
				} else {
					return 3;
				}
			}
		}
		return 1;
	}

	public String mayusculas(String palabra) {
		String palabraDefinitiva = "";
		palabra = palabra.toLowerCase();
		char[] arrayCaracteres = palabra.toCharArray();
		for (int i = 0; i < palabra.length(); i++) {
			int ascii = palabra.charAt(i);
			if (ascii == 97 || ascii == 101 || ascii == 111 || ascii == 105 || ascii == 117) {
				arrayCaracteres[i] = Character.toUpperCase(arrayCaracteres[i]);
			}
			palabraDefinitiva = palabraDefinitiva + arrayCaracteres[i];
		}
		return palabraDefinitiva;
	}

	public String orden(String[] nums) {
		String ordenadosParesImpares = "";
		String impares = "";
		int[] numeros = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			numeros[i] = Integer.parseInt(nums[i]);
		}
		Arrays.sort(numeros);
		for (int i : numeros) {
			System.out.println(i);
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				ordenadosParesImpares += Integer.toString(numeros[i]);
			} else {
				impares += Integer.toString(numeros[i]);
			}
		}
		ordenadosParesImpares += impares;
		return ordenadosParesImpares;
	}
}
