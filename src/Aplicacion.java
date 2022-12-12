public class Aplicacion {

    public static void main(String[] args) {
        Juego juego = new Juego(5);
        juego.muestraVidasRestantes();
        juego.setNumeroVidas(juego.numeroVidas()-1);
        juego.muestraVidasRestantes();

        Juego juego2 = new Juego(5);
        juego2.muestraVidasRestantes();
        juego.muestraVidasRestantes();

        juego.quitaVida();
        juego.muestraVidasRestantes();
        juego.reiniciaPartida();
        juego.muestraVidasRestantes();

        juego.actualizaRecord();
        juego2.actualizaRecord();
    }
}
