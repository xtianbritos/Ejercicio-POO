public class Juego {

    private Integer numeroVidas;
    private final Integer numeroVidasInicial;
    private static Integer record = 0;

    public Juego(Integer numeroVidas) {
        this.numeroVidas = numeroVidas;
        this.numeroVidasInicial = numeroVidas;
    }

    public void muestraVidasRestantes() {
        System.out.println("El número de vidas que le quedan al jugador en la partida actual es: "+numeroVidas);
    }

    public boolean quitaVida() {
        numeroVidas--;

        if (numeroVidas == 0) {
            System.out.println("JUEGO TERMINADO");
            return false;
        }
        return true;
    }

    public void reiniciaPartida() {
        numeroVidas = numeroVidasInicial;
    }

    public Integer numeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(Integer numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public void actualizaRecord() {
        if (record == numeroVidas) {
            System.out.println("Se ha alcanzado el récord");
        }else if (record < numeroVidas) {
            record = numeroVidas;
            System.out.println("Se ha batido el récord. El nuevo récord es: "+record);
        }


    }
}
