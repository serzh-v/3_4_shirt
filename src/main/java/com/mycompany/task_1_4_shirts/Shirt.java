package com.mycompany.task_1_4_shirts;

/**
 *
 */
public class Shirt {
    String id;
    String description;
    String colour;
    String size;
    
    //метод задающий параметры рубашки
    public Shirt(String shirt) {
        String[] parts = shirt.split(",");
        this.id = parts[0].trim();
        this.description = parts[1].trim();
        this.colour = parts[2].trim();
        this.size = parts[3].trim();
    } 
    
    //метод выводящий строковое представление о параметрах рубашки
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("shirt id ").append(id);
        result.append(" description: ").append(description);
        result.append(" colour: ").append(colour);
        result.append(" size: ").append(size);
                
        return result.toString();
    }
}
