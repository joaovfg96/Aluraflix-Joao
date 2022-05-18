package br.com.alura.aluraflix.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.aluraflix.model.Video;

public class VideoDto {

	private Long id;
	private String titulo;
	private String descricao;
	private String url;
	
	public VideoDto() {
	}

	public VideoDto(Video video) {
		this.id = video.getId();
		this.titulo = video.getTitulo();
		this.descricao = video.getDescricao();
		this.url = video.getUrl();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getUrl() {
		return url;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static VideoDto converter(Video video) {
		VideoDto videoDTO = new VideoDto();
		videoDTO.setId(video.getId());
		videoDTO.setTitulo(video.getTitulo());
		videoDTO.setDescricao(video.getDescricao());
		videoDTO.setUrl(video.getUrl());
		return videoDTO;
	}

	public static List<VideoDto> converterLista(List<Video> videos) {
		return videos.stream().map(VideoDto::new).collect(Collectors.toList());
	}
	
}
