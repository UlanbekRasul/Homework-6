package com.company;

public class GameEntity {
    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static String bossDefenceType = "";
    public static String[] heroesAttackTypes = {"Physical",
            "Magical", "Kinetic", "Golem", "Lucky", "Berserk", "Thor", "Medic"};
    public static int[] heroesHealth = {290, 280, 250, 350, 200, 190, 210, 250};
    public static int[] heroesDamages = {20, 25, 15, 3, 10, 21, 24, 0};

    public static int getBossHealth() {
        return bossHealth;
    }


    public static void setBossHealth(int bossHealth) {
        GameEntity.bossHealth = bossHealth;
    }

    public static int getBossDamage() {
        return bossDamage;
    }

    public static void setBossDamage(int bossDamage) {
        GameEntity.bossDamage = bossDamage;
    }

    public static int[] getHeroesHealth() {
        return heroesHealth;
    }

    public static void setHeroesHealth(int[] heroesHealth) {
        GameEntity.heroesHealth = heroesHealth;
    }

    public static int[] getHeroesDamages() {
        return heroesDamages;
    }

    public static void setHeroesDamages(int[] heroesDamages) {
        GameEntity.heroesDamages = heroesDamages;
    }

    public static String getBossDefenceType() {
        return bossDefenceType;
    }

    public static void setBossDefenceType(String bossDefenceType) {
        GameEntity.bossDefenceType = bossDefenceType;
    }

    public static String[] getHeroesAttackTypes() {
        return heroesAttackTypes;
    }

    public static void setHeroesAttackTypes(String[] heroesAttackTypes) {
        GameEntity.heroesAttackTypes = heroesAttackTypes;
    }
}
