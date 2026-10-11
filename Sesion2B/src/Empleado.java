public class Empleado {

    
    public enum TipoEmpleado {
        VENDEDOR, ENCARGADO
    }

    public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horaExtra) {
        float salarioBase = 0f;
        float prima = 0f;
        float pagoHorasExtras = horaExtra * 30f; 
        
        if (tipo == TipoEmpleado.VENDEDOR) {
            salarioBase = 2000f;
        } else if (tipo == TipoEmpleado.ENCARGADO) {
            salarioBase = 2500f;
        }

   
        if (ventasMes >= 1500f) {
            prima = 200f;
        } else if (ventasMes >= 1000f) {
            prima = 100f;
        }

        return salarioBase + prima + pagoHorasExtras;
    }

    public float calculoNominaNeta(float nominaBruta) {
        float retencion = 0f;

      
        if (nominaBruta >= 2500f) {
            retencion = 0.18f; 
        } else if (nominaBruta >= 2100f) {
            retencion = 0.15f;
        } else {
            retencion = 0.0f; 
        }

        return nominaBruta * (1 - retencion);
    }
}