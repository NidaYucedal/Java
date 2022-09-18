package day33_encapsulation;

public class Araba {


    String marka="marka belirtilmedi";//markanin access modifieri default oldugundan package icinde kullanilir
    private String model="model belirtilmedi";
    private String yakit="Elektirikli"; //tum arabalar elektirikli ise bu variablein degistirlmemesi lazim


    //private yaptigimiz model ve yaki variablelarina erisimi yetkilendirelim
    //modele deger atanabilsin ama gorulrmesin(setter)
    //yakit ise gorulebilsin ama yeni deger atanamasin(getter)
    //

    public void setModel(String model) {
        this.model = model;
    }


    public String getYakit() {
        return yakit;
    }




}
