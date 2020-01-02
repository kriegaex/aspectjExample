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
}
