package com.cg.placement.service;

import com.cg.placement.entities.College;

public interface ICollegeService 
{
    public College addCollege(College college);
    public College updateCollege(College college);
    public College searchCollege(int id);
    public Boolean deleteCollege(int id);
    public Boolean schedulePlacement(Placement placement);
    
    public abstract void beginTransaction();
    public abstract void commitTransaction();
}
