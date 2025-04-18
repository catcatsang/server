package com.app.bookJeog.domain.vo;

import com.app.bookJeog.domain.enumeration.AlarmStatus;
import com.app.bookJeog.domain.enumeration.BookPostStatus;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AlarmVO extends Period {
    @EqualsAndHashCode.Include
    private Long id;
    private Long alarmReceiverId;
    private AlarmStatus alarmStatus;



    @Builder
    public AlarmVO(String createdDate, String updatedDate, Long alarmReceiverId, AlarmStatus alarmStatus, Long id) {
        super(createdDate, updatedDate);
        this.alarmReceiverId = alarmReceiverId;
        this.alarmStatus = alarmStatus;
        this.id = id;
    }
}
