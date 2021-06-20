package id.ac.uniska.model;

public class MataKuliah {

    int idpraktikum;
    String namapraktikum, singkatanpraktikum, namadosen, kontakdosen;
    boolean aktif;

    public MataKuliah(int idpraktikum, String namapraktikum, String singkatanpraktikum, String namadosen, String kontakdosen, boolean aktif) {
        this.idpraktikum = idpraktikum;
        this.namapraktikum = namapraktikum;
        this.singkatanpraktikum = singkatanpraktikum;
        this.namadosen = namadosen;
        this.kontakdosen = kontakdosen;
        this.aktif = aktif;
    }

    public int getIdpraktikum() {
        return idpraktikum;
    }

    public void setIdpraktikum(int idpraktikum) {
        this.idpraktikum = idpraktikum;
    }

    public String getNamapraktikum() {
        return namapraktikum;
    }

    public void setNamapraktikum(String namapraktikum) {
        this.namapraktikum = namapraktikum;
    }

    public String getSingkatanpraktikum() {
        return singkatanpraktikum;
    }

    public void setSingkatanpraktikum(String singkatanpraktikum) {
        this.singkatanpraktikum = singkatanpraktikum;
    }

    public String getNamadosen() {
        return namadosen;
    }

    public void setNamadosen(String namadosen) {
        this.namadosen = namadosen;
    }

    public String getKontakdosen() {
        return kontakdosen;
    }

    public void setKontakdosen(String kontakdosen) {
        this.kontakdosen = kontakdosen;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }
}
