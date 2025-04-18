package com.app.bookJeog.domain.vo;

import com.app.bookJeog.domain.enumeration.BookPostStatus;
import com.app.bookJeog.domain.enumeration.PostType;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class NormalBookPostVO extends PostVO {
    @EqualsAndHashCode.Include
    private Long id;
    private Long bookId;

    @Builder
    public NormalBookPostVO(String createdDate, String updatedDate, Long id, Long memberId, PostType postType, Long bookId, Long id1) {
        super(createdDate, updatedDate, id, memberId, postType);
        this.bookId = bookId;
        this.id = id1;
    }
}
