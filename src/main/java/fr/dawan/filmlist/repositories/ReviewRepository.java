package fr.dawan.filmlist.repositories;

import fr.dawan.filmlist.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {

    @Query(value="SELECT r FROM Review r WHERE r.filmId<:filmId")
    List<Review> findReviewByFilmId(int filmId);

    @Query(value="SELECT r FROM Review r WHERE r.user_id<:user_id")
    List<Review> findReviewByUserId(int user_id);

    @Query(value="SELECT r FROM Review r WHERE r.id<:id")
    List<Review> findReviewById(int id);

    @Query(value="SELECT r FROM Review r WHERE r.score<:score")
    List<Review> findReviewByScore(int score);

}
