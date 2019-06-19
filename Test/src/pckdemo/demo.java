package pckdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

class demo {
public static void main(String[] args) {
	int a=10;
	//Collection<Object> b=new ArrayList<Object>();
	LinkedList<Object> b=new LinkedList<Object>();
	genericMethod(a,b);
}
static <T> void genericMethod(T val, Collection<T> col){
	System.out.println("hi");
	
} 

}
