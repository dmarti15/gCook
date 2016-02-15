package com.d4n1.gcook.modelo;

import com.d4n1.gcook.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Comida {
    private int  categoria;
    private String nombre;
    private int idDrawable;

    public Comida(int categoria, String nombre, int idDrawable) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Comida> COMIDAS_POPULARES = new ArrayList<Comida>();
    public static final List<Comida> PRIMEROS = new ArrayList<>();
    public static final List<Comida> SEGUNDOS = new ArrayList<>();
    public static final List<Comida> ENTRANTES = new ArrayList<>();
    public static final List<Comida> POSTRES = new ArrayList<>();
    public static final List<Comida> BEBIDAS = new ArrayList<>();

    static {
        COMIDAS_POPULARES.add(new Comida(2, "Hamburguesa de Queso Azul", R.drawable.hamburguesa_queso_azul));
        COMIDAS_POPULARES.add(new Comida(2, "Empanada de Carne", R.drawable.empanada_carne));
        COMIDAS_POPULARES.add(new Comida(2, "Solomillo de Ternera", R.drawable.solomillo_ternera));
        COMIDAS_POPULARES.add(new Comida(3, "Navajas", R.drawable.navajas));
        COMIDAS_POPULARES.add(new Comida(4, "Sorbete de Mojito de Melón", R.drawable.mojito_melon));
        COMIDAS_POPULARES.add(new Comida(1, "Cocido Madrileño", R.drawable.cocido));
        COMIDAS_POPULARES.add(new Comida(2, "Hamburguesa de Ciervo", R.drawable.hamburguesa_ciervo));
        COMIDAS_POPULARES.add(new Comida(2, "Carne Estofada", R.drawable.carne_estofada));

        PRIMEROS.add(new Comida(1, "Sandwich Vegetal", R.drawable.sandwich));
        PRIMEROS.add(new Comida(1, "Cocido Madrileño", R.drawable.cocido));
        PRIMEROS.add(new Comida(1, "Sandwich 2", R.drawable.sandwich));
        PRIMEROS.add(new Comida(2, "Empanada de Carne", R.drawable.empanada_carne));

        SEGUNDOS.add(new Comida(2, "Lomo De Cerdo Austral", R.drawable.lomo_cerdo));
        SEGUNDOS.add(new Comida(2, "Carne Estofada", R.drawable.carne_estofada));
        SEGUNDOS.add(new Comida(2, "Solomillo de Ternera", R.drawable.solomillo_ternera));
        SEGUNDOS.add(new Comida(2, "Hamburguesa de Ciervo", R.drawable.hamburguesa_ciervo));
        SEGUNDOS.add(new Comida(2, "Hamburguesa de Queso Azul", R.drawable.hamburguesa_queso_azul));

        ENTRANTES.add(new Comida(3, "Sushi Extremo", R.drawable.sushi));
        ENTRANTES.add(new Comida(3, "Camarones Tismados", R.drawable.camarones));
        ENTRANTES.add(new Comida(3, "Sushi y Maki", R.drawable.sushi_variado));
        ENTRANTES.add(new Comida(3, "Navajas", R.drawable.navajas));

        POSTRES.add(new Comida(4, "Postre De Vainilla", R.drawable.postre_vainilla));
        POSTRES.add(new Comida(4, "Flan Celestial", R.drawable.flan_celestial));
        POSTRES.add(new Comida(4, "Cupcake Festival", R.drawable.cupcakes_festival));
        POSTRES.add(new Comida(4, "Pastel De Fresa", R.drawable.pastel_fresa));
        POSTRES.add(new Comida(4, "Muffin Amoroso", R.drawable.muffin_amoroso));
        POSTRES.add(new Comida(4, "Sorbete de Mojito de Melón", R.drawable.mojito_melon));

        BEBIDAS.add(new Comida(5, "Taza de Café", R.drawable.cafe));
        BEBIDAS.add(new Comida(5, "Coctel Tronchatoro", R.drawable.coctel));
        BEBIDAS.add(new Comida(5, "Jugo Natural", R.drawable.jugo_natural));
        BEBIDAS.add(new Comida(5, "Coctel Jordano", R.drawable.coctel_jordano));
        BEBIDAS.add(new Comida(5, "Botella Vino Tinto Darius", R.drawable.vino_tinto));
    }

    public String getCategoria() {
        String Cat;
        switch (categoria){
            case 1:
                Cat = "Vegetal";
                break;
            case 2:
                Cat = "Carne";
                break;
            case 3:
                Cat = "Pescado";
                break;
            case 4:
                Cat = "Postre";
                break;
            case 5:
                Cat = "Bebida";
                break;
            default:
                Cat = "Otros";
        }
        return  Cat;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}
