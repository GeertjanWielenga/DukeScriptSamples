package org.ds.animatedtransitions;

import net.java.html.boot.BrowserBuilder;
import net.java.html.json.Model;
import org.ds.animatedtransitions.js.CustomBinding;
import org.ds.animatedtransitions.js.JQuery;

public final class Main {
    private Main() {
    }
    
    public static void main(String... args) throws Exception {
        BrowserBuilder.newBrowser().
            loadPage("pages/index.html").
            loadClass(Main.class).
            invoke("onPageLoad", args).
            showAndWait();
        System.exit(0);
    }

    /**
     * Called when the page is ready.
     */
    public static void onPageLoad() throws Exception {

        PlanetModel planetModel = new PlanetModel();
        planetModel.getPlanets().add(new Planet("Mercury","rock"));
        planetModel.getPlanets().add(new Planet("Venus", "rock"));
        planetModel.getPlanets().add(new Planet("Earth", "rock"));
        planetModel.getPlanets().add(new Planet("Mars", "rock"));
        planetModel.getPlanets().add(new Planet("Jupiter", "gasgiant"));
        planetModel.getPlanets().add(new Planet("Saturn",  "gasgiant"));
        planetModel.getPlanets().add(new Planet("Uranus",  "gasgiant"));
        planetModel.getPlanets().add(new Planet("Neptune", "gasgiant"));
        planetModel.getPlanets().add(new Planet("Pluto", "rock"));
        planetModel.setTypeToShow("all");
        planetModel.setDisplayAdvancedOptions(true);
        planetModel.applyBindings();
    }

}
