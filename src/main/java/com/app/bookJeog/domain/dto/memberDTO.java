package com.app.bookJeog.domain.dto;

import com.app.bookJeog.domain.enumeration.MemberType;
import com.app.bookJeog.domain.vo.FollowVO;
import com.app.bookJeog.domain.vo.MemberVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class memberDTO {
    @EqualsAndHashCode.Include
    private Long id;
    private MemberType memberType;

    public MemberVO toVO() {
        return MemberVO.builder()
                .id(id)
                .memberType(memberType)
                .build();

    }

}
