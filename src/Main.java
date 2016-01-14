import java.util.Scanner;

public class Main {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = input.nextLine();
		System.out.println("Text encrypted:");
		System.out.println(encryption(text));
		System.out.println("Text decrypted:");
		System.out.println(dencryption(encryption(text)));
	}
	
	public static String encryption(String text){
		String temp = "";
		for (int i = 0; i < text.length(); i++) {
			temp = temp.concat(encryptChar(Character.toString(text.charAt(i))));
		}
		return temp;
	}
	
	public static String dencryption(String text){
		String temp;
		String newText = "";
		for (int i = 0; i < text.length(); i=i+3) {
			temp = "";
			temp = temp.concat(Character.toString(text.charAt(i)));
			temp = temp.concat(Character.toString(text.charAt(i+1)));
			temp = temp.concat(Character.toString(text.charAt(i+2)));
			newText = newText.concat(decryptChar(temp));
		}
		return newText;
	}
	
	public static String encryptChar(String c){
		switch (c) {
		case "a":
			c = "3dE";
			break;
		case "b":
			c = "A2s";
			break;
		case "c":
			c = "F9q";
			break;
		case "d":
			c = "99v";
			break;
		case "e":
			c = "6gT";
			break;
		case "f":
			c = "HJx";
			break;
		case "g":
			c = "94f";
			break;
		case "h":
			c = "DAw";
			break;
		case "i":
			c = "5Jt";
			break;
		case "j":
			c = "McC";
			break;
		case "k":
			c = "3Fs";
			break;
		case "l":
			c = "7Gs";
			break;
		case "m":
			c = "04g";
			break;
		case "n":
			c = "5Rf";
			break;
		case "o":
			c = "KKd";
			break;
		case "p":
			c = "gW1";
			break;
		case "q":
			c = "gFx";
			break;
		case "r":
			c = "yEh";
			break;
		case "s":
			c = "o99";
			break;
		case "t":
			c = "Aeb";
			break;
		case "u":
			c = "loa";
			break;
		case "v":
			c = "xFe";
			break;
		case "w":
			c = "Tne";
			break;
		case "x":
			c = "tMu";
			break;
		case "y":
			c = "Ae4";
			break;
		case "z":
			c = "lpr";
		case "A":
			c = "Gr4";
			break;
		case "B":
			c = "h99";
			break;
		case "C":
			c = "Avr";
			break;
		case "D":
			c = "5Ge";
			break;
		case "E":
			c = "6HT";
			break;
		case "F":
			c = "plW";
			break;
		case "G":
			c = "Vrs";
			break;
		case "H":
			c = "Tjd";
			break;
		case "I":
			c = "Ewh";
			break;
		case "J":
			c = "Tnd";
			break;
		case "K":
			c = "Rw2";
			break;
		case "L":
			c = "46F";
			break;
		case "M":
			c = "Hrd";
			break;
		case "N":
			c = "H3K";
			break;
		case "O":
			c = "xSf";
			break;
		case "P":
			c = "rbD";
			break;
		case "Q":
			c = "88v";
			break;
		case "R":
			c = "ge2";
			break;
		case "S":
			c = "g0K";
			break;
		case "T":
			c = "LLl";
			break;
		case "U":
			c = "lep";
			break;
		case "V":
			c = "3Hm";
			break;
		case "W":
			c = "rwU";
			break;
		case "X":
			c = "loF";
			break;
		case "Y":
			c = "Aoe";
			break;
		case "Z":
			c = "Qwt";
		case "0":
			c = "Yrg";
			break;
		case "1":
			c = "y5o";
			break;			
		case "2":
			c = "cRR";
			break;			
		case "3":
			c = "57g";
			break;			
		case "4":
			c = "Ktg";
			break;			
		case "5":
			c = "35f";
			break;			
		case "6":
			c = "uiQ";
			break;			
		case "7":
			c = "Thi";
			break;			
		case "8":
			c = "4tS";
			break;			
		case "9":
			c = "c3H";
			break;			
		case " ":
			c = "cbJ";
			break;			
		default:
			break;
		}
		return c;
	}
	
	public static String decryptChar(String c){
		switch (c) {
		case "3dE":
			c = "a";
			break;
		case "A2s":
			c = "b";
			break;
		case "F9q":
			c = "c";
			break;
		case "99v":
			c = "d";
			break;
		case "6gT":
			c = "e";
			break;
		case "HJx":
			c = "f";
			break;
		case "94f":
			c = "g";
			break;
		case "DAw":
			c = "h";
			break;
		case "5Jt":
			c = "i";
			break;
		case "McC":
			c = "j";
			break;
		case "3Fs":
			c = "k";
			break;
		case "7Gs":
			c = "l";
			break;
		case "04g":
			c = "m";
			break;
		case "5Rf":
			c = "n";
			break;
		case "KKd":
			c = "o";
			break;
		case "gW1":
			c = "p";
			break;
		case "gFxq":
			c = "gFx";
			break;
		case "yEh":
			c = "r";
			break;
		case "o99":
			c = "s";
			break;
		case "Aeb":
			c = "t";
			break;
		case "loa":
			c = "u";
			break;
		case "xFe":
			c = "v";
			break;
		case "Tne":
			c = "w";
			break;
		case "tMu":
			c = "x";
			break;
		case "Ae4":
			c = "y";
			break;
		case "lpr":
			c = "z";
		case "Gr4":
			c = "A";
			break;
		case "h99":
			c = "B";
			break;
		case "Avr":
			c = "C";
			break;
		case "5Ge":
			c = "D";
			break;
		case "6HT":
			c = "E";
			break;
		case "plW":
			c = "F";
			break;
		case "Vrs":
			c = "G";
			break;
		case "Tjd":
			c = "H";
			break;
		case "Ewh":
			c = "I";
			break;
		case "Tnd":
			c = "J";
			break;
		case "Rw2":
			c = "K";
			break;
		case "46F":
			c = "L";
			break;
		case "Hrd":
			c = "M";
			break;
		case "H3K":
			c = "N";
			break;
		case "xSf":
			c = "O";
			break;
		case "rbD":
			c = "P";
			break;
		case "88v":
			c = "Q";
			break;
		case "ge2":
			c = "R";
			break;
		case "g0K":
			c = "S";
			break;
		case "LLl":
			c = "T";
			break;
		case "lep":
			c = "U";
			break;
		case "3Hm":
			c = "V";
			break;
		case "rwU":
			c = "W";
			break;
		case "loF":
			c = "X";
			break;
		case "Aoe":
			c = "Y";
			break;
		case "Qwt":
			c = "Z";
		case "Yrg":
			c = "0";
			break;
		case "y5o":
			c = "1";
			break;			
		case "cRR":
			c = "2";
			break;			
		case "57g":
			c = "3";
			break;			
		case "Ktg":
			c = "4";
			break;			
		case "35f":
			c = "5";
			break;			
		case "uiQ":
			c = "6";
			break;			
		case "Thi":
			c = "7";
			break;			
		case "4tS":
			c = "8";
			break;			
		case "c3H":
			c = "9";
			break;			
		case "cbJ":
			c = " ";
			break;			
		default:
			break;
		}
		return c;
	}

}
