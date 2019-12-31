package ejemplo.aspectos;


public class Cuenta {
    int balance = 20;
 
    public  boolean retirar(int valor) {
        if (balance < valor) {
            return false;
        } 
        balance = balance - valor;
        return true;
    }
    public static void main(String[] args) {
    	Cuenta c=new Cuenta();
    	System.out.println("Hello 2");
		c.retirar(11);
	}
}