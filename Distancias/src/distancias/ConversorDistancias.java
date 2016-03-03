package distancias;

public class ConversorDistancias {

		public static double conversorPiesToMetros(double pies){
			return pies * 0.3048;
		}
		
		public static double conversorMetrosToPies(double metros){
			return metros * 3.2808;
		}
		
		public static double conversorPiesToPulgadas(double pies){
			return pies * 12;
		}
		
		public static double conversorPulgadasToPies(double pulgadas){
			return pulgadas / 12;
		}
		
		public static double conversorCmToPies(double cm){
			return conversorMetrosToPies(cm / 100);
		}
		
		public static double conversorPiesToCm(double pies){
			return conversorPiesToMetros(pies) * 100;
		}
		
		public static double conversorCmToPulgadas(double cm){
			return conversorPiesToPulgadas(conversorCmToPies(cm));
		}
		
		public static double conversorPulgadasToCm(double pulgadas){
			return conversorPiesToCm(conversorPulgadasToPies(pulgadas));
		}
}
