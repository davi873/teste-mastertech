package br.com.teste.controller.dto;

import br.com.teste.model.Ponto;

import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class PontoDTO {

    private Map<Date, List<Ponto>> mpPonto;
    private float totalHours = 0;
    private String name;


    public PontoDTO(List<Ponto> lsPonto){
        //Agrupa os pontos por dia
        Map<Date, List<Ponto>> mpGroupByDay = lsPonto.stream().collect(Collectors.groupingBy(e ->
                Date.from(e.getDateRegister().toInstant().truncatedTo(ChronoUnit.DAYS)), TreeMap::new, Collectors.toList())
        );
        this.mpPonto = mpGroupByDay;

        //Faz o calculo de horas trabalhadas por dia
        mpGroupByDay.forEach((date, lPonto) -> {
            try {
                List<Date> lsCheckIn = new ArrayList<>();
                List<Date> lsCheckOut = new ArrayList<>();

                lPonto.forEach(ponto ->{
                    if (ponto.getRegister() == 'E'){
                        lsCheckIn.add(ponto.getDateRegister());
                    } else if (ponto.getRegister() == 'S') {
                        lsCheckOut.add(ponto.getDateRegister());
                    }
                    this.name = ponto.getUser().getName();
                });

                for(int i = 0; i < lsCheckIn.size(); i++){
                    long diffInMillies = lsCheckOut.get(i).getTime() - lsCheckIn.get(i).getTime();
                    float minutesWorked = (float) TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
                    this.totalHours =   (minutesWorked / 60);
                }
            }catch (Exception e){
                throw e;
            }
        });

    }

    public Map<Date, List<Ponto>>  getLsPonto() {
        return mpPonto;
    }

    public void setLsPonto(Map<Date, List<Ponto>>  mpPonto) {
        this.mpPonto = mpPonto;
    }

    public float getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(float totalHours) {
        this.totalHours = totalHours;
    }
}
