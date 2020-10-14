package com.pa;

public class Lab0Main {
    public static void main(String[]args){
        Person p1 = new Person(1,"Duarte");
        Person p2 = new Person(1,"João");
        Person p3 = new Person(1,"Rui");
        Group group = new Group(p1);
        try {
            group.deleteMember(p1);
        }
            catch (GroupException e){
                System.out.println(e.getMessage());
        }
        group.addMember(p2);

        try {
            group.deleteMember(p3);
        }
        catch (GroupException e){
            System.out.println(e.getMessage());
        }

        group.addMember(p3);

        try {
            group.addMember(p3);
        }
        catch (GroupException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(group.toString());
        group.changeChief(p2);
        System.out.println(group.toString());

    }



}
