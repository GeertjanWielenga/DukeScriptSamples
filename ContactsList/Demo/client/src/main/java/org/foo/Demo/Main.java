package org.foo.Demo;

import java.util.Arrays;
import net.java.html.boot.BrowserBuilder;

public final class Main {

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
        d.setStateMessage("Tip: Click to Update, Double-Click to Delete");
        d.setIndex(-1);
        d.getWords().addAll(Arrays.asList("Tom", "Dick", "Harry"));
        d.applyBindings();
    }

}
