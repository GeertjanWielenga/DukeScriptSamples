package org.ds.WorkingWithCollections;

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
        d.getPeople().add(new PersonData("Annabelle", "Arnie", "Anders", "Apple"));
        d.getPeople().add(new PersonData("Bertie", "Boutros-Boutros", "Brianna", "Barbie", "Bee-bop"));
        d.getPeople().add(new PersonData("Charles", "Cayenne", "Cleopatra"));
        d.applyBindings();
    }
}
