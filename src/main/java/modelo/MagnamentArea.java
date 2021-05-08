/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author 57320
 */
public class MagnamentArea {
    private ArrayList<Area> areas;

    public MagnamentArea() {
                areas=new ArrayList<>();
    }
    
    
    public boolean añadirArea(int id_area, String nombre){          
        if (this.buscarArea(id_area) != null){
            return false;
        }else{
            areas.add(new Area(id_area, nombre));
            
            return true;      
        }
        
    }
    
    
     public Area buscarArea(int id){
               
        for(Area area:areas ){
            if(area.getId_area()==id){
                return area;
            }
        }
        return null;   
    }
     
    public boolean buscadorArea(int id){
               
        for(Area area:areas ){
            if(area.getId_area()==id){
                return true;
            }
        }
        return false;   
    } 
     
     
     public ArrayList<Area> mostrarArea(String nombre){
         ArrayList<Area> aux=new ArrayList<>();
         
         for (Area area : areas) {
             if(area.getNombre().equalsIgnoreCase(nombre)){
                 aux.add(area);
             }
         }
         return aux;
     }
     
     
     public boolean eliminarArea(int id){
         int i=0;
         
         for (Area area : areas) {
             i++;
             if(area.getId_area()==id){
                 areas.remove(i-1);
                 return true;
             }
         }
         return false;
     }
    
     public int contador(int id){
        
        int i=0;
        for (Area areae : areas) {
            i++;
            if(areae.getId_area()==id){
                return i;
            }
        }
        return i;   
    }
     
     public boolean modificarArea(int id,String option, String valor){
         if(this.buscadorArea(id)){
             switch(option){
                 case("nombre"):
                     areas.get(this.contador(id)).setNombre(valor);
                     break;
             }
             return true;
                  
         }
         return false;
     }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }
     
     
     
}
