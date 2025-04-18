package com.app.bookJeog.domain.vo;

import com.app.bookJeog.domain.enumeration.PostType;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DonateCertVO extends PostVO {
    @EqualsAndHashCode.Include
    private Long id;
    private String donateCertTitle;
    private String donateCertText;


    @Builder
    public DonateCertVO(String createdDate, String updatedDate, Long id, Long memberId, PostType postType, String donateCertText, String donateCertTitle, Long id1) {
        super(createdDate, updatedDate, id, memberId, postType);
        this.donateCertText = donateCertText;
        this.donateCertTitle = donateCertTitle;
        this.id = id1;
    }
}
