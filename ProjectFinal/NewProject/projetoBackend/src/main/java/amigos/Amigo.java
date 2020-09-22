package amigos;

public class Amigo {
    private String nome;
    private String telefone;
    //private String telefoneCelular;
    private String email;
    private String apelido;
    private Integer id;

    public Amigo() {
    }

    public Amigo(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        //this.telefoneCelular = telefoneCelular;
        this.email = email;
    }
    

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

   /* public String getTelefoneCelular() {

        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {

        this.telefoneCelular = telefoneCelular;
    }*/

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getApelido() {

        return apelido;
    }

    public void setApelido(String apelido) {

        this.apelido = apelido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }
}
