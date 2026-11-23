/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sara_
 */
public enum MenuOption {
    SORT(1, "Sort Staff / Applicants List (Recursive)"),
    SEARCH(2, "Search Staff / Applicant by Name (Recursive)"),
    ADD_RECORDS(3, "Add New Staff Record"),
    CREATE_BINARY_TREE(4, "Create Music School Hierarchy (Binary Tree)"),
    EXIT(5, "Exit");
    
    private final int number;
    private final String label;
    
    MenuOption(int number, String label) {
        this.number = number;
        this.label = label;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getLabel() {
        return label;
    }
    
    public static MenuOption fromNumber(int input) {
        for (MenuOption option : values()) {
            if (option.number == input) {
                return option;
            }
          
        }
        return null;
    }
}
