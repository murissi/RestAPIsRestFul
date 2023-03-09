package br.com.projeto01;

public class Greeting {
	private final Long id;
	private final String content;
	
	public Greeting(String content, Long id) {
		super();
		this.content = content;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
