/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sara_
 */
public enum ManagerType {
    HEAD_MANAGER("Head Manager"),
    SENIOR_MANAGER("Senior Manager"),
    MANAGER("Manager"),
    ASSISTANT_MANAGER("Assistant Manager"),
    TEAM_LEAD("Team Lead");
    
    private final String displayName;
    
    ManagerType(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public static ManagerType fromString(String input) {
        if (input == null) return null;
        String cleaned = input.trim();
        for (ManagerType type: values()) {
            if (type.displayName.equalsIgnoreCase(cleaned) || type.name().equalsIgnoreCase(cleaned)) {
                return type;
            }
        }
        return null;
    }
}
