package br.com.alura.aluraflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.aluraflix.dto.VideoDto;
import br.com.alura.aluraflix.model.Video;
import br.com.alura.aluraflix.repository.VideoRepository;

@RestController
public class VideosController {
	
	@Autowired
	private VideoRepository videoRepository;
	
	@GetMapping("/videos")
	public List<VideoDto> getAllVideos() {
		List<Video> videos = videoRepository.findAll();
		return VideoDto.converter(videos);
	}
}
