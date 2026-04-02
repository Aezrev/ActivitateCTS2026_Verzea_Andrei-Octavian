package clase;

public class AgentieFactory {
    public PachetTuristic createPachet(TipPachet tipPachet) throws Exception{
        switch (tipPachet){
            case cazare:
                return new PachetCazare();
            case transport:
                return new PachetTransport();
            case cazareTransport:
                return new PachetCazareTransport();
            default:
                throw new Exception("Tip incorect");
        }

    }
}
