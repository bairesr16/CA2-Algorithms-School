/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sara_
 */
public enum Department {
    PIANO_AND_STRINGS("Piano & Strings"),
    WOODWIND_AND_BRASS("Woodwind & Brass"),
    VOCALS_AND_ENSEMBLE("Vocals & Ensemble"),
    MUSIC_THEORY_AND_PRODUCTION("Music Theory & Production"),
    STUDENT_SUPPORT("Student Support"),
    OPERATIONS("Operations"),
    ADMINISTRATION("Administration");
    
    private final String displayName;
    
    Department(String displayName) {
        this.displayName = displayName;
    }
    
    public String getDisplayName() {
        return displayName;
    } 
    
    public static Department fromString(String input) {
        if (input == null) return null;
        String cleaned = input.trim();
        for (Department dept : values()) {
            if (dept.displayName.equalsIgnoreCase (cleaned) || dept.name().equalsIgnoreCase(cleaned)) {
                return dept;
            }
        }
        return null;
    }
    
    
}
