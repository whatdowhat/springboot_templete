package com.keep.going.repository;

import org.springframework.data.repository.CrudRepository;

import com.keep.going.vo.Member;

public interface MemberRepository extends CrudRepository<Member, String>{

}
