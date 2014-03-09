/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.accomodationPackage.Impl;

import com.mycompany.property.model.accomodationPackage.Accomodation;

/**
 *
 * @author donkey
 */
public final class BedAndBreakfast implements Accomodation {
    
    private boolean selfServing;

    private BedAndBreakfast(Builder b) {
        selfServing = b.selfServing;
    }
    
    public static class Builder
    {
        private boolean selfServing;
        
        public Builder(boolean selfServing)
        {
            this.selfServing = selfServing;
        }
        public Builder bedAndBreakfast(boolean selfServing)
        {
            this.selfServing = selfServing;
            return this;
        }
        public BedAndBreakfast bedAndBreakfast()
        {
            return new BedAndBreakfast(this);
        }
    }

    @Override
    public int nights(int nights) {
        return nights;
    }

    public boolean isSelfServing() {
        return selfServing;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.selfServing ? 1 : 0);
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
        final BedAndBreakfast other = (BedAndBreakfast) obj;
        if (this.selfServing != other.selfServing) {
            return false;
        }
        return true;
    }
    
}
