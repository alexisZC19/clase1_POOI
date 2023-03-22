

/*Autor: Zavaleta Cruz Jonathan Alexis *
/*
/*
/*


*
***************************************/
package tareaMetodo;

public class burbuja1 {

public static void main(String[] args) {
int[] numeros = {5, 2, 8, 3, 1, 6, 9, 7, 4};
int n = numeros.length;
int temp = 0;

System.out.println("Arreglo original:");
for(int i=0; i < n; i++){
System.out.print(numeros[i] + " ");
}

for(int i=0; i < n; i++){
for(int j=1; j < (n-i); j++){
if(numeros[j-1] > numeros[j]){
// Intercambia los elementos
temp = numeros[j-1];
numeros[j-1] = numeros[j];
numeros[j] = temp;
}
}
}

System.out.println("\nArreglo ordenado:");
for(int i=0; i < n; i++){
System.out.println(numeros[i] + " ");
}
}
}