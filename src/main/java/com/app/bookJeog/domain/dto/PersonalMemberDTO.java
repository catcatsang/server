package com.app.bookJeog.domain.dto;

import com.app.bookJeog.domain.enumeration.PersonalMemberStatus;
import com.app.bookJeog.domain.vo.PersonalMemberVO;
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
public class PersonalMemberDTO {
    @EqualsAndHashCode.Include
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberPhone;
    private String memberNickName;
    private String memberBirth;
    private int memberMileage;
    private String memberGender;
    private PersonalMemberStatus memberStatus;

    public PersonalMemberVO toVO() {
        return PersonalMemberVO.builder()
                .id(id).
                memberEmail(memberEmail).
                memberPassword(memberPassword).
                memberName(memberName).
                memberPhone(memberPhone).
                memberNickName(memberNickName).
                memberBirth(memberBirth).
                memberMileage(memberMileage).
                memberGender(memberGender).
                memberStatus(memberStatus).
                build();
    }

}
