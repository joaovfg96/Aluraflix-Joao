package br.com.alura.aluraflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.aluraflix.dto.VideoDto;
import br.com.alura.aluraflix.service.VideoService;

@RestController
public class VideosController {
	
	@Autowired
	private VideoService videoService;
	
	@GetMapping("/videos")
	public List<VideoDto> getAllVideos() {
		List<VideoDto> videos = videoService.getAll();
		return videos;
	}
	
	@GetMapping("/videos/{id}")
	public VideoDto getVideo(@PathVariable Long id) {
		return videoService.findById(id);
	}
}
