package med.voll.api.medico;

import med.voll.api.Service.Especialidade;

public record DadosListageMedico(String nome, String email, String crm, Especialidade especialidade) {
}