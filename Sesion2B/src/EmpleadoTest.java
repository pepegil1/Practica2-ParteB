import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

    @Test
    void testNominaBrutaVendedor() {
        Empleado emp = new Empleado();
        
        assertEquals(2000f, emp.calculoNominaBruta(Empleado.TipoEmpleado.VENDEDOR, 500f, 0f));
        
        	
        assertEquals(2160f, emp.calculoNominaBruta(Empleado.TipoEmpleado.VENDEDOR, 1000f, 2f));
        
        
        assertEquals(2200f, emp.calculoNominaBruta(Empleado.TipoEmpleado.VENDEDOR, 1500f, 0f));
    }

    @Test
    void testNominaBrutaEncargado() {
        Empleado emp = new Empleado();
        
        
        assertEquals(2730f, emp.calculoNominaBruta(Empleado.TipoEmpleado.ENCARGADO, 1500f, 1f));
    }

    @Test
    void testNominaNetaValoresLimite() {
        Empleado emp = new Empleado();
        
        
        assertEquals(2000f, emp.calculoNominaNeta(2000f), 0.01f);
        
        
        assertEquals(1785f, emp.calculoNominaNeta(2100f), 0.01f);
        
        
        assertEquals(1955f, emp.calculoNominaNeta(2300f), 0.01f);
        
        
        assertEquals(2050f, emp.calculoNominaNeta(2500f), 0.01f);
    }
}