package org.apache.ibatis.submitted.nestedresulthandler;

/**
 * Created by eyal on 12/9/2015.
 */
public class PersonItemPair {
    private Person  person;
    private Item item;

    public String toString(){
        return new StringBuilder()
                .append("PersonItemPair(")
                .append(person)
                .append(", ")
                .append(item)
                .append(" )")
                .toString();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public org.apache.ibatis.submitted.nestedresulthandler.Item getItem() {
        return item;
    }

    public void setItem(org.apache.ibatis.submitted.nestedresulthandler.Item item) {
        this.item = item;
    }
}
