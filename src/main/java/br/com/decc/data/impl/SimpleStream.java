package br.com.decc.data.impl;

import br.com.decc.data.Stream;

public class SimpleStream implements Stream {

	private int index;
	private String input;

	public SimpleStream(String input) {
		this.index = 0;
		this.input = input==null?"":input;
	}

	@Override
	public char getNext() {
		return this.input.charAt(this.index++);
	}

	@Override
	public boolean hasNext() {
		return this.index < this.input.length();
	}
}
