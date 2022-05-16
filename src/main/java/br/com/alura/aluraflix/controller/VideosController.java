package br.com.alura.aluraflix.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.aluraflix.model.Video;

@Controller
public class VideosController {
	
	@RequestMapping("/videos")
	@ResponseBody
	public List<Video> getAllVideos() {
		Video video = new Video("Teste", "teste teste", "teste.com");
		
		return Arrays.asList(video, video, video);
	}
}
