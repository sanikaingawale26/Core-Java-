package com.pti.lambda.demo.model;

import java.util.Comparator;

//public class SortByName implements Comparator {
//
//@Override
//public int compare(Object o1, Object o2) {
//Person p1=(Person)o1;
//Person p2=(Person) o2;
//
//return p1.compareTo(p2) ;
//}
//
//}
public class SortByName implements Comparator<Person> {

@Override
public int compare(Person o1, Person o2) {

return o1.getName().compareTo(o2.getName()) ;
}

}
