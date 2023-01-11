package lecture09;

import java.time.LocalDate;

public class Person {
    private String name;
    private String sex;
    private String religion;
    private String language;
    private String job;
    private String nationality;
    private String birthDate;
    private String country;

    private int age;
    private long egn;

    public Person(String name, String sex, String religion, String language, String job, String nationality, String country, long egn) {
        this.name = name;

        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.country = country;
        setEgn(egn) ;
        setAge(egn);
        setBirthDate(egn);
        setSex(sex) ;
    }

    private void setSex(String sex) {
        String male = "male";
        String female = "female";

        if(sex.equalsIgnoreCase(male) ||sex.equalsIgnoreCase(female){
        this.sex = sex;
    }

    private void setAge(long egn) {
        String birthYear = "19" + Long.toString(egn).substring(0, 2);
        int currentYear = LocalDate.now().getYear();
        this.age = currentYear - Integer.parseInt(birthYear);
    }

    //8103045520
    private void setBirthDate(long egn) {
        //ToDo implement me
        String date = Long.toString(egn).substring(2, 4);
        String month = Long.toString(egn).substring(4, 6);
        this.birthDate = date + "" + month;


        private long setEgn ( long egn){
            int egnLength = Long.toString(egn).length();
            if (egnLength == 10) {
                this.egn = egn;

            }else{

                throw new RuntimeException("Invalid EGN");
            }
        }





