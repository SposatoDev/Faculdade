package com.fatec.ads;

import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private String hora;
    private String data;
    private Medico medico; // Agregação (Referência o objeto Médico)
    private Paciente paciente;
    private String motivo;
    private String historico;

    private List<Receita> receitas; // Composição

    public Consulta(Medico medico, Paciente paciente, 
        String hora, String data, String motivo, String historico) {
        this.hora = hora;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        setMotivo(motivo);
        this.historico = historico;
        this.receitas = new ArrayList<>();
    }

    public void marcar(){};
    public void cancelar(){};
    public void consultar(){};
    public void realizar(){};
    public void atualizar(){}
    
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) throws Exception  {
        if(motivo==null || motivo.length() <= 0 ) 
            throw  new Exception("Motivo da consulta e obrigatorio !!");
        this.motivo = motivo;
    }
    public String getHistorico() {
        return historico;
    }
    public void setHistorico(String historico) {
        this.historico = historico;
    }
    

    public Consulta() {
        this.receitas = new ArrayList<>();
    }


    public void mostrar() {
        var s = "Consulta [getHora()=" + getHora() + ", getData()=" + getData() + ", getMedico()=" + getMedico()
                + ", getPaciente()=" + getPaciente() + ", getMotivo()=" + getMotivo() + ", getHistorico()="
                + getHistorico() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
        System.out.println(s);
    };

    

}
