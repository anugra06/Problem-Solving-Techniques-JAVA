package Task3;

import java.util.*;


class Person{
String name;
int age;

Person(String name,int age){
this.name=name;
this.age=age;
}

static boolean olderThan(Person p,int limit){
return p.age>limit;
}
}

public class Solution{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
List<Person> persons=new ArrayList<>();

for(int i=0;i<n;i++){
String name=sc.next();
int age=sc.nextInt();
persons.add(new Person(name,age));
}

int ageLimit=sc.nextInt();

/* Sorted names alphabetically */
persons.stream()
.sorted(Comparator.comparing(p->p.name))
.map(p->p.name)
.forEach(s->System.out.print(s+" "));
System.out.println();

/* Persons older than ageLimit */
persons.stream()
.filter(p->Person.olderThan(p,ageLimit))
.map(p->p.name)
.forEach(s->System.out.print(s+" "));
System.out.println();
sc.close();

/* Names in uppercase */
persons.stream()
.map(p->p.name)
.map(String::toUpperCase)
.forEach(s->System.out.print(s+" "));
}
}