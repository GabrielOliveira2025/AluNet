package com.example.alunetteste;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class BancoControllerUsuarios {
    private SQLiteDatabase db;
    private CriaBanco banco;


    public BancoControllerUsuarios(Context context) {
        banco = new CriaBanco(context);
    }


    public String insereDados(String _nome, String _cpf, String _email, String _senha ) {
        ContentValues valores;
        long resultado;
        db = banco.getWritableDatabase();


        valores = new ContentValues();
        valores.put("nome", _nome);
        valores.put("cpf", _cpf);
        valores.put("email", _email);
        valores.put("senha", _senha);


        resultado = db.insert("usuarios", null, valores);
        db.close();


        if (resultado == -1)
            return "Erro ao efetuar o Cadastre-se";
        else
            return "Cadastro efetuado com sucesso";
    }
}
