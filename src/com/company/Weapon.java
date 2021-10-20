package com.company;
public class Weapon extends Boss {
    private String typeOfWeapon;
    private String weaponName;

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }
}
