package ejemplo.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectoCuenta {
	 
    final int MIN_BALANCE = 10;
   
    // pointcut que hace referencia a Cuenta.retirar
//    pointcut llamadoARetirar(int valor, Cuenta cuenta) : 
//     call(boolean Cuenta.retirar(int)) && args(valor) && target(cuenta);
//   
     
    @Before("call(* *.*(..))")
    public void beforeAdvice() {
    System.out.println("Hello");
    }
 
//    // en lugar de ejecutar el método
//    boolean around(int valor, Cuenta cuenta) : llamadoARetirar(valor, cuenta) {
//        if (cuenta.balance - valor < MIN_BALANCE) {
//            return false;
//        }
//        return proceed(valor, cuenta);
//    }
// 
//    // después de ejecutar el método
//    after(int valor, Cuenta cuenta) : llamadoARetirar(valor, cuenta) {
//    }
}