package org.example;



class Cheese
{
    private String cheeseName;
    private String cheeseType;
    private String flavorProfile;
    private String traits; 
    private String fatLevel;
    private boolean organic;
    private double moisture;
    private String rindType;
    private String milkType;
    private String milkTreatment;
    private String manufType;
    private String manufCode;
    private String id;

    public Cheese(String cheeseName, String cheeseType, String flavorProfile, String traits, String fatLevel, boolean organic, double moisture, String rindType, String milkType, String milkTreatment, String manufType, String manufCode, String id)
    {
        super();

        this.cheeseName = cheeseName;
        this.cheeseType = cheeseType;
        this.flavorProfile = flavorProfile;
        this.traits = traits;
        this.fatLevel = fatLevel;
        this.organic = organic;
        this.moisture = moisture;
        this.rindType = rindType;
        this.milkType = milkType;
        this.milkTreatment = milkTreatment;
        this.manufType = manufType;
        this.manufCode = manufCode;
        this.id = id;
    }


    public String getName()
    {
        return cheeseName;
    }

    public String getCheeseType()
    {
        return cheeseType;
    }

    public String getFlavorProgile()
    {
        return flavorProfile;
    }

    public String getTraits()
    {
        return traits;
    }

    public String getFatLevel()
    {
        return fatLevel;
    }

    public boolean getOrganicStatus()
    {
        return organic;
    }

    public double getMoistureLevel()
    {
        return moisture;
    }

    public String getRindType()
    {
        return rindType;
    }

    public String getCowType()
    {
        return milkType;
    }

    public String getMilkTreatment()
    {
        return milkTreatment;
    }

    public String getManufType()
    {
        return manufType;
    }

    public String getManufCode()
    {
        return manufCode;
    }

    public String getID()
    {
        return id;
    }
    
    @Override public String toString()
    {
        return "Name: " + cheeseName + "\nType: " + cheeseType;
    }


  }
