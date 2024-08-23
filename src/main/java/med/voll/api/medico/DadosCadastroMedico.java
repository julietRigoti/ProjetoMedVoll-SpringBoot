package med.voll.api.medico;

import med.voll.api.pessoa.DadosPessoa;
import med.voll.api.pessoa.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
    static DadosPessoa medico = new DadosPessoa();
    medico.setNome(nome);
    medico.setEmail(email);
}
