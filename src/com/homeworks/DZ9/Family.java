package com.homeworks.DZ9;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        mother.setFamily(this);
        father.setFamily(this);
        this.mother = mother;
        this.father = father;
        children = new Human[0];
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    public void addChild(Human human){
        human.setFamily(this);
        Human[] tmp = new Human[children.length];
        for (int i = 0; i < children.length; i++) {
            tmp[i] = children[i];
        }
        children = new Human[children.length + 1];
        for (int i = 0; i < tmp.length; i++) {
            children[i] = tmp[i];
        }
        children[children.length - 1] = human;
    }

    public boolean deleteChild(int index) {
        if(index < 0 && index > children.length - 1) {
            return false;
        }
        Human[] tmp = new Human[children.length];
        for (int i = 0; i < children.length; i++) {
            tmp[i] = children[i];
        }
        children = new Human[children.length - 1];
        int count = 0;
        for (int i = 0; i < tmp.length; i++) {
            if(i == index) {
                continue;
            }
            children[count++] = tmp[i];
        }
        return true;
    }

    public int countFamily() {
        int petCounter = 0;
        if(pet != null) petCounter = 1;
        return children.length + petCounter + 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Arrays.equals(getChildren(), family.getChildren()) && Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMother(), getFather(), getPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }
}
