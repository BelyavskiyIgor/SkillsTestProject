package ru.belyavskiy.skills.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("questions")
public class Question {

    @PrimaryKeyColumn(
            name = "id",
            ordinal = 2,
            type = PrimaryKeyType.PARTITIONED,
            ordering = Ordering.DESCENDING
    )
    @Getter
    @Setter
    private Long id;

    @Column
    @Getter
    @Setter
    private String question;

    @Column
    @Getter
    @Setter
    private String answer;
}
