package com.angelhack.angelcell.domain.home;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

    @ManyToOne
    private Users uuid;

    private String msg;

    private String host;

    @Builder
    public Message(Users uuid, String host, String msg) {
        this.uuid = uuid;
        this.host = host;
        this.msg = msg;
    }
}