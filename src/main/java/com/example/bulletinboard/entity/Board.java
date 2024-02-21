package com.example.bulletinboard.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

// エンティティとして機能させる
@Entity
// 対応テーブルの記述
@Table(name = "board")
// ゲッターセッターの自動生成
@Data
public class Board {
	//主キーの設定
	@Id
	// AUTO_INCREMENTを指定したカラムを利用して値を生成
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// 対応するカラム名の指定
	@Column(name = "post_id")
	private Integer postId;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id" )
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "rank_id", referencedColumnName = "rank_id")
	private Rank rank;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private Timestamp updatedAt;
}
