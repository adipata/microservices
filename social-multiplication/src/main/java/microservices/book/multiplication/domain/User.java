package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public class User {
    @javax.persistence.Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long Id;

    private final String alias;

    protected User(){
        alias=null;
    }
}
