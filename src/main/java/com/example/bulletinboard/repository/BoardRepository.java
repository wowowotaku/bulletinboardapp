package com.example.bulletinboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bulletinboard.entity.Board;

// JpaRepositoryの継承 CRUD操作のメソッドお手軽に使えるよ
// 引数の指定は<エンティティのクラス型, 主キーのデータ型>
public interface BoardRepository extends JpaRepository<Board, Integer>{
	public Page<Board> findByContentLike(String keyword, Pageable pageable);
}
