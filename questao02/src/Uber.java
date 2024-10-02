public class Uber {
    private double distancia;
    private int tempo_Espera;
    private double tarifaBase;
    private double fatorDemanda = 1.5;
    private double valorFinal;

    public void setDistancia(double distancia){
        this.distancia = distancia;
    }

    public double getDistancia(){
        return distancia;
    }

    public void setTempo_Espera(int tempo_Espera){
        this.tempo_Espera = tempo_Espera;
    }

    public int getTempo_Espera(){
        return tempo_Espera;
    }

    public void setTarifaBase(double tarifaBase){
        this.tarifaBase = tarifaBase;
    }

    public double getTarifaBase(){
        return tarifaBase;
    }

    public void setFatorDemanda(double fatorDemanda){
        this.fatorDemanda = fatorDemanda;
    }

    public double getFatorDemanda(){
        return fatorDemanda;
    }

    public void setValorFinal(double valorFinal){
        this.valorFinal = valorFinal;
    }

    public double getValorFinal(){
        return valorFinal;
    }

    public void calcularValorFinal(){
        valorFinal = (distancia * 2) + (tempo_Espera * 0.5) + (tarifaBase * fatorDemanda);
    }

    public void exibirDetalhesCorrida(){
        System.out.println("A distancia da corrida é de: " + distancia);
        System.out.println("Tempo de espera: " + tempo_Espera);
        System.out.println("Tarifa Base: " + tarifaBase);
        System.out.println("Valor final: " + valorFinal);
        System.out.println("O fator demanda foi de: " + fatorDemanda);

    }
}
