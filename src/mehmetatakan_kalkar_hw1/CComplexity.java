/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mehmetatakan_kalkar_hw1;

import java.io.FileWriter;       //Imported for using random integers and writing output to the text file.
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author ataka
 */
public class CComplexity {
        FileWriter fw ;             //Defining filewriter and printwriter in order to writing output to the txt file.
       PrintWriter pw ;
     public int[] timearray;        //Defining field for CComplexity Class
     
     
    
    public static void insertionsort(int[] dizi){    //Sorting algorithm methods   
      for (int i = 1; i < dizi.length; i++) {       //Insertion sort
int key = dizi[i];
int j = i - 1;
while (j >= 0 && key < dizi[j]) {
dizi[j + 1] = dizi[j];
j--;
}
dizi[j + 1] = key;

}  
      
      
  }
    public static void bubblesort(int [] data){        //Bubblesort
        
for (int i = data.length; i > 1; i--){
for (int j = 0; j < i-1; j++){
if (data[j] > data[j+1]){
int dummy = data[j];
data[j] = data[j+1];
data[j+1] = dummy;


}
}
}

    }
    public static int max(int [] data1, int n){       
int pos = 0;
for (int i = 1; i < n; i++)
if (data1[pos] < data1[i])
pos = i;
return pos;
}
public static void selectionsort(int data1[]){           //Selection Sort
    
    
for (int size = data1.length; size > 1; size--) {
int j = max(data1, size);
int dummy = data1[j];
data1[j] = data1[size-1];
data1[size-1] = dummy;
}

 
 
}
    
    public CComplexity(int[] timearray){   //Defining Constructor for CComplexity Class
       this.timearray=timearray;           //Using "this" reference variable for referring to current object.
      
      }
    
  

