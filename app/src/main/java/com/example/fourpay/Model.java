package com.example.fourpay;

import android.provider.ContactsContract;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Model {
    String size;
    String mimeType;
    ArrayList<text> text;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public ArrayList<Model.text> getText() {
        return text;
    }

    public void setText(ArrayList<Model.text> text) {
        this.text = text;
    }

    public class text{
        String id;
        String cpf;
        String nome;
        String dataNascimento;
        String endereco;
        String bairro;
        String cidade;
        String estado;
        String numero;
        String cep;
        String emaill;
        String telefone;
        String tipo;
        String dataString;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getEmaill() {
            return emaill;
        }

        public void setEmaill(String emaill) {
            this.emaill = emaill;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getDataString() {
            return dataString;
        }

        public void setDataString(String dataString) {
            this.dataString = dataString;
        }
    }

}

