package net.instituto.desa;

public class Jugador {
	int y, x;
	
	public void Abajo() {
		setY(getY() + 1);
	}
	public void Arriba() {
		setY(getY() - 1);
	}
	public void Derecha() {
		setX(getX() + 1);
	}
	public void Izquierda() {
		setX(getX() - 1);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
