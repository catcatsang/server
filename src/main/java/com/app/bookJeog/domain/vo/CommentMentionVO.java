package com.app.bookJeog.domain.vo;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CommentMentionVO extends Period {
    @EqualsAndHashCode.Include
    private Long id;
    private Long memberId;
    private Long mentionMemberId;


    @Builder
    public CommentMentionVO(String createdDate, String updatedDate, Long id, Long memberId, Long mentionMemberId) {
        super(createdDate, updatedDate);
        this.id = id;
        this.memberId = memberId;
        this.mentionMemberId = mentionMemberId;
    }
}
