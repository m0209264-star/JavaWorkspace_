package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {

		try {
			String serviceKey = "SuGHKTyS5xws4ro3J1nMRm6LyxrwhtBPEL1PoGQnM0KwbRvfzFEdP4Rbd44ozBzcFOPBUvc%2F%2BwDnsRiNHxof8g%3D%3D";
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
			String stationName = URLEncoder.encode("종로구", "UTF-8");
			String dataTerm = "DAILY";

			serviceUrl += "?serviceKey=" + serviceKey;
			serviceUrl += "&stationName=" + stationName;
			serviceUrl += "&dataTerm=" + dataTerm;

			System.out.println(serviceUrl);

			URL url = new URL(serviceUrl);
			
			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(url.openConnection().getInputStream()))) {
				
				String line = null;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}