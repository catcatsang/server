package com.app.bookJeog.domain.vo;

import com.app.bookJeog.domain.enumeration.AlarmStatus;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FollowAlarmVO extends AlarmVO {
    @EqualsAndHashCode.Include
    private Long id;
    private Long alarmSenderId;

    @Builder
    public FollowAlarmVO(String createdDate, String updatedDate, Long alarmReceiverId, AlarmStatus alarmStatus, Long id, Long alarmSenderId, Long id1) {
        super(createdDate, updatedDate, alarmReceiverId, alarmStatus, id);
        this.alarmSenderId = alarmSenderId;
        this.id = id1;
    }
}
