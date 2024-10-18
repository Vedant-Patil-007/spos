// import java.util.*;
// public class mmt {
// public static void main(String[] args) {
// Scanner s = new Scanner(System.in);
// System.out.println("How many jobs do you want to enter: ");
// int j = s.nextInt();
// int job[] = new int[j];
// System.out.println("How many memory blocks do you want to enter: ");
// int m = s.nextInt();
// int mem[] = new int[m];
// int flag[] = new int[m];
// int allocation[] = new int[j];
// for (int i = 0; i < j; i++) {
// System.out.println("Enter the memory required for Job " + (i + 1) + ": ");
// job[i] = s.nextInt();
// allocation[i] = -1;
// }
// for (int i = 0; i < m; i++) {
// System.out.println("Enter the size of Memory Block " + (i + 1) + ": ");
// mem[i] = s.nextInt();
// flag[i] = 0;
// }
// for (int i = 0; i < j; i++) {
// for (int k = 0; k < m; k++) {
// if (job[i] <= mem[k] && flag[k] == 0) {
// allocation[i] = k;
// flag[k] = 1;
// System.out.println("Job " + (i + 1) + " allocated to Memory Block " + (k + 1));
// break;
// }
// }
// if (allocation[i] == -1) {
// System.out.println("Job " + (i + 1) + " could not be allocated.");
// }
// }
// System.out.println("\nJob No.\tJob Size\tAllocated Block");
// for (int i = 0; i < j; i++) {
// System.out.print((i + 1) + "\t" + job[i] + "\t\t");
// if (allocation[i] != -1) {
// System.out.println(allocation[i] + 1);
// } else {
// System.out.println("Not Allocated");
// }
// }
// }
// }


import java.util.*;
public class mmt {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("How many jobs do you want to enter: ");
int j = s.nextInt();
int job[] = new int[j];
System.out.println("How many memory blocks do you want to enter: ");
int m = s.nextInt();
int mem[] = new int[m];
int flag[] = new int[m];
int allocation[] = new int[j];
for (int i = 0; i < j; i++) {
System.out.println("Enter the memory required for Job " + (i + 1) + ": ");
job[i] = s.nextInt();
allocation[i] = -1;
}
for (int i = 0; i < m; i++) {
System.out.println("Enter the size of Memory Block " + (i + 1) + ": ");
mem[i] = s.nextInt();
flag[i] = 0;
}
for (int i = 0; i < j; i++) {
for (int k = 0; k < m; k++) {
if (job[i] <= mem[k] && flag[k] == 0) {
allocation[i] = k;
flag[k] = 1;
System.out.println("Job " + (i + 1) + " allocated to Memory Block " + (k + 1));
break;
}
}
if (allocation[i] == -1) {
System.out.println("Job " + (i + 1) + " could not be allocated.");
}
}
System.out.println("\nJob No.\tJob Size\tAllocated Block");
for (int i = 0; i < j; i++) {
System.out.print((i + 1) + "\t" + job[i] + "\t\t");
if (allocation[i]!= -1){
    System.out.println(allocation[i]+1);
}
else{
    System.out.println("Not Allocated");
}
}
}
}