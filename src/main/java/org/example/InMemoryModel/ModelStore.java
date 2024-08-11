package org.example.InMemoryModel;

import org.example.ModelElements.Camera;
import org.example.ModelElements.Flash;
import org.example.ModelElements.PoligonalModel;
import org.example.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModuleChanger{

    private int id;
    private List<IModuleChangeObserver> observers;
    private List<PoligonalModel> models = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private  List<Scene> scenes = new ArrayList<>();

    @Override
    public void notifyChange() {
        for (IModuleChangeObserver observer : observers) {
            observer.applyUpdateModule();
        }
    }
}
