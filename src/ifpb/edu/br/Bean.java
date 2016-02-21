package ifpb.edu.br;
import javax.faces.bean.ManagedBean;
	
	@ManagedBean
	public class Bean {
		private String campo1;
		private String campo2;
		public String auxiliar;
		
		public String getCampo1() {
			return campo1;}

		public void setCampo1(String Campo1){
			this.campo1 = campo1;
		}

		public String getCampo2() {
			return campo2;
		}

		public void setNome2(String Campo2) {
			this.campo2 = campo2;
		}

		public void trocarValores(){
			auxiliar = campo1;
			campo1 = campo2;
			campo2 = auxiliar ;
			return ;
		}

	}


