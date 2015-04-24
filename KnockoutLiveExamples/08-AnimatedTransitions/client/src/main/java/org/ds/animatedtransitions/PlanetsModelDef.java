package org.ds.animatedtransitions;

import net.java.html.json.ComputedProperty;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "PlanetModel", properties = {
    @Property(name = "displayAdvancedOptions", type = boolean.class),
    @Property(name = "planets", type = Planet.class, array = true),
    @Property(name = "typeToShow", type = String.class)
}, targetId = "")
public class PlanetsModelDef {

    @Function
    public static void addPlanet(PlanetModel model, String data) {
        model.getPlanets().add(new Planet("new Planet", data));
    }
    

//    @ComputedProperty
//    public static List<Planet> planetsToShow(String typeToShow, List<Planet> planets) {
//        System.out.println("TypeToShow " + typeToShow);
//        ArrayList<Planet> resultList = new ArrayList<>();
//        for (Planet planet : planets) {
//            if (typeToShow.equals("all") || planet.getType().equals(typeToShow)  ) {
//                resultList.add(planet);
//            }
//            System.out.println("adding " + planet.getName());
//        }
//        return resultList;
//    }
    @Model(className = "Planet", properties = {
        @Property(name = "name", type = String.class),
        @Property(name = "type", type = String.class)
    })
    public static class PlanetDef {

    }
}
