package Logical_Program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Class2__compare_2_Interger_Arrays 
{
public static void main(String[] args) 
{
	
	int ar1[]= {10,20,40};
	int ar2[]= {30,60,90};
	int ar3[]= {30,60,90};
	
	System.out.println(Arrays.equals(ar1, ar2));
	System.out.println(Arrays.equals(ar1, ar3));
	System.out.println(Arrays.equals(ar3, ar2));

}
}
