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
public class MagnamentYacimiento {
    private ArrayList<Yacimiento> yacimientos;

    public MagnamentYacimiento() {
                yacimientos=new ArrayList<>();
    }
    
    
    public boolean añadirYacimiento(int id_yacimiento, String nombre,double latitud,double longitud){          
        if (this.buscarYacimiento(id_yacimiento) != null){
            return false;
        }else{
            yacimientos.add(new Yacimiento(id_yacimiento, nombre,latitud,longitud));
            
            return true;      
        }
        
    }
    
    
     public Yacimiento buscarYacimiento(int id){
               
        for(Yacimiento yacimiento:yacimientos ){
            if(yacimiento.getId_yacimiento()==id){
                return yacimiento;
            }
        }
        return null;   
    }
     
    public boolean buscadorYacimiento(int id){
               
        for(Yacimiento yacimiento:yacimientos ){
            if(yacimiento.getId_yacimiento()==id){
                return true;
            }
        }
        return false;   
    } 
     
     
     public ArrayList<Yacimiento> mostrarYacimiento(String nombre){
         ArrayList<Yacimiento> aux=new ArrayList<>();
         
         for (Yacimiento yacimiento : yacimientos) {
             if(yacimiento.getNombre().equalsIgnoreCase(nombre)){
                 aux.add(yacimiento);
             }
         }
         return aux;
     }
     
     
     public boolean eliminarYacimiento(int id){
         int i=0;
         
         for (Yacimiento yacimiento : yacimientos) {
             i++;
             if(yacimiento.getId_yacimiento()==id){
                 yacimientos.remove(i-1);
                 return true;
             }
         }
         return false;
     }
    
     public int contador(int id){
        
        int i=0;
        for (Yacimiento yacimientoe : yacimientos) {
            i++;
            if(yacimientoe.getId_yacimiento()==id){
                return i;
            }
        }
        return i;   
    }
     
     public boolean modificarYacimiento(int id,String option, String valor){
         if(this.buscadorYacimiento(id)){
             switch(option){
                 case("nombre"):
                     
                     yacimientos.get(this.contador(id)).setNombre(valor);
                     break;
                 case("latitud"):
                     yacimientos.get(this.contador(id)).setLatitud(Double.parseDouble(valor));
                     break;
                 case("longitud"):
                     yacimientos.get(this.contador(id)).setLongitud(Double.parseDouble(valor));
                     break;
             }
             return true;
                  
         }
         return false;
     }

    public ArrayList<Yacimiento> getYacimientos() {
        return yacimientos;
    }

    public void setYacimientos(ArrayList<Yacimiento> yacimientos) {
        this.yacimientos = yacimientos;
    }
     
     
     
}
