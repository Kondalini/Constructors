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
        setEgn(egn);
        setAge(egn);
        setBirthDate(egn);
        setSex(sex);
    }


    private void setSex(String sex) {
        String male = "male";
        String female = "female";

        if (sex.equalsIgnoreCase(male) || sex.equalsIgnoreCase(female)) {
            this.sex = sex;
        }
    }

    private void setAge(long egn) {
        String birthYear = "19" + Long.toString(egn).substring(0, 2);
        int currentYear = LocalDate.now().getYear();
        this.age = currentYear - Integer.parseInt(birthYear);
    }

    //8103045520
    private void setBirthDate(long egn) {
        this.birthDate = null;
        String date = Long.toString(egn).substring(2, 4);
        String month = Long.toString(egn).substring(4, 6);
        this.birthDate = date + "" + month;
    }


    private boolean setEgn(long egn) {
        int engLength = Long.toString(egn).length();
        if (engLength == 10) {
            this.egn = egn;
        } else {
            throw new RuntimeException("The provided EGN is not valid! The EGN must contain only 10 digits!");
        }


        public void sayHello () {
            System.out.println("Hello");
        }

        public boolean celebrateEaster () {

            if (religion.equalsIgnoreCase("orthodox") || religion.equalsIgnoreCase("catholic")) {
                System.out.println("I am celebrating Easter");
            } else {
                System.out.println("I am not  celebrating Easter");
            }

            public boolean isAdult () {
                switch (country) {
                    case "Bulgaria":
                    case "Italy":
                        return age >= 18;
                    case "USA":
                        return age >= 21;
                    default:
                        throw new RuntimeException("We don't have information about country: " + country);

                }

                public boolean canTakeLoan () {
                    return job != null;

                }

                public void setJob (String job){
                    this.job = job;
                }
                public void setCountry (String country){
                    this.country = country;
                }

                public class American extends Person {
                    public American(String name, String sex, String religion, String job, String country, long egn) {
                        super(name, sex, religion, "English", job, "American", country, egn);
                    }

                    public void celebrateThanksgiving() {
                        System.out.println("I am celebrating Thanksgiving on the fourth Tuesday in November");
                    }
                }

                public class Bulgarian extends Person {
                    public Bulgarian(String name, String sex, String religion, String job, String country, long egn) {
                        super(name, sex, religion, "Bulgarian", job, "Bulgarian", country, egn);
                    }

                    @Override
                    public void sayHello() {
                        System.out.println("Здравейте!");
                    }

                    public void danceHoro() {
                        System.out.println("Танцувам хоро!");
                    }
                }
                public class Child extends Person {
                    public Child(String name, String sex, String religion, String language, String nationality, String country, long egn) {
                        super(name, sex, religion, language, null, nationality, country, egn);
                    }

                    @Override
                    public boolean isAdult() {
                        System.out.println("The child is not an adult.");
                        return false;
                    }

                    @Override
                    public boolean canTakeLoan() {
                        System.out.println("The child can not take a loan.");
                        return false;
                    }

                    @Override
                    public void setJob(String job) {
                        throw new IllegalArgumentException("The child cannot have a job");
                    }

                    public void play(String toy) {
                        System.out.println("I am playing with a " + toy);
                    }
                }
                }
            }
        }
    }
























