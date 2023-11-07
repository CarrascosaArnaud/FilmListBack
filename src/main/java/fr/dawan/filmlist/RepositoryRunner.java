package fr.dawan.filmlist;

import fr.dawan.filmlist.entities.*;
import fr.dawan.filmlist.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RepositoryRunner implements CommandLineRunner {

    @Autowired
    private ActorRepository actRepo;
    @Autowired
    private CategoryRepository catRepo;
    @Autowired
    private FilmRepository filmRepo;
    @Autowired
    private ProducerRepository prodRepo;
    @Autowired
    private ReviewRepository revRepo;
    @Autowired
    private UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("repository runner");

        //Actor
        List <Actor> act=actRepo.findActorByName("Leonardo Dicaprio");
        for(Actor a: act) {
            System.out.println(a);
        }

        //Category
        List <Category> cat= catRepo.findCategoryByName("Policier");
        for(Category c: cat) {
            System.out.println(c);
        }

        //Film
        List <Film> film=filmRepo.findFilmByName("Expendables");
        for(Film l: film) {
            System.out.println(l);
        }

        //Producer
        List <Producer> prod= prodRepo.findProducerByName("Michael Bay");
        for(Producer p: prod) {
            System.out.println(p);
        }

        //Review
        List <Review> rev= revRepo.findReviewByFilmId(1);//ByFilm
        for(Review r: rev) {
            System.out.println(r);
        }

        List <Review> rev2= revRepo.findReviewById(1);//ById
        for(Review r: rev2) {
            System.out.println(r);
        }

        List <Review> rev3= revRepo.findReviewByScore(5);//ByScore
        for(Review r: rev3) {
            System.out.println(r);
        }

        List <Review> rev4= revRepo.findReviewByUserId(1);//ByUserId
        for(Review r: rev4) {
            System.out.println(r);
        }

        //User
        List <User> user=userRepo.findUserByName("Pseudo");
        for(User u: user) {
            System.out.println(u);
        }


    }

}
