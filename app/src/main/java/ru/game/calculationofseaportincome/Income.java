package ru.game.calculationofseaportincome;

import java.util.ArrayList;

public class Income {
    private String name;
    private int numberOfShips;
    private int costPerShip;

    public Income(String name, int numberOfShips, int costPerShip) {
        this.name = name;
        this.numberOfShips = numberOfShips;
        this.costPerShip = costPerShip;
    }

    public int calculateRevenue() {
        return numberOfShips * costPerShip;
    }

    public String getName() {
        return name;
    }
}

// Класс для обслуживания морских судов
class ShipServicing extends Income {
    public ShipServicing(int numberOfShips, int costPerShip) {
        super("Обслуживание морских судов", numberOfShips, costPerShip);
    }
}

// Класс для морского порта
class Seaport {
    private ArrayList<Income> incomes;
    private int rent; // Добавим переменную для арендной платы

    public Seaport(int rent) {
        this.rent = rent;
        incomes = new ArrayList<>();
    }
    public void addIncome(Income income) {
        incomes.add(income);
    }

    public int calculateTotalRevenue() {
        int totalRevenue = rent; // Учитываем арендную плату
        for (Income income : incomes) {
            totalRevenue += income.calculateRevenue();
        }
        return totalRevenue;
    }
}