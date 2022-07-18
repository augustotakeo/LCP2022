package com.batalha.pokemon;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.batalha.pokemon.Models.Pokemon;

public class Batalha extends JFrame {

	private Pokemon P1, P2;
	
	private JLabel Lb1, Lb2, Linha1, Linha2;
	private JButton Ataque1, Ataque2, Especial1, Especial2;
	
	private int Vez = 0;
	
	public Batalha(Pokemon p1, Pokemon p2) {
		super("Batalha Pokemon");
		setLayout(new FlowLayout());
		
		this.P1 = p1;
		this.P2 = p2;
		
		MostrarDados(p1, true);
		MostrarDados(p2, false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(200, 100, 1000, 500);
		setVisible(true);
	}
	
	public void MostrarDados(Pokemon p, boolean primeiro) {
		if(primeiro) {
			Lb1 = new JLabel(p.toString());
			add(Lb1);
				
			if(this.EhPrimeiro()) {
				Ataque1 = new JButton("Atacar");
				Ataque1.setBounds(200, 100, 100, 100);
				add(Ataque1);
				Ataque1.addMouseListener(new Ataque(primeiro, false));
				
				Especial1 = new JButton("Especial");
				Especial1.setBounds(200, 100, 100, 100);
				add(Especial1);
				Especial1.addMouseListener(new Ataque(primeiro, true));
			}
			Linha1 = new JLabel("                                        ");
			add(Linha1);
		}else {
			Lb2 = new JLabel(p.toString());
			add(Lb2);
			
			if(this.EhPrimeiro() == false) {
				Ataque2 = new JButton("Atacar");
				Ataque2.setBounds(200, 100, 100, 100);
				add(Ataque2);
				Ataque2.addMouseListener(new Ataque(primeiro, false));
				
				Especial2 = new JButton("Especial");
				Especial2.setBounds(200, 100, 100, 100);
				add(Especial2);
				Especial2.addMouseListener(new Ataque(primeiro, true));
			}
			
			Linha2 = new JLabel("                                        ");
			add(Linha2);
		}
	}
	
	private void Limpar() {
		remove(Lb1);
		remove(Lb2);
		remove(Linha1);
		remove(Linha2);
		if(this.EhPrimeiro()) {
			remove(Ataque1);
			remove(Especial1);
		}else {
			remove(Ataque2);
			remove(Especial2);
		}
		repaint();
		revalidate();
	}
	
	private void Renderizar() {
		Limpar();
		
		this.Vez++;
		MostrarDados(P1, true);
		MostrarDados(P2, false);
		
		repaint();
		revalidate();
	}
	
	private void Vencedor() {
		Limpar();
		
		Lb1 = new JLabel(P1.toString());
		add(Lb1);
		Lb2 = new JLabel(P2.toString());
		add(Lb2);
		
		repaint();
		revalidate();
		
		String msg = "";
		if(P1.getVida() > 0)
			msg = P1.getNome();
		else if(P2.getVida() > 0)
			msg = P2.getNome();
		
		msg += " venceu a partida";
		
		JLabel vencedor = new JLabel(msg);
		add(vencedor);
		
		repaint();
		revalidate();
	}
	
	private boolean EhPrimeiro() {
		return this.Vez % 2 == 0;
	}
	
	public class Ataque implements MouseListener{

		private boolean Primeiro;
		private boolean Especial;
		
		public Ataque(boolean primeiro, boolean especial) {
			this.Primeiro = primeiro;
			this.Especial = especial;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			Pokemon ataca, recebe;
			
			if(this.Primeiro) {
				ataca = P1;
				recebe = P2;
			}else {
				ataca = P2;
				recebe = P1;
			}
			
			if(this.Especial) {
				recebe.RecebeEspecial(ataca);
			}else {
				recebe.RecebeAtaque(ataca);
			}
			
			if(P1.getVida() > 0 && P2.getVida() > 0)
				Renderizar();
			else
				Vencedor();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}
		
	}
	
}



















