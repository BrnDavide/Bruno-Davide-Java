package lezione5;

public class Bottiglia {
   private int capacita;
   private int quantita;

    public Bottiglia(int capacita) {
        this.capacita = capacita;
        this.quantita=0;
    }

    public Bottiglia(int capacita, int quantita) {
        this.capacita = capacita;
        this.quantita = quantita;

    }

    //metodo non statico. Void perché non ritorna nulla
    public void riempi(int quantita){
        this.quantita +=quantita;
        if (this.quantita>capacita){
            this.quantita=capacita;
        }
        //Soluzione da 1 riga
        //this.quantita=Math.min(this.capacita, this.quantita+quantita)
    }
    public void svuota(int quantita){
        this.quantita-=quantita;
        if (this.quantita<0){
            this.quantita=0;
        }
        //soluz. da 1 riga
        //this.quantita= Math.max(0, this.quantita-quantita)
        /*Restituisce il valore max tra 0(nel caso la quantità andasse sottozero) e il risultato
        * della sottrazione che eseguiamo*/
    }
    @Override
    public String toString() {
        return "Bottiglia: " +
                "capacita=" + capacita +
                ", quantita=" + quantita;
    }
}//end class
