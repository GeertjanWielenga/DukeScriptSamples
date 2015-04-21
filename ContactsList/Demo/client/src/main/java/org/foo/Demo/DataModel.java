package org.foo.Demo;

import java.util.Arrays;
import java.util.List;
import net.java.html.json.ComputedProperty;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(
        className = "Data",
        targetId = "",
        properties = {
            @Property(name = "contact", type = String.class),
            @Property(name = "stateMessage", type = String.class),
            @Property(name = "words", type = String.class, array = true),
            @Property(name = "index", type = int.class),
            @Property(name = "updated", type = String.class)
        })
final class DataModel {

    @ComputedProperty
    static boolean okenabled(String contact) {
        return contact != null && contact.length() > 0;
    }

    @Function
    static void editContact(Data model, String data) {
        model.setContact(data);
        model.setStateMessage("You are working on: " + data);
        final List<String> words = model.getWords();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word.equals(data)) {
                model.setIndex(i);
            }
        }
    }

    @Function
    static void updateContacts(Data model) {
        String contact = model.getContact();
        final List<String> words = model.getWords();
        if (model.getIndex() != -1) {
            words.set(model.getIndex(), contact);
            model.setStateMessage("You have updated: " + contact);
        } else {
            model.setStateMessage("You have added: " + contact);
            words.add(contact);
        }
        model.setIndex(-1);
        model.setContact("");
    }

    @Function
    static void deleteContact(Data model, String data) {
        String contact = data;
        if (model.getWords().contains(contact)) {
            model.getWords().remove(contact);
            model.setContact("");
            model.setStateMessage("You have deleted a contact: " + contact);
            model.setIndex(-1);
        }
    }

    @Function
    static void resetContacts(Data model, String data) {
        List<String> words = model.getWords();
        words.clear();
        words.addAll(Arrays.asList("Tom", "Dick", "Harry"));
        model.setContact("");
        model.setStateMessage("You have refreshed the contacts.");
    }

}
