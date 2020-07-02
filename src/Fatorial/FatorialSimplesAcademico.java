//autor: luiz carlos soares neto, lukaneto
package Fatorial;

public class FatorialSimplesAcademico {

	public static void main(String[] args) {
		int num = 10; //aqui você coloca quais numeros em ordem descrescente que deseja saber o fatorial.
		int fat = num;
		int decre;
		
		for(int i = 0;i <= num;i++){
			if(i == 0){
				System.out.println("O fatorial de 0 é 1");
			}else if(i == 1){
				System.out.println("O fatorial de 1 é 1");
			}else{
				decre = i-1;
				fat = i;
				while(decre!=0){
					
					fat *= decre;
					decre--;
				} 
				System.out.println("O fatorial de "+i+" é igual a "+fat);
			}
		}
	}

}
