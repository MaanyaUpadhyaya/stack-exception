import java.util.Scanner;
 
class PushException extends Exception{ PushException(){
super("Stack is Full"); }
}
class PopException extends Exception{ PopException(){
super("Stack is empty"); }
}
public class Stack { int s[];
int top=-1; int size;
Stack(int size){ this.size=size;
s=new int[size]; }
void push(int item)throws PushException { if(top==size-1)
throw new PushException(); else
s[++top]=item;
}
void pop()throws PopException{ if(top==-1)
throw new PopException(); else
System.out.println("Poped item is: "+s[top--]);
}
public static void main(String[] args) { int ch,item;
Scanner sc=new Scanner(System.in); Stack ob=new Stack(3); System.out.println("1.Push 1.Pop 3.Exit"); while(true) {
System.out.print("Enter your choice: "); ch=sc.nextInt();
switch(ch) {
case 1:System.out.print("Enter the item: "); item=sc.nextInt();
try {
ob.push(item);
  
}
catch(PushException e) {
System.out.println(e); }
break;
case 2:try {
ob.pop(); }
catch(PopException e) { System.out.println(e);
}
break;
case 3:sc.close(); System.exit(0);
}
} }
}