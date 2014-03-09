/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.propertyPackage;

import java.util.Objects;

/**
 *
 * @author donkey
 */
public final class GolfEstate implements Property {
    
    private String style;

    private GolfEstate(Builder b) {
        
        this.style = b.style;
        
    }

    
     
    public static class Builder
    {
        private String style;
        
        public Builder(String style)
        {
            this.style = style;
        }
        
        public Builder golfEstates(String style)
        {
            this.style = style;
            return this;
        }
        
        public GolfEstate golfEstate()
        {
            return new GolfEstate(this);
        }
        
    }
    
    @Override
    public double area() {
       return 0;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.style);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GolfEstate other = (GolfEstate) obj;
        if (!Objects.equals(this.style, other.style)) {
            return false;
        }
        return true;
    }
    
}
