package org.ds.animatedtransitions;
import net.java.html.json.*;
public final class Planet implements Cloneable {
  private static final Html4JavaType TYPE = new Html4JavaType();
  private final org.netbeans.html.json.spi.Proto proto;
  private java.lang.String prop_name;
  public java.lang.String getName() {
    proto.accessProperty("name");
    return prop_name;
  }
  public void setName(java.lang.String v) {
    proto.verifyUnlocked();
    if (TYPE.isSame(prop_name, v)) return;
    Object o = prop_name;
    prop_name = v;
    proto.valueHasMutated("name", o, v);
  }
  private java.lang.String prop_type;
  public java.lang.String getType() {
    proto.accessProperty("type");
    return prop_type;
  }
  public void setType(java.lang.String v) {
    proto.verifyUnlocked();
    if (TYPE.isSame(prop_type, v)) return;
    Object o = prop_type;
    prop_type = v;
    proto.valueHasMutated("type", o, v);
  }
  private static Class<PlanetsModelDef.PlanetDef> modelFor() { return null; }
  private Planet(net.java.html.BrwsrCtx context) {
    this.proto = TYPE.createProto(this, context);
  };
  public Planet() {
    this(net.java.html.BrwsrCtx.findDefault(Planet.class));
  };
  public Planet(java.lang.String aName, java.lang.String aType) {
    this(net.java.html.BrwsrCtx.findDefault(Planet.class));
    this.prop_name = aName;
    this.prop_type = aType;
  };
  private static class Html4JavaType extends org.netbeans.html.json.spi.Proto.Type<Planet> {
    private Html4JavaType() {
      super(Planet.class, PlanetsModelDef.PlanetDef.class, 2, 0);
      registerProperty("name", 0, false);
      registerProperty("type", 1, false);
    }
    @Override public void setValue(Planet data, int type, Object value) {
      switch (type) {
        case 0: data.setName(TYPE.extractValue(java.lang.String.class, value)); return;
        case 1: data.setType(TYPE.extractValue(java.lang.String.class, value)); return;
      }
      throw new UnsupportedOperationException();
    }
    @Override public Object getValue(Planet data, int type) {
      switch (type) {
        case 0: return data.getName();
        case 1: return data.getType();
      }
      throw new UnsupportedOperationException();
    }
    @Override public void call(Planet model, int type, Object data, Object ev) throws Exception {
      switch (type) {
      }
      throw new UnsupportedOperationException();
    }
    @Override public org.netbeans.html.json.spi.Proto protoFor(Object obj) {
      return ((Planet)obj).proto;    }
    @Override public void onChange(Planet model, int type) {
      switch (type) {
    }
      throw new UnsupportedOperationException();
    }
  @Override public void onMessage(Planet model, int index, int type, Object data, Object[] params) {
    switch (index) {
    }
    throw new UnsupportedOperationException("index: " + index + " type: " + type);
  }
    @Override public Planet read(net.java.html.BrwsrCtx c, Object json) { return new Planet(c, json); }
    @Override public Planet cloneTo(Planet o, net.java.html.BrwsrCtx c) { return o.clone(c); }
  }
  private Planet(net.java.html.BrwsrCtx c, Object json) {
    this(c);
    Object[] ret = new Object[2];
    proto.extract(json, new String[] {
      "name",
      "type",
    }, ret);
    this.prop_name = (java.lang.String)ret[0];
    this.prop_type = (java.lang.String)ret[1];
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('{');
    sb.append('"').append("name").append('"').append(":");
    sb.append(TYPE.toJSON(prop_name));
    sb.append(',');
    sb.append('"').append("type").append('"').append(":");
    sb.append(TYPE.toJSON(prop_type));
    sb.append('}');
    return sb.toString();
  }
  public Planet clone() {
    return clone(proto.getContext());
  }
  private Planet clone(net.java.html.BrwsrCtx ctx) {
    Planet ret = new Planet(ctx);
    ret.prop_name = prop_name;
    ret.prop_type = prop_type;
    return ret;
  }
  private Planet applyBindings() {
    throw new IllegalStateException("Please specify targetId=\"\" in your @Model annotation");
  }
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Planet)) return false;
    Planet p = (Planet)o;
    if (!TYPE.isSame(prop_name, p.prop_name)) return false;
    if (!TYPE.isSame(prop_type, p.prop_type)) return false;
    return true;
  }
  public int hashCode() {
    int h = Planet.class.getName().hashCode();
    h = TYPE.hashPlus(prop_name, h);
    h = TYPE.hashPlus(prop_type, h);
    return h;
  }
}
