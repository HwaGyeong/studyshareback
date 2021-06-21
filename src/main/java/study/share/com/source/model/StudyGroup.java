package study.share.com.source.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import study.share.com.source.model.common.DateAudit;

import javax.persistence.*;

@Entity
@Table(name = "study_group")
@Getter
@Setter
public class StudyGroup extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "member_limit")
    private long memberLimit;
    @Column(name = "title")
    private String title;
    @Column(name = "introduce")
    private String introduce;
    @Column(name = "join_verified")
    @ColumnDefault("1")
    private boolean joinVerified;
    @Column(name = "recruit_status")
    @ColumnDefault("1")
    private boolean recruitStatus;
    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id")
    private User owner;

}
