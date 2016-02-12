package com.d4n1.gcook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmartinm on 12/02/2016.
 */
public class Receta {


    private int categoria;
    private int region;
    private String nombre;
    private int idDrawable;

    public Receta(int  categoria, int region, String nombre, int idDrawable) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
        this.region = region;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getRegion() {
        return region;
    }


    public static final List<Receta> ULTIMAS_RECETAS = new ArrayList<Receta>();
    public static final List<Receta> BEBIDAS = new ArrayList<>();
    public static final List<Receta> POSTRES = new ArrayList<>();
    public static final List<Receta> PLATILLOS = new ArrayList<>();

    static {
        ULTIMAS_RECETAS.add(new Receta(3,0, "Camarones Tismados", R.drawable.camarones));
        ULTIMAS_RECETAS.add(new Receta(4,0, "Rosca Herbárea", R.drawable.rosca));
        ULTIMAS_RECETAS.add(new Receta(3,0, "Sushi Extremo", R.drawable.sushi));
        ULTIMAS_RECETAS.add(new Receta(1,0, "Sandwich Deli", R.drawable.sandwich));
        ULTIMAS_RECETAS.add(new Receta(2,0, "Lomo De Cerdo Austral", R.drawable.lomo_cerdo));
    }
}
