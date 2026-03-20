package com.fatec.ads;

public class Receita {
    private Consulta consulta;
    private Medico medico;
    private String data;
    private String descritivo;

    public Receita(Consulta consulta, Medico medico, 
        String data, String descritivo) {
        this.consulta = consulta;
        this.medico = medico;
        this.data = data;
        setDescritivo(descritivo);
    }

    public void preescrever(){};
    public void consultar(){}
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
    public void setDescritivo(String descritivo) throws Exception 
    {
         if(descritivo==null || descritivo.length()<=0)
            throw new Exception("Informe o descritvo do exame");
     
        this.descritivo = descritivo;
    }

    public Receita() {
    }

   
    public void mostrar() {
        var s = "Receita [getConsulta()=" + getConsulta() + ", getData()=" + getData() + ", getDescritivo()="
                + getDescritivo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
        System.out.println(s);
    };


    
}
