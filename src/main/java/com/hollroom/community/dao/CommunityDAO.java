package com.hollroom.community.dao;

import com.hollroom.common.TabType;
import com.hollroom.community.domain.dto.CommunityPagingEntityDTO;
import com.hollroom.community.domain.entity.AttachFileEntity;
import com.hollroom.community.domain.entity.CommentsEntity;
import com.hollroom.community.domain.entity.CommunityEntity;

import java.util.List;

public interface CommunityDAO {
    //게시글등록
    Long insert(CommunityEntity entity);
    //첨부파일 등록 - 문제가 있음
//    void insertFile(List<AttachFileEntity> fileEntityList);
    // 해당 게시글의 첨부파일 등록
    void insertFile(AttachFileEntity entity);
    //페이징처리된 모든 게시글 목록 보기
    CommunityPagingEntityDTO pagingFindAll(String page);

    //페이징처리된 카테고리별 게시글 목록 보기
    CommunityPagingEntityDTO pagingFindCategory(String category, String page);

    CommunityEntity findById(Long postId);

    List<AttachFileEntity> getFiles(Long postId, TabType tab);

    //조회수 변경
    void updateViewCounting(Long postId);

    //게시글 수정
    void update(CommunityEntity entity);

    //게시글 삭제(비활성화)
    void delete(Long postId);

    //해당 게시글 댓글 등록
    void commentInsert(CommentsEntity commentsEntity);

    //해당 게시글 댓글 모두 불러오기
    List<CommentsEntity> getComments(Long postId);

    //해당 댓글 수정
    void commentUpdate(CommentsEntity commentsEntity);

    //해당 댓글 삭제(비활성화)
    void commentDelete(Long commentId);


}
