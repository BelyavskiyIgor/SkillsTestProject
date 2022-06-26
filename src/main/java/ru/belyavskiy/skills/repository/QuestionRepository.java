package ru.belyavskiy.skills.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.belyavskiy.skills.entity.Question;

@Repository
public interface QuestionRepository extends CassandraRepository<Question, Long> {

}
