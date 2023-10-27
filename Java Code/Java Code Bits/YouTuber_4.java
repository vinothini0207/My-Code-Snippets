package com.let_code_kaushik;

public class YouTuber_4 {
    //accessModifier returnType methodName(parameter){ }
	// used to perform some actions
	
	
	public void createVideo(){
		System.out.println("Video created.");
	}
	
	private boolean uploadVideo() {
		System.out.println("Uploading");
		return true;
	}
	
	public String shareVideo() {
		return "facebook";
	}
	public static void main(String[] args) {
		YouTuber_4 yt=new YouTuber_4();
		yt.uploadVideo();
	}
	
}
