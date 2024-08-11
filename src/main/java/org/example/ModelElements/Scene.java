package org.example.ModelElements;

import java.util.List;

public class Scene {

    private int id;
    private List<PoligonalModel> models;
    private List<Camera> cameras;
    private List<Flash> flashes;

    public Scene(List<PoligonalModel> models, List<Camera> cameras, List<Flash> flashes) {
        this.models = models;
        this.cameras = cameras;
        this.flashes = flashes;
    }

    public Scene() {
    }

    public Type3 method1(Type1 type1){
        return new Type3();
    }

    public Type3 method2(Type1 type1, Type2 type2){
        return new Type3();
    }
}
