package Sofa;

public class Participant {
    private String name;
    private String gender;
    private Participant next;



    Participant(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    public Participant getNext() {
        return next;
    }

    public void setNext(Participant next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

