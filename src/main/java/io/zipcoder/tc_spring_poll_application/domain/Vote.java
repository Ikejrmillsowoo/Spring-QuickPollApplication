package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VOTE_ID")
    private Long id;

    @ManyToMany
    @JoinColumn(name = "VOTE_ID")
    private List<Option> options;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Option> getOption() {
        return options;
    }

    public void setOption(Option option) {
        this.options.add(option);
    }

}
