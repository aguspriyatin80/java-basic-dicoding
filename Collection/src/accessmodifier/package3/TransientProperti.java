package accessmodifier.package3;

import java.io.Serializable;

public class TransientProperti implements Serializable{
            // Variabel ini tidak akan dijaga nilainya
            transient int nilaiA = 2;

            // Variabel ini akan dijaga nilainya
            double nilaiB = 3;
            String nilaiC;

    public double getNilaiB() {
        return nilaiB;
    }

    public void setNilaiB(double nilaiB) {
        this.nilaiB = nilaiB;
    }

    public String getNilaiC() {
        return nilaiC;
    }

    public void setNilaiC(String nilaiC) {
        this.nilaiC = nilaiC;
    }

    TransientProperti(){}


    }

