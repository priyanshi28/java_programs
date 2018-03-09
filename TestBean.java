class Hello {
private int i ;
public void setValue(int i){
this.i=i;
}
public int getValue(){

return i;
}
}
class TestBean {
public static void main(String arg[])
{
Hello h = new Hello();
h.setValue(10);
int j = h.getValue();
System.out.println(j);
}
}

