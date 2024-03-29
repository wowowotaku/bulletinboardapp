package com.example.bulletinboard.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bulletinboard.entity.Board;
import com.example.bulletinboard.repository.BoardRepository;

@Controller
@RequestMapping("/admin/board")
public class AdminBoardController {
	private final BoardRepository boardRepository;
	
	public AdminBoardController(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
	@GetMapping
	public String index(Model model, @PageableDefault(page = 0, size = 10, sort = "PostId", direction = Direction.ASC) Pageable pageable, @RequestParam(name="keyword", required = false)String keyword) {
		Page<Board> boardPage;
		
		if(keyword != null && !keyword.isEmpty()) {
			boardPage = boardRepository.findByContentLike("%" +keyword+ "%", pageable);
		}else {
			boardPage = boardRepository.findAll(pageable);
		}
		
		model.addAttribute("boardPage", boardPage);
		model.addAttribute("keyword", keyword);
		
		return "admin/board/index";
	}
	
	@GetMapping("/{id}")
	public String show(@PathVariable(name = "id") Integer id, Model model) {
		Board board = boardRepository.getReferenceById(id);
		
		model.addAttribute("board", board);
		
		return "admin/board/show";
	}
	
	@PostMapping("/delete/{postId}")
	public String delete(@PathVariable("postId") Integer postId) {
		boardRepository.deleteById(postId);
		return "redirect:/admin/board";
	}

}
