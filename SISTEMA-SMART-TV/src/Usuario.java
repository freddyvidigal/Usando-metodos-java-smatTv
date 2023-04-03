public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("SmartTV ligada? : " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarcanal(5);

        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.ligar();
        System.out.println("SmartTV ligada? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("SmartTV ligada? : " + smartTv.ligada);

    }
}
