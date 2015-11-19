package train_travell.passenger;


import java.util.Date;

public class Human {

    private String surname;
    private String name;
    private String patronymic;
    private Date bornDate;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public void setPatronymic(String patronymic) {

        this.patronymic = patronymic;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }
}
