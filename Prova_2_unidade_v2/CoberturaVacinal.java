package Prova_2_unidade_v2;

public class CoberturaVacinal {
    private String municipio;
    private String estado;
    private int habitantes;
    private int habitantesImunizados;

    public CoberturaVacinal(String m, String e, int h ) {
        this.municipio = m;
        this.estado = e;
        this.habitantes = h;
        this.habitantesImunizados = 0;

    }
    public String getMunicipio() {
        return municipio;
    }
    public String getEstado() {
        return estado;
    }
    public int getHabitantes() {
        return habitantes;
    }
    public int getHabitantesImunizados() {
        return habitantesImunizados;
    }

    public void atualizarCobertura(int qtd) {
        this.habitantesImunizados += qtd;
    }
    public int getHabitantesSemCobertura() {
        return this.habitantes - this.habitantesImunizados;
    }
    public double getPercentualCobertura() {
        return (double)this.habitantesImunizados / this.habitantes * 100;
    } 
    
}
