import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Workshop workshop = new Workshop();

        Master master = new Master(50, "Vinogradinka", Job.MASTER, false);
        Musician musician = new Musician(30, "Professor Grusha", Job.MUSICIAN, false);
        Student student = new Student(20, "Chipollino", Job.STUDENT);
        Cavalier cavalier = new Cavalier(35, "Pomidor", Job.CAVALIER, "Crying");

        ArrayList <Vegetable> visitors=new ArrayList<>();
        System.out.println("нига");
        visitors.add(musician);
        visitors.add(cavalier);
        workshop.newVisitor(musician);
        workshop.newVisitor(cavalier);
        workshop.newWorker(student);
        workshop.newWorker(master);
        student.newAcquaintances(master);
        student.newAcquaintances(musician);


        if ((workshop.getNumberOfVisitors()>0) || (workshop.getNumberOfWorkers()>1) ){
            master.setSatisfied(true);
        }
        MusicanInstrument musicanInstrument = new MusicanInstrument("pear");
        musician.setInstrument(musicanInstrument);

        if (master.isSatisfied()){
            System.out.printf("Мастер %s был доволен.", master.getName());
            if ((workshop.getNumberOfVisitors()>0) && (workshop.getNumberOfWorkers()>1) ){
                System.out.printf(" Потому, что они усердно работали, и многие заходили в мастерскую.");
                if (cavalier.getMood()=="Crying"){
                    System.out.printf(" А заходили они в мастерскую, чтобы посмотреть на смелого мальчишку, который заставил плакать самого кавалера %s. ", cavalier.getName());
            }
            } else if (workshop.getNumberOfVisitors()>0) {
                System.out.printf(" Потому, что многие заходили в мастерскую.");
            } else if (workshop.getNumberOfWorkers()>1) {
                System.out.printf(" Потому, что они усердно работали.");
            }
            else {
                System.out.printf(" непонятно почему");
            }
        } else {
            System.out.printf("Мастер %s был не доволен.", master.getName());
        }
        if (student.getNumberOfnewAcquaintances()>=2) {
            System.out.printf("\nЗа короткое время %s приобрел много новых знакомых.", student.getName());
        }            else {
                System.out.printf("\nЗа короткое время %s не приобрел много новых знакомых.", student.getName());
            }
        System.out.printf("\nСначала зашел %s. ", visitors.get(0).getName());
        if (visitors.get(0).getJob()==Job.MUSICIAN) {
            if (musician.hasInstrument()) {
                System.out.printf("За ним влетело целое облако мух и ос, потому что скрипка %s\nбыла сделана из половинки ароматной, сочной %s, а мухи, как известно, большие охотницы до всего сладкого. ", musician.getName(), musicanInstrument.getMaterial());

            }
        }
        for (int i =1; i<visitors.size(); i++){
            System.out.printf("Дальше зашёл %s.", visitors.get(i).getName());
            if (visitors.get(i).getJob()==Job.MUSICIAN) {
                if (musician.hasInstrument()) {
                    System.out.printf("За ним влетело целое облако мух и ос, потому что скрипка %s была сделана из половинки ароматной, сочной %s, а мухи, как известно, большие охотницы до всего сладкого.", musician.getName(), musicanInstrument.getMaterial());

                }
            }
        }
        }


    }

