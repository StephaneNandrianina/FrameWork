package etu1851.model;
import etu1851.annotation.*;

public class Emp {
    int id ;
    String nom;
    @ClassAnnotation(id = "emp-all")
    public String findAll(){
        return "ok";
    }

    @ClassAnnotation(id = "/affiche")
    public String findAll1(){
        return "ok";

    }
    @ClassAnnotation (id = "select")
    public String select(){
        return "selection";

    }
}
