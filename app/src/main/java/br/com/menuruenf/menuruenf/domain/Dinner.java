package br.com.menuruenf.menuruenf.domain;


/**
 * Created by Rodolfo on 08/09/2015.
 */
public class Dinner {


    private String id;
    private String date;
    private String salad;
    private String juice;
    private String protein1;
    private String protein2;
    private String protein3;
    private String garnish;
    private String accompaniment;
    private String url;
    private String dessert;


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getDate() {
        return date;
    }



    public void setDate(String date) {
        this.date = date;
    }



    public String getSalad() {
        return salad;
    }



    public void setSalad(String salad) {
        this.salad = salad;
    }



    public String getAccompaniment() {
        return accompaniment;
    }


    public void setAccompaniment(String accompaniment) {
        this.accompaniment = accompaniment;
    }



    public String getGarnish() {
        return garnish;
    }



    public void setGarnish(String garnish) {
        this.garnish = garnish;
    }



    public String getProtein1() {
        return protein1;
    }


    public void setProtein1(String protein1) {
        this.protein1 = protein1;
    }



    public String getProtein2() {
        return protein2;
    }



    public void setProtein2(String protein2) {
        this.protein2 = protein2;
    }



    public String getProtein3() {
        return protein3;
    }


    public void setProtein3(String protein3) {
        this.protein3 = protein3;
    }



    public String getDessert() {
        return dessert;
    }



    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getJuice() {
        return juice;
    }


    public void setJuice(String juice) {
        this.juice = juice;
    }



    public String getUrl() {
        return url;
    }



    public void setUrl(String url) {
        this.url = url;
    }
}
