package org.ds.ClickCounter;

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
        d.setNumberOfClicks(0);
        d.applyBindings();
    }
    
}
