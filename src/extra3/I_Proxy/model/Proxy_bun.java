package extra3.I_Proxy.model;

public class Proxy_bun implements ISistem{

        private ISistem sistem;

    public Proxy_bun(ISistem sistem) {
        this.sistem = sistem;
    }

    @Override
        public String getModel() {
            return sistem.getModel();
        }

        @Override
        public void pornesteProgram() {
            AerConditionat acReal = (AerConditionat) sistem;
            if((acReal.isAreCurent() && acReal.isAreFreon()) ||acReal.isAreCurent() || acReal.isAreFreon()  ){
                System.out.println("Programul a pornit");
            }else{
                System.out.println("Programul nu a pornit");
            }
        }

        @Override
        public void seteazaProgram() {

        }

        @Override
        public void finalizareProgram() {

        }


}
