package org.example.enums;

public enum Plan {
    BASIC("T-Sigorta",15000);

    private String name;
    private int price;


    Plan(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
