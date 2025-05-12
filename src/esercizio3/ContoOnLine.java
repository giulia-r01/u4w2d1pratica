package esercizio3;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() + " - Saldo: " + getSaldo() + " - Num movimenti: " + getnMovimenti()
                + " - Massimo movimenti: " + getMaxMovimenti() + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaExeption {
        if (x <= maxPrelievo) {
            super.preleva(x);

        }else{
            throw new BancaExeption("Prelievo non disponibile");
        }


    }
}


