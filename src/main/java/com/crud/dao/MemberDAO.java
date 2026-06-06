package com.crud.dao;

import com.crud.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDAO {
    public int registMember(MemberVO member);
}
