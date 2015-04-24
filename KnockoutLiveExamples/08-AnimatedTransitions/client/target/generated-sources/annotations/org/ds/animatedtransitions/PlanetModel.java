package org.ds.animatedtransitions;
import net.java.html.json.*;
public final class PlanetModel implements Cloneable {
  private static final Html4JavaType TYPE = new Html4JavaType();
  private final org.netbeans.html.json.spi.Proto proto;
  public java.util.List<Planet> getPlanetsToShow() {
    java.lang.String arg1 = getTypeToShow();
    java.util.List<Planet> arg2 = getPlanets();
    try {
      proto.acquireLock("planetsToShow");
      return org.ds.animatedtransitions.PlanetsModelDef.planetsToShow(arg1, arg2);
    } finally {
      proto.releaseLock();
    }
  }
  private boolean prop_displayAdvancedOptions;
  public boolean isDisplayAdvancedOptions() {
    proto.accessProperty("displayAdvancedOptions");
    return prop_displayAdvancedOptions;
  }
  public void setDisplayAdvancedOptions(boolean v) {
    proto.verifyUnlocked();
    if (TYPE.isSame(prop_displayAdvancedOptions, v)) return;
    Object o = prop_displayAdvancedOptions;
    prop_displayAdvancedOptions = v;
    proto.valueHasMutated("displayAdvancedOptions", o, v);
  }
  private final java.util.List<Planet> prop_planets;
  public java.util.List<Planet> getPlanets() {
    proto.accessProperty("planets");
    return prop_planets;
  }
  private java.lang.String prop_typeToShow;
  public java.lang.String getTypeToShow() {
    proto.accessProperty("typeToShow");
    return prop_typeToShow;
  }
  public void setTypeToShow(java.lang.String v) {
    proto.verifyUnlocked();
    if (TYPE.isSame(prop_typeToShow, v)) return;
    Object o = prop_typeToShow;
    prop_typeToShow = v;
    proto.valueHasMutated("typeToShow", o, v);
    proto.valueHasMutated("planetsToShow", null, getPlanetsToShow());
  }
  private static Class<PlanetsModelDef> modelFor() { return null; }
  private PlanetModel(net.java.html.BrwsrCtx context) {
    this.proto = TYPE.createProto(this, context);
    this.prop_planets = proto.createList("planets", -1, "planetsToShow");
  };
  public PlanetModel() {
    this(net.java.html.BrwsrCtx.findDefault(PlanetModel.class));
  };
  public PlanetModel(boolean aDisplayAdvancedOptions, java.lang.String aTypeToShow, Planet... aPlanets) {
    this(net.java.html.BrwsrCtx.findDefault(PlanetModel.class));
    this.prop_displayAdvancedOptions = aDisplayAdvancedOptions;
    this.prop_typeToShow = aTypeToShow;
    proto.initTo(this.prop_planets, aPlanets);
  };
  private static class Html4JavaType extends org.netbeans.html.json.spi.Proto.Type<PlanetModel> {
    private Html4JavaType() {
      super(PlanetModel.class, PlanetsModelDef.class, 4, 1);
      registerProperty("planetsToShow", 0, true);
      registerProperty("displayAdvancedOptions", 1, false);
      registerProperty("planets", 2, false);
      registerProperty("typeToShow", 3, false);
      registerFunction("addPlanet", 0);
    }
    @Override public void setValue(PlanetModel data, int type, Object value) {
      switch (type) {
        case 1: data.setDisplayAdvancedOptions(TYPE.extractValue(java.lang.Boolean.class, value)); return;
        case 2: TYPE.replaceValue(data.getPlanets(), Planet.class, value); return;
        case 3: data.setTypeToShow(TYPE.extractValue(java.lang.String.class, value)); return;
      }
      throw new UnsupportedOperationException();
    }
    @Override public Object getValue(PlanetModel data, int type) {
      switch (type) {
        case 0: return data.getPlanetsToShow();
        case 1: return data.isDisplayAdvancedOptions();
        case 2: return data.getPlanets();
        case 3: return data.getTypeToShow();
      }
      throw new UnsupportedOperationException();
    }
    @Override public void call(PlanetModel model, int type, Object data, Object ev) throws Exception {
      switch (type) {
        case 0:
          org.ds.animatedtransitions.PlanetsModelDef.addPlanet(model, model.proto.toString(data, null));
          return;
      }
      throw new UnsupportedOperationException();
    }
    @Override public org.netbeans.html.json.spi.Proto protoFor(Object obj) {
      return ((PlanetModel)obj).proto;    }
    @Override public void onChange(PlanetModel model, int type) {
      switch (type) {
    }
      throw new UnsupportedOperationException();
    }
  @Override public void onMessage(PlanetModel model, int index, int type, Object data, Object[] params) {
    switch (index) {
    }
    throw new UnsupportedOperationException("index: " + index + " type: " + type);
  }
    @Override public PlanetModel read(net.java.html.BrwsrCtx c, Object json) { return new PlanetModel(c, json); }
    @Override public PlanetModel cloneTo(PlanetModel o, net.java.html.BrwsrCtx c) { return o.clone(c); }
  }
  private PlanetModel(net.java.html.BrwsrCtx c, Object json) {
    this(c);
    Object[] ret = new Object[3];
    proto.extract(json, new String[] {
      "displayAdvancedOptions",
      "planets",
      "typeToShow",
    }, ret);
    this.prop_displayAdvancedOptions = ret[0] == null ? false : (TYPE.boolValue(ret[0])).booleanValue();
    if (ret[1] instanceof Object[]) {
      for (Object e : ((Object[])ret[1])) {
        this.prop_planets.add(proto.read(Planet.class, e));
      }
    }
    this.prop_typeToShow = (java.lang.String)ret[2];
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('{');
    sb.append('"').append("displayAdvancedOptions").append('"').append(":");
    sb.append(TYPE.toJSON(prop_displayAdvancedOptions));
    sb.append(',');
    sb.append('"').append("planets").append('"').append(":");
    sb.append(TYPE.toJSON(prop_planets));
    sb.append(',');
    sb.append('"').append("typeToShow").append('"').append(":");
    sb.append(TYPE.toJSON(prop_typeToShow));
    sb.append('}');
    return sb.toString();
  }
  public PlanetModel clone() {
    return clone(proto.getContext());
  }
  private PlanetModel clone(net.java.html.BrwsrCtx ctx) {
    PlanetModel ret = new PlanetModel(ctx);
    ret.prop_displayAdvancedOptions = prop_displayAdvancedOptions;
    proto.cloneList(ret.prop_planets, ctx, prop_planets);
    ret.prop_typeToShow = prop_typeToShow;
    return ret;
  }
  /** Activates this model instance in the current {@link 
net.java.html.json.Models#bind(java.lang.Object, net.java.html.BrwsrCtx) browser context}. 
In case of using Knockout technology, this means to 
bind JSON like data in this model instance with Knockout tags in 
the surrounding HTML page.
This method binds to element '""' on the page
@return <code>this</code> object
*/
  public PlanetModel applyBindings() {
    proto.applyBindings();
    return this;
  }
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof PlanetModel)) return false;
    PlanetModel p = (PlanetModel)o;
    if (!TYPE.isSame(prop_displayAdvancedOptions, p.prop_displayAdvancedOptions)) return false;
    if (!TYPE.isSame(prop_planets, p.prop_planets)) return false;
    if (!TYPE.isSame(prop_typeToShow, p.prop_typeToShow)) return false;
    return true;
  }
  public int hashCode() {
    int h = PlanetModel.class.getName().hashCode();
    h = TYPE.hashPlus(prop_displayAdvancedOptions, h);
    h = TYPE.hashPlus(prop_planets, h);
    h = TYPE.hashPlus(prop_typeToShow, h);
    return h;
  }
}
