package com.example.amst_primeraevalpractica_g2;


public class Pregunta {

    private String enundicado;
    private String urlImagenes;
    private String[] opcionesResp;
    private String respuestaCorrecta;

    public Pregunta(String enundicado, String urlImagenes, String[] opcionesResp, String respuestaCorrecta) {
        this.enundicado = enundicado;
        this.urlImagenes = urlImagenes;
        this.opcionesResp = opcionesResp;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void setEnundicado(String enundicado) {
        this.enundicado = enundicado;
    }

    public void setUrlImagenes(String urlImagenes) {
        this.urlImagenes = urlImagenes;
    }

    public void setOpcionesResp(String[] opcionesResp) {
        this.opcionesResp = opcionesResp;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getEnundicado() {
        return enundicado;
    }

    public String getUrlImagenes() {
        return urlImagenes;
    }

    public String[] getOpcionesResp() {
        return opcionesResp;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }


}

