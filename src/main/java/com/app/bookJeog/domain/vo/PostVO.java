package com.app.bookJeog.domain.vo;

import com.app.bookJeog.domain.enumeration.PostType;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PostVO extends Period {
    @EqualsAndHashCode.Include
    private Long id;
    private Long memberId ;
    private PostType postType;


    @Builder
    public PostVO(String createdDate, String updatedDate, Long id, Long memberId, PostType postType) {
        super(createdDate, updatedDate);
        this.id = id;
        this.memberId = memberId;
        this.postType = postType;
    }
}
