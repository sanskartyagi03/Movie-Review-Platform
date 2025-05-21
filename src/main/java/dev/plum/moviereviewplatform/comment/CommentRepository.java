package dev.plum.moviereviewplatform.comment;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends MongoRepository<Comment, ObjectId> {
    Optional<List<Comment>> findByMovieid(ObjectId movieId);
}
