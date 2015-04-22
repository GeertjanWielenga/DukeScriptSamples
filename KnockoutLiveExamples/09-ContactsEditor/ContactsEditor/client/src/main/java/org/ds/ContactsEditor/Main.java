package org.ds.ContactsEditor;

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
        d.getContacts().addAll(Arrays.asList(
                new ContactData("Danny", "LaRusso",
                        new PhoneData("Mobile", "(555) 121-2121"),
                        new PhoneData("Home", "(555) 123-4567")),
                new ContactData("Sensei", "Miyagi",
                        new PhoneData("Mobile", "(555) 444-2222"),
                        new PhoneData("Home", "(555) 999-1212"))
        ));
        d.setLastSavedJson("");
        d.applyBindings();
    }
}
