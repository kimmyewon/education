package com.mobius.education.mapper;

import com.mobius.education.domain.vo.LectureVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LectureMapper {

    //진행 예정 강의 개수
    public int selectExpected();

    //진행 완료 강의 개수
    public int selectFinished();

    //진행중 강의 개수
    public int selectOngoing();

    //강의 신청
    public void insert(LectureVO lectureVO);

}
