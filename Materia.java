public class Materia {
    private String nommat;
    private int codigomat;

    public Materia() {
    }

    public String getNommat() {
        return nommat;
    }

    public void setNommat(String nommat) {
        this.nommat = nommat;
    }

    public int getCodigomat() {
        return codigomat;
    }

    public void setCodigomat(int codigomat) {
        this.codigomat = codigomat;
    }

    public String verDetmat(){
        String vdm = "\n" + "Materia " + "\t\t" +
                "Codigo Materia " + "\n" + this.nommat +  "\t\t" + this.codigomat;
        return vdm;
    }
}
