package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.*;

@Entity
public class Vote {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long id;

    @ManyToMany
    @JoinColumn(name = "VOTE_ID")
    private Option option;

}
