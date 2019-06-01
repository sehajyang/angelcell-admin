package com.angelhack.angelcell.domain.home;

import com.angelhack.angelcell.domain.BaseTimeEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Message extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @JsonProperty("num")
    @ManyToOne
    private Users num;

    private String uuid;

    private String msg;

    private String host;

    @Builder
    public Message(Users num, String uuid, String host, String msg) {
        this.num = num;
        this.uuid = uuid;
        this.host = host;
        this.msg = msg;
    }
}
