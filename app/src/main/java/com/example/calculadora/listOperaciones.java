package com.example.calculadora;

public class listOperaciones {
    private String operacion;
    private String Resultado;

    public listOperaciones(String operacion, String resultado) {
        this.operacion = operacion;
        Resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String resultado) {
        Resultado = resultado;
    }
}
