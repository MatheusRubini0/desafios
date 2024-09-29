package desafioBibliotecaShaulin;

import java.util.Objects;

public class Lend {
		private String Data;
		private Student nome;
		
		public Lend(String data) {
			Data = data;

		}
		
		public String getData() {
			return Data;
		}

		public void setData(String data) {
			Data = data;
		}

		@Override
		public int hashCode() {
			return Objects.hash(Data, nome);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Lend other = (Lend) obj;
			return Objects.equals(Data, other.Data) && Objects.equals(nome, other.nome);
		}	
		
		

}
		

