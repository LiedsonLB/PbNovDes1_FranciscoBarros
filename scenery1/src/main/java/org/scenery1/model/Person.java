package org.scenery1.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Person spouse = null;
    private Person parent;
    private List<Person> children;

    public  Person( String name ) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public  Person( String name, Person parent ) {
        this(name);
        this.parent = parent;
        parent.addChild( this );
    }

    public String name() {
        return this.name;
    }

    public void spouse( Person spouse ) {
        this.spouse = spouse;
    }

    public void addChild( Person child ) {
        this.children.add( child );
    }

    public void printFamilyTree() {
        System.out.println( "aqui vai ser a arvore" );
    }
}
