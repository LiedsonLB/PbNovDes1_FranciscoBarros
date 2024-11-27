package org.scenery1.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Person spouse;
    private Person parent;
    private List<Person> children;

    public  Person( String name ) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public  Person( String name, Person parent ) {
        this(name);
        this.parent = parent;
    }

    public void spouse( Person spouse ) {
        this.spouse = spouse;
    }

    public void addChild( Person child ) {
        this.children.add( child );
    }

    public void printFamilyTree() {
        System.out.println( this.name );
        if( this.spouse != null ) {
            System.out.println( "Spouse: " + this.spouse.name );
        }
        if( this.parent != null ) {
            System.out.println( "Parent: " + this.parent.name );
        }
        if( this.children.size() > 0 ) {
            System.out.println( "Children: " );
            for( Person child : this.children ) {
                System.out.println( child.name );
            }
        }
    }
}
