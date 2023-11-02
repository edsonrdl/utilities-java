package temporizador;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
     private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
     
    public void exibirMensagem(String texto){
        String mensagem=texto;
        System.out.printf("Está é a mensagem %d",mensagem);
     
    }
    public void temporizador(){
     scheduler.schedule(() -> {
        exibirMensagem("Olá,mundo");
    }, 10, TimeUnit.SECONDS);
    
    }
    
    
}
