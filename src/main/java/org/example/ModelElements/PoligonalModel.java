package org.example.ModelElements;

import java.util.List;

public class PoligonalModel {

    private int id;

    private List<Poligon> poligons;
    private List<Texture> textures;

    public PoligonalModel(List<Poligon> poligons) {
        this.poligons = poligons;
    }

    public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

    public int getId() {
        return id;
    }

    public List<Poligon> getPoligons() {
        return poligons;
    }

    public List<Texture> getTextures() {
        return textures;
    }
}
