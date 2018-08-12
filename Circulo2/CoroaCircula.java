abstract class CoroaCircula {
        private float MaioRaio;
        private float MenoRaio;

        public CoroaCircula(float MaioRaio, float MenoRaio) {
            this.MaioRaio = MaioRaio;
            this.MenoRaio = MenoRaio;
        }
        
        public void setMaioRaio(float MaioRaio) {this.MaioRaio = MaioRaio;}
        public float getMaioRaio() {return this.MaioRaio;}
        public void setMenoRaio(float MenoRaio) {this.MenoRaio = MenoRaio;}
        public float getMenoRaio() {return this.MenoRaio;}

        public float diametro() {
            return (2 * (this.MaioRaio - MenoRaio));
        }

        public float area() {
            return (float)(Math.PI * (Math.pow(MaioRaio, 2) - Math.pow(MenoRaio, 2)));
        }
        public float perimetroExterno() {
            return (float)(2 * Math.PI * this.MaioRaio);
        }
        public float perimetroInterno() {
            return (float)(2 * Math.PI * this.MenoRaio);
        }

        public void mostrarDados() {
            System.out.println("<o> Maior Raio: " + this.MaioRaio + " <|> "+
            "Menor raio: " + this.MenoRaio + " <|> " +
            "Diamentro: " + this.diametro() + " <|> " +
            "Area: " + this.area()  + " <|> " +
            "PerimetroExterno: "+ this.perimetroExterno() + " <|> " +
            "PerimetroInterno: "+ this.perimetroInterno() + " <o> "
            );
        }
}