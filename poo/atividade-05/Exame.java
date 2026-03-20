package com.fatec.ads;

public class Exame {
    private String data;
    private String descritivo;
    private Consulta consulta;
    private Medico medico; // Associação

    public void solicitar(){}
    public void consultar(){}

    public Exame(String data, String descritivo,
        Consulta consulta, Medico medico) {
        this.consulta = consulta;
        this.data = data;
        this.descritivo = descritivo;
        this.medico = medico;
    }

    public String getConsulta() {
        return consulta;
    }
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) throws Exception {
        if(descritivo==null || descritivo.length()<=0)
            throw new Exception("Informe o descritvo do exame");
        this.descritivo = descritivo;
    }

    public Exame() {
    }
   
    public void mostrar() {
        var s = "Exame [getConsulta()=" + getConsulta() + ", getData()=" + getData() + ", getDescritivo()="
                + getDescritivo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
        System.out.println(s);
    }

    
    
}
