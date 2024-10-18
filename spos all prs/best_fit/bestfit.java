import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class bestfit {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int memoryUtilize = 0;
System.out.println("Enter the number of jobs: ");
int jobno = scanner.nextInt();
System.out.println("Enter the number of blocks: ");
int blockno = scanner.nextInt();
int[] jobs = new int[jobno];
int[] blocks = new int[blockno];
boolean[] flag = new boolean[blockno];
int[] internalFrag = new int[jobno];
System.out.println("Enter the sizes of jobs: ");
for (int j = 0; j < jobno; j++) {
jobs[j] = scanner.nextInt();
}
System.out.println("Enter the sizes of blocks: ");
for (int i = 0; i < blockno; i++) {
blocks[i] = scanner.nextInt();
}
Integer[] blockIndices = new Integer[blockno];
for (int i = 0; i < blockno; i++) {
blockIndices[i] = i;
}
Arrays.sort(blockIndices, Comparator.comparingInt(i -> blocks[i]));
for (int j = 0; j < jobno; j++) {
int bestIndex = -1;
for (int i = 0; i < blockno; i++) {
int blockIndex = blockIndices[i];
if (jobs[j] <= blocks[blockIndex] && !flag[blockIndex]) {
if (bestIndex == -1 || blocks[blockIndex] < blocks[blockIndices[bestIndex]]) {
bestIndex = i;
}
}
}
if (bestIndex != -1) {
int blockIndex = blockIndices[bestIndex];
flag[blockIndex] = true;
memoryUtilize += jobs[j];
internalFrag[j] = blocks[blockIndex] - jobs[j];
System.out.println("\nJob " + j + " is fitted in block no. " + blockIndex + " with internal fragmentation: " + internalFrag[j]);
} else {
System.out.println("\nJob " + j + " cannot be allocated.");
}
}
System.out.println("\nTotal memory utilized: " + memoryUtilize);
System.out.println("\nInternal Fragmentation for each job: ");
for (int j = 0; j < jobno; j++) {
System.out.println("\nJob " + j + ": " + internalFrag[j]);
}
}
}


// import java.util.*;
// public class bestfit{


//     public static void main(String[] args) {
//         Scanner scanner new Scanner(System.in);
//         int memoryUtilize = 0;

//         System.out.println("Enter no. Of jobs:- ");
//         int jobno = scanner.nextInt();
        
//         System.out.println("Enter no. Of blocks:- ");
//         int blockno = scanner.nextInt();

//         int[] jobs = new int [jobno];
//         int [] blocks = new int [blockno];
//         boolean [] flag  = new boolean[blockno];
//         int [] internalflag = new int [jobno];

//         System.out.println("ENter The size of jobs");
//         for (int i = 0; i < jobno; i++) {
//             jobs[i] = sc.nextInt();
//         }

//         System.out.println("ENter The size of blocks");
//         for (int i = 0; i < jobno; i++) {
//             blocks[i] = sc.nextInt();
//         }

//         Integer[] blockIndices = new Integer [blockno];
//         for (int i = 0; i < jobno; i++) {
//             blockIndices[i] = i;
//         }

//         Arrays.sort(blockIndices,Comparator.comparingInt(i->blocks[i]));

//         for (int j = 0; j < jobno; j++) {
//             int bestfit= -1;
//             for (int k = 0; k < blockno; k++) {
//                 int blockIndex = blockIndices[k];
//                 if (jobs[j]<=blocks[blockIndex]&&!flag[blockIndex]) {
//                     if (bestIndex==-1 || blocks[blockIndex]<blocks[blockIndices[bestIndex]]) {
//                     bestIndex = k;
//                     }
//                 }
//             }
//             if (bestIndex!=-1) {
//                 int blockIndex = blockIndices[bestIndex];
//                 flag[blockIndex] = true;
//                 memoryUtilize += jobs[j];
//                 internalflag[j] = blocks[blockIndex] - jobs[j];
//                 System.out.println("\nJob"+"is fitted in block no. "+blockIndex + " with internal fragmentation"+ internalflag[j]);
            
//             }
//             else{
//                 System.out.println("\n Job "+ j+"cannot be allocated.");
//             }
//         }

//         System.out.println("\n Totsl memory utilized: "+ memoryUtilize);
//         System.out.println("\n Internal Fragmentation for each job: ");
//         for(int i =0;i<jobno;i++){
//             System.out.println("\n Job" +" :"+ internalflag[i]);
//         }

//     }

// }