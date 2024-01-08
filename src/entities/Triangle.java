package entities;

public class Triangle {
   public double a;
   public double b;
   public double c;

   public double areaTriangulo() {
       double p = (a + b + c) / 2.0;
       double area = 0;
       if (p - a < 0 || p - b < 0 || p - c < 0) {
           System.out.println("Os valores que vc inseriu resultam em um valor negativo, na formula de Heron usamos a raiz quadrada pra calcular o valor da area, e não existe raiz quadrada de numero negativo");
       } else {
           area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
       }
       return area;
   }

}