    public void ProduceResult(){    
        try{
        Random ran = new Random();       //using random class for fill arrays with random values.
     long newarray1[]= new long [timearray.length];     //Defining 3 array to keep processing time of the sorting algorithms for different size of arrays 
     long newarray2[]= new long [timearray.length];
     long newarray3[]= new long [timearray.length];
  for( int i=0;i<timearray.length;i++){     
     
      int [] array1 = new int [timearray[i]];        //Defining arrays which will be given to sorting algorithms and that array's size are assigned from timearray elements.
      int [] array2 = new int [timearray[i]];        //3 different array for 3 different sorting algorithm.
      int [] array3 = new int [timearray[i]];
                            
  for(int j=0;j<timearray[i];j++){       
      array1[j]=ran.nextInt();                //filling arrays with random integers and this arrays contain same elements for same size.
      array2[j]=array1[j];
      array3[j]=array1[j];   
      }
     if(timearray[i]>1000000){                    //this if conditional used for prevent sorting array which has size over 1000000.
           
     }
     else{
   long startTime = System.currentTimeMillis();      //Calculating the time of selection sort process and send them to newarray1 for each timearray's element.
    selectionsort(array1);
   long endTime = System.currentTimeMillis();
   long estimatedTime= endTime - startTime;
   newarray1[i]=estimatedTime;                    
     }
   if(i+1==timearray.length){             //Printing process happening at the last turn of the for loop and that makes my output similar to output which is given in HW
       System.out.println("Selection sort________");     
   for(int z=0;z<timearray.length;z++){
       if(timearray[z]>1000000){            //Controlling the timearray elements to detect whether element is greater than 1000000 or not.
           System.out.println("That element is greater than 1000000 ,therefore it has not been sorted.");  //Caution printed for timearrays element which are greater than 1000000.
       }
       else{
   System.out.println("in order to sort " +timearray[z]+" elements took "+ newarray1[z] +" milliseconds" );  
   }
                                                    //Printing operation provided with timearray for size and newarray for processing time.
   }
   }
   if(timearray[i]>1000000){                            //Perform same operations as selection sort for bubble sort.
         
     }
     else{
   long startTime2 = System.currentTimeMillis();          
    bubblesort(array2);
   long endTime2 = System.currentTimeMillis();
   long estimatedTime2= endTime2 - startTime2;
   newarray2[i]=estimatedTime2;
   }
   if(i+1==timearray.length){
       System.out.println("Bubble sort________");
   for(int z=0;z<timearray.length;z++){
       if(timearray[z]>1000000){
           System.out.println("That element is greater than 1000000 ,therefore it has not been sorted.");
       }
       else{
   System.out.println("in order to sort " +timearray[z]+" elements took "+ newarray2[z] +" milliseconds" );
   }
   }
   }
   if(timearray[i]>1000000){                                      //Perform same operations as selection sort for insertion sort.
     }
     else{
   long startTime3 = System.currentTimeMillis();                 
    insertionsort(array3);
   long endTime3 = System.currentTimeMillis();
   long estimatedTime3= endTime3 - startTime3;
   newarray3[i]=estimatedTime3;}
   if(i+1==timearray.length){
       System.out.println("Insertion sort________");
   for(int z=0;z<timearray.length;z++){
       if(timearray[z]>1000000){
           System.out.println("That element is greater than 1000000 ,therefore it has not been sorted.");
       }
       else{
   System.out.println("in order to sort " +timearray[z]+" elements took "+ newarray3[z] +" milliseconds" );
   }
   }
   }
    }
  
        }

 catch(NegativeArraySizeException e){                                           //Try catch used for non-positive size of array is not possible.
     System.out.println("You have entered non-positive number");
 }     
    }
    
   
    
    
    public void ProduceResult(String a) throws IOException{         //Overloading performing for ProduceResult function in order to write our output txt file.
    try{
        fw = new FileWriter(a);                                 //String "a" defined for where will the output will be written in out computer.
       pw = new PrintWriter(fw);
                                         //Perform same operations as ProduceResult() function but pw.println used instead of System.out.println in order to print ouput to the txt file
          Random ran = new Random();       
     long newarray1[]= new long [timearray.length];      
     long newarray2[]= new long [timearray.length];
     long newarray3[]= new long [timearray.length];
  for( int i=0;i<timearray.length;i++){     
     
      int [] array1 = new int [timearray[i]];       
      int [] array2 = new int [timearray[i]];        
      int [] array3 = new int [timearray[i]];
   
    
  for(int j=0;j<timearray[i];j++){       
      array1[j]=ran.nextInt();                            
      array2[j]=array1[j];
      array3[j]=array1[j];   
      }
     if(timearray[i]>1000000){ 
     }
     else{
   long startTime = System.currentTimeMillis();      
    selectionsort(array1);
   long endTime = System.currentTimeMillis();
   long estimatedTime= endTime - startTime;
   newarray1[i]=estimatedTime;                    
     }
   if(i+1==timearray.length){            
       pw.println("Selection sort________");     
   for(int z=0;z<timearray.length;z++){
       if(timearray[z]>1000000){
           pw.println("That element is greater than 1000000 ,therefore it has not been sorted.");  
       }
       else{
   pw.println("in order to sort " +timearray[z]+" elements took "+ newarray1[z] +" milliseconds" );
   }
   }
   }
   if(timearray[i]>1000000){
           
     }
     else{
   long startTime2 = System.currentTimeMillis();          
    bubblesort(array2);
   long endTime2 = System.currentTimeMillis();
   long estimatedTime2= endTime2 - startTime2;
   newarray2[i]=estimatedTime2;
   }
   if(i+1==timearray.length){
       pw.println("Bubble sort________");
   for(int z=0;z<timearray.length;z++){
       if(timearray[z]>1000000){
           pw.println("That element is greater than 1000000 ,therefore it has not been sorted.");
       }
       else{
   pw.println("in order to sort " +timearray[z]+" elements took "+ newarray2[z] +" milliseconds" );
   }
   }
   }
   if(timearray[i]>1000000){
     
     }
     else{
   long startTime3 = System.currentTimeMillis();                 
    insertionsort(array3);
   long endTime3 = System.currentTimeMillis();
   long estimatedTime3= endTime3 - startTime3;
   newarray3[i]=estimatedTime3;}
   if(i+1==timearray.length){
       pw.println("Insertion sort________");
   for(int z=0;z<timearray.length;z++){
       if(timearray[z]>1000000){
           pw.println("That element is greater than 1000000 ,therefore it has not been sorted.");
       }
       else{
   pw.println("in order to sort " +timearray[z]+" elements took "+ newarray3[z] +" milliseconds" );
   }
   }
   }
     
     
    }
  
}
     catch(NegativeArraySizeException e){
     pw.println("You have entered non-positive number");
     
 }
    pw.close();
    }
      

    }
