/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model;

/**
 *
 * @author donkey
 */
public final class StandardHouse {
    
    private boolean yard;
    private String id;

    private StandardHouse(Builder b) {
      
        this.yard = b.yard;
    }

    public static class Builder
    {
        private boolean yard;
        private String id;
        
        public Builder(boolean yard)
        {
            this.yard = yard;
        }
        
        public Builder house(boolean yard)
        {
            this.yard = yard;
            return this;
        }
        
        public StandardHouse stHouse()
        {
            return new StandardHouse(this);
        }
    }
  

    public boolean isYard() {
        return yard;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (this.yard ? 1 : 0);
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
        final StandardHouse other = (StandardHouse) obj;
        if (this.yard != other.yard) {
            return false;
        }
        return true;
    }
    
}
