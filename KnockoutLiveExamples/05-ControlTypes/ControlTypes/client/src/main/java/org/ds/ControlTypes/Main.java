package org.ds.ControlTypes;

import java.util.Arrays;
import net.java.html.boot.BrowserBuilder;

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
    public static void onPageLoad() throws Exception {
        Data d = new Data();
        d.setStringValue("Hello");
        d.setPasswordValue("mypass");
        d.setBooleanValue(true);
        d.getOptionValues().addAll(Arrays.asList("Alpha", "Beta", "Gamma"));
        d.getCountryOptionValues().addAll(Arrays.asList(
            new Country("UK", 65000000),
            new Country("USA", 320000000),
            new Country("Sweden", 29000000)));
        d.setSelectedOptionValue("Gamma");
        d.getMultipleSelectedOptionValues().add("Alpha");
        d.setRadioSelectedOptionValue("Beta");
        d.applyBindings();
    }
}
